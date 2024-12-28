package com.wecp.progressive.entity;

public class User {
    private int user_id;
    private String full_name;
    private String username;
    private String password;
    private String email;
    private String role;
    public User(int user_id, String full_name, String username, String password, String email, String role) {
        this.user_id = user_id;
        this.full_name = full_name;
        this.username = username;
        this.password = password;
        this.email = email;
        this.role = role;
    }
    public User() {
    }
    public int getUser_id() {
        return user_id;
    }
    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }
    public String getFull_name() {
        return full_name;
    }
    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    

}