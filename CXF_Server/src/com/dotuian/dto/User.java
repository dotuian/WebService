package com.dotuian.dto;

import java.io.Serializable;


public class User implements Serializable{

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    private int userid;
    private String username;
    private String password;

    public User(){
        
    }
    
    public User(int userid, String username, String password) {
        this.userid = userid;
        this.username = username;
        this.password = password;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
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

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("User [userid=");
        builder.append(this.userid);
        builder.append(", username=");
        builder.append(this.username);
        builder.append(", password=");
        builder.append(this.password);
        builder.append("]");
        return builder.toString();
    }
    
    
    public static void main(String[] args) {
        
        User user = new User();
        user.setUserid(1);
        user.setUsername("zhongjiwe");
        user.setPassword("test1234");

        System.out.println(user);
    }
}
