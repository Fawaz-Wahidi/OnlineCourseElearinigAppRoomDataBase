package com.example.onlinecourseelearinigapp.RoomDataBase;
import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class MyViewModel  extends AndroidViewModel {
    AppRepository appRepository;

    public MyViewModel(@NonNull Application application) {
        super(application);
        appRepository = new AppRepository(application);
    }


    public LiveData<List<User>> getAllUsers() {
        return appRepository.getAllUsers();
    }

    public void insertUser(User user) {
        appRepository.insertUser(user);
    }

    public void updateUser(User user) {
        appRepository.updateUser(user);
    }

    public void deleteUser(User user) {
        appRepository.deleteUser(user);
    }

    // Course operations
    public LiveData<List<Course>> getAllCourses() {
        return appRepository.allCourses;
    }

    public void insertCourse(Course course) {
        appRepository.insertCourse(course);
    }

    public void updateCourse(Course course) {
        appRepository.updateCourse(course);
    }

    public void deleteCourse(Course course) {
        appRepository.deleteCourse(course);
    }

    // Enrollment operations
    public LiveData<List<Enrollment>> getAllEnrollments() {
        return appRepository.allEnrollments;
    }

    public void insertEnrollment(Enrollment enrollment) {
        appRepository.insertEnrollment(enrollment);
    }

    public void updateEnrollment(Enrollment enrollment) {
        appRepository.updateEnrollment(enrollment);
    }

    public void deleteEnrollment(Enrollment enrollment) {
        appRepository.deleteEnrollment(enrollment);
    }

}
