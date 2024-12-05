package com.example.onlinecourseelearinigapp.RoomDataBase;
import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;
@Dao
public interface UserDAO {

    @Insert
    void insertUser(User...user);

    @Update
    void updateUser(User user);

    @Delete
     void deleteUser(User user);

    @Query("Select * From users_table Where id=:userId")
    User getUserById(int userId);

@Query("Select * From users_table")
    LiveData<List<User>>getAllUsers();

}
