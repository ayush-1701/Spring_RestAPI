package com.springboot.springrestapi;

import java.util.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/api")
public class Users {
    ArrayList<DataSet> users = new ArrayList<>();

    void populateUsers() {
        users.add(new DataSet("Aditi Shukla","100",21,"Female","Indian"));
        users.add(new DataSet("Ayush Singh","101",21,"Male","Indian"));
        users.add(new DataSet("Ben Tenison","102",42,"Male","American"));
        users.add(new DataSet("Xi Ping","103",29,"Male","Chinese"));
        users.add(new DataSet("Shiba","104",30,"Female","African"));
        users.add(new DataSet("Amina D.","105",7,"Female","Arabian"));
    }

    Users(){
        populateUsers();
    }

    @GetMapping(path="/details")
    public ArrayList<DataSet> getAllUsers() {
        return users;
    }

    @GetMapping(path="/details/{UID}")
    public DataSet getUserById(@PathVariable("UID") String id){
        for(DataSet user:users) {
            if(user.getUserId().equals(id)) {
                return user;
            }
        }
        return new DataSet();
    }

    @RequestMapping
    public String hello(){
        //System.out.println("Goto the Link: http://localhost:8080/api/details");
        return "Goto the Link: http://localhost:8080/api/details  and fetch UID and then click: http://localhost:8080/api/details/100";
    }
}


