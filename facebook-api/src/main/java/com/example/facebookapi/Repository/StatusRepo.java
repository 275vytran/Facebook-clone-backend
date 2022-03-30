package com.example.facebookapi.Repository;

import java.util.List;
import java.util.UUID;

import com.example.facebookapi.Entity.Status;

import org.springframework.data.cassandra.repository.CassandraRepository;

public interface StatusRepo extends CassandraRepository<Status, UUID> {
    Status save(Status status);
    List<Status> findAll();   
}
