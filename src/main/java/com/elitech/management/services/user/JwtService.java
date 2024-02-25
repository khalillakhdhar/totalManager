package com.elitech.management.services.user;

import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class JwtService {
	private static final String SECRET="nRXK1#^5y8XfwctAwdEm";
	private final UserService userService;
	public String generateToken(String userName)
	{
		Map<String, Object> claims=new  HashMap<String, Object>();
		return Jwts.builder()
				.setClaims(claims)
				.setSubject(userName)
				.setIssuedAt(new Date(System.currentTimeMillis()))
				.setExpiration(new Date(System.currentTimeMillis()+1000*60*30))
				.signWith(getSignKey(),SignatureAlgorithm.HS256).compact();
	}
public Key getSignKey()
{
	byte[] keyBytes= Decoders.BASE64.decode(SECRET);
	return Keys.hmacShaKeyFor(keyBytes);
	}
private <T> T extractClaim(String token,Function<Claims,T> claimResolver)
{
final Claims claims=extractAllClaims(token);
return claimResolver.apply(claims);
}
private Claims extractAllClaims(String token)
{
return Jwts.parserBuilder()
		.setSigningKey(getSignKey())
		.build()
		.parseClaimsJws(token)
		.getBody();

}
public Boolean validateToken(String token,UserDetails userDetails)
{
	String userName=extractUsername(token);
	return (userName.equals(userDetails.getUsername())&&!isTokenExpired(token));
	

}
public Date extractExpiration(String token)
{
return extractClaim(token, Claims::getExpiration);	
}
private boolean isTokenExpired(String token)
{
return extractExpiration(token).before(new Date());	
}


public String extractUsername(String token)
{
	return extractClaim(token, Claims::getSubject);
	
}
}
