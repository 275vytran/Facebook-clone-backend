package com.example.facebookapi.Repository;

import java.util.List;

import org.springframework.data.cassandra.repository.CassandraRepository;

import com.example.facebookapi.Entity.User;

//                                                entity - primary key
public interface UserRepo extends CassandraRepository<User, String> {

	User save(User user);
	List<User> findAll();
	User findAllByuserID(String userID);
	
}
