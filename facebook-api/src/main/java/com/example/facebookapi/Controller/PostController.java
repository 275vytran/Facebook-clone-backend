package com.example.facebookapi.Controller;

import java.util.List;
import java.util.UUID;

import com.example.facebookapi.Entity.Post;
import com.example.facebookapi.Service.PostService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/postService")
public class PostController {

    @Autowired
    PostService postService;

    @PostMapping("/save")
    public List<Post> submitPost(@RequestBody Post body){
        List<Post> result = postService.submitPostToDB(body);
        return result; 
    }

    @GetMapping("/getPost")
    public List<Post> retrieveAllPost(){
        List<Post> result = postService.retrievePostFromDB();
        return result; 
    }

    @DeleteMapping("/delete/{postId}")
    public List<Post> deleteParticularPost(@PathVariable("postId") UUID postID){
        List<Post> result = postService.deletePostFromDB(postID);
        return result; 
    }
}

