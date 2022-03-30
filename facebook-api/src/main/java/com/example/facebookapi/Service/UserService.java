package com.example.facebookapi.Service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.facebookapi.Entity.User;
import com.example.facebookapi.Repository.UserRepo;

@Service
public class UserService {

	@Autowired
	UserRepo userRepo;
		
	public User submitMetaDataOfUser(User user) {
		
		Date date=new Date();
		long time=date.getTime();
		Timestamp dateTime=new Timestamp(time);

        //user.setUserID(UUID.randomUUID());
		user.setActive(true);
		user.setJoiningDate(dateTime);
		
		return userRepo.save(user);
	}
	
	public List<User> retrieveAllUserDetails(){
		return userRepo.findAll();
	}
	
	public User getUserData(String userID) {
		return userRepo.findAllByuserID(userID);
	}
}