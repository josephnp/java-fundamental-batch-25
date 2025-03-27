package org.example;

public class User{
    protected String name;
    protected String username;
    protected String email;
    protected PhoneNumber phoneNumber;
    protected Address address;

    protected Boolean isLogin;

    public User(String name, String email, PhoneNumber phoneNumber, Address address){
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    void login(){
        this.isLogin = true;
    }
}
