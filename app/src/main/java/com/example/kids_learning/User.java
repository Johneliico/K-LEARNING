package com.example.kids_learning;

public class User {
    public String id, name, address, email, password;



    public User(String id, String name,String address,String email){
        this.id = id;
        this.name = name;
        this.address = address;
        this.email = email;
    }
    public User(){
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}
