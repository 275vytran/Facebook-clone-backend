package com.example.facebookapi.Repository;

import java.util.List;
import java.util.UUID;

import com.example.facebookapi.Entity.Post;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PostRepo extends CassandraRepository<Post, UUID> {
    //                                                      postId
    List<Post> findAll();
    Post save(Post post);
    void deleteById(UUID postID);
}
