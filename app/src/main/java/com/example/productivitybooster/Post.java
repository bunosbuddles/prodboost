package com.example.productivitybooster;

import com.parse.ParseClassName;
import com.parse.ParseObject;

import java.util.List;

@ParseClassName("Post")
public class Post extends ParseObject{
    public static final String KEY_USER = "user";
    public static final String KEY_LIST = "list";

    public String getUser(){
        return getString(KEY_USER);
    }

    public void setUser(ParseObject user){
        put(KEY_USER, user);
    }

    public List<String> getList(){
        return getList(KEY_LIST);
    }

    public void setList(List<String> list){
        put(KEY_LIST, list);
    }
}
