package com.example.facebookapi.Service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.facebookapi.Entity.Comment;
import com.example.facebookapi.Repository.CommentRepo;

@Service
public class CommentService {

	@Autowired
	CommentRepo commentRepo;
	
	@Autowired
	UserService userService;
	
	public Comment saveComment(Comment comment) {
		Date date=new Date();
		long time=date.getTime();
		Timestamp dateTime=new Timestamp(time);
		
		comment.setCommentID(UUID.randomUUID());
		comment.setTimestamp(dateTime);
		return commentRepo.save(comment);
	}
	
	public List<Comment> getAllComment(UUID postID){
		List<Comment> result = new ArrayList<Comment>();
		result = commentRepo.findAllByPostID(postID);
		return result;
	}
}