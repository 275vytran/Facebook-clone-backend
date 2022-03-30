package com.example.facebookapi.Entity;

import java.sql.Timestamp;
import java.util.UUID;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table("Status")
public class Status {
    
    @PrimaryKey
    private UUID status;

    private UUID userID;
    private String statusImageURL;
    private Timestamp uploadTime;

    public Status(){
        super();
    }

    public Status(UUID status, UUID userID, String statusImageURL, Timestamp uploadTime) {
        this.status = status;
        this.userID = userID;
        this.statusImageURL = statusImageURL;
        this.uploadTime = uploadTime;
    }

    public UUID getStatus() {
        return status;
    }

    public void setStatus(UUID status) {
        this.status = status;
    }

    public UUID getUserID() {
        return userID;
    }

    public void setUserID(UUID userID) {
        this.userID = userID;
    }

    public String getStatusImageURL() {
        return statusImageURL;
    }

    public void setStatusImageURL(String statusImageURL) {
        this.statusImageURL = statusImageURL;
    }

    public Timestamp getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Timestamp uploadTime) {
        this.uploadTime = uploadTime;
    }

    
}
