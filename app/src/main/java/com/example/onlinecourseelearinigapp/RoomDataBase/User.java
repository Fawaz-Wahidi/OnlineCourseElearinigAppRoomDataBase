package com.example.onlinecourseelearinigapp.RoomDataBase;
import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Date;

@Entity(tableName = "users_table")
public class User {

//    username , userid , birthdate,email,password
    @PrimaryKey(autoGenerate = true)
    private long id;

    @NonNull
    private String name;
    @NonNull
    private String email;
    @NonNull
    private  String password;


    public User(){

    }

    public User(long id,String name,String email,String password){
        this.id=id;
        this.name=name;
        this.password=password;
        this.email=email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @NonNull
    public String getName() {
        return name;
    }

    public void setName(@NonNull String name) {
        this.name = name;
    }

    @NonNull
    public String getEmail() {
        return email;
    }

    public void setEmail(@NonNull String email) {
        this.email = email;
    }

    @NonNull
    public String getPassword() {
        return password;
    }

    public void setPassword(@NonNull String password) {
        this.password = password;
    }


}
