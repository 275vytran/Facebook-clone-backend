package com.example.facebookapi.Service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import com.example.facebookapi.Entity.Post;
import com.example.facebookapi.Repository.PostRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {

    @Autowired
    PostRepo postRepo;

    public List<Post> submitPostToDB(Post postData){
        Date date = new Date();
        long time = date.getTime();
        Timestamp dateTime = new Timestamp(time);

        postData.setPostID(UUID.randomUUID());
        postData.setLikes(0);
        postData.setDateTime(dateTime);
        postRepo.save(postData);
        List<Post> result = retrievePostFromDB();
        return result;
    }

    public List<Post> retrievePostFromDB(){
        List<Post> result = postRepo.findAll();
        return result;
    }

    public List<Post> deletePostFromDB(UUID postID){
        postRepo.deleteById(postID);
        List<Post> result = retrievePostFromDB();
        return result;
    }
}

