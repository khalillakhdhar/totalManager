package com.elitech.management.services.user;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.elitech.management.model.users.User;
import com.elitech.management.repo.UserRepository;

import lombok.RequiredArgsConstructor;
@Service
@RequiredArgsConstructor
public class UserService implements UserDetailsService, UserServiceInfo {

	@Autowired
	private  PasswordEncoder passwordEncoder;
	@Autowired
	private  UserRepository userRepository;
	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Optional<User> user=userRepository.findByEmail(username);
		
		return user.map(UserInfoDetails::new)
				.orElseThrow(()->new UsernameNotFoundException("user not found with "+username));
				
	}

	@Override
	public User getOneUser(String email) {
		// TODO Auto-generated method stub
		return userRepository.findByEmail(email).orElse(null);
	}

	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		return userRepository.save(user);
	}

	@Override
	public List<User> getAllUser() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public User getUser(long id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id).orElse(null);
	}

}
