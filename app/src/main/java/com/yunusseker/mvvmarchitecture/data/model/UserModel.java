package com.yunusseker.mvvmarchitecture.data.model;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by yunus.seker on 13.4.2018
 */

@Entity(tableName = "user")
public class UserModel {
    @SerializedName("token")
    @Expose
    private String token;
    @PrimaryKey
    @SerializedName("user_id")
    @NonNull
    private String userId;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("blog")
    @Expose
    private String blog;
    @SerializedName("company")
    @Expose
    private String company;
    @SerializedName("location")
    @Expose
    private String location;
    @SerializedName("bio")
    @Expose
    private String bio;

    @Ignore
    public UserModel(String name) {
        this.name = name;
    }

    public UserModel(String token, String userId, String name, String email, String blog, String company, String location, String bio) {
        this.token = token;
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.blog = blog;
        this.company = company;
        this.location = location;
        this.bio = bio;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBlog() {
        return blog;
    }

    public void setBlog(String blog) {
        this.blog = blog;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
}
