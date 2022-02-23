package com.springboot.springrestapi;
import java.util.*;

public class DataSet {
    HashMap<String,String> user;

    DataSet(){
        user = new HashMap<>();
        user.put("message", "no data found");
    }

    DataSet(String name,String userid,Integer age,String gender,String nationality){
        user = new HashMap<>();
        user.put("Name","Ayush Kumar");
        user.put("UID",userid);
        user.put("age","21");
        user.put("gender","male");
        user.put("nationality","Indian");
    }

    public HashMap<String,String> getUserData(){
        return user;
    }

    public void SetUserData(String name,String userid,Integer age,String gender,String nationality) {
        user = new HashMap<>();
        user.put("Name","Ayush Kumar");
        user.put("UID",userid);
        user.put("age","21");
        user.put("gender","male");
        user.put("nationality","Indian");
    }

    public String getUserId() {
        return user.get("UID");
    }
}
