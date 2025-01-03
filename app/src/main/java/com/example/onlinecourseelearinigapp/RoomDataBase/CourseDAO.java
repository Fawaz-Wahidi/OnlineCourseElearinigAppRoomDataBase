package com.example.onlinecourseelearinigapp.RoomDataBase;
import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;
@Dao
public interface CourseDAO {


        @Insert
        void insert(Course course);

        @Update
        void update(Course course);

        @Delete
        void delete(Course course);

        @Query("SELECT * FROM course_table WHERE id = :courseId")
        Course getCourseById(int courseId);

        @Query("SELECT * FROM course_table")
       LiveData <List<Course>> getAllCourses();
    }




