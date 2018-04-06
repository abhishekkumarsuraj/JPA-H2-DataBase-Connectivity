package com.suraj.jpaEx.jpaexample;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.suraj.jpaEx.jpaexample.entiry.User;
//import com.suraj.jpaEx.jpaexample.service.UserDAOService;
import com.suraj.jpaEx.jpaexample.service.UserRepository;

@Component
public class UserDaoServiceCommandLineRunner implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository;
	
	private static final Logger log=LoggerFactory.getLogger(UserDaoServiceCommandLineRunner.class);
	
	@Override
	public void run(String... args) throws Exception {
		
		User user=new User("Suraj","Admin");
		userRepository.save(user);
	 Optional<User> findById = userRepository.findById(1L);
		log.info("User retrived . "+findById);
		
		List<User> users=userRepository.findAll();
		
		log.info("All User : "+users);
		
	}
	

}
