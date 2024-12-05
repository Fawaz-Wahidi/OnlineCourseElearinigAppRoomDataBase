package com.example.onlinecourseelearinigapp.RoomDataBase;

import android.app.Application;
import androidx.lifecycle.LiveData;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AppRepository {
   UserDAO userDao;
 CourseDAO courseDao;
   EnrollmentDAO enrollmentDao;
    LiveData<List<User>> allUsers;
    LiveData<List<Course>> allCourses;
  LiveData<List<Enrollment>> allEnrollments;

    private static final int NUMBER_OF_THREADS = 4;
    static final ExecutorService databaseWriteExecutor =
            Executors.newFixedThreadPool(NUMBER_OF_THREADS);

    public AppRepository(Application application) {
        MyRoomDataBase db = MyRoomDataBase.getInstance(application);
        userDao = db.userDAO();
        courseDao = db.courseDAO();
        enrollmentDao = db.enrollmentDAO();
        allUsers = userDao.getAllUsers();
        allCourses = courseDao.getAllCourses();
        allEnrollments = enrollmentDao.getAllEnrollment();


    }

    // User operations
    public LiveData<List<User>> getAllUsers() {
        return allUsers;
    }

    public void insertUser(User user) {
        databaseWriteExecutor.execute(() -> userDao.insertUser(user));
    }

    public void updateUser(User user) {
        databaseWriteExecutor.execute(() -> userDao.updateUser(user));
    }

    public void deleteUser(User user) {
        databaseWriteExecutor.execute(() -> userDao.deleteUser(user));
    }

    // Course operations
    public LiveData<List<Course>> getAllCourses() {
        return allCourses;
    }

    public void insertCourse(Course course) {
        databaseWriteExecutor.execute(() -> courseDao.insert(course));
    }

    public void updateCourse(Course course) {
        databaseWriteExecutor.execute(() -> courseDao.update(course));
    }

    public void deleteCourse(Course course) {
        databaseWriteExecutor.execute(() -> courseDao.delete(course));
    }

    // Enrollment operations
    public LiveData<List<Enrollment>> getAllEnrollments() {
        return allEnrollments;
    }

    public void insertEnrollment(Enrollment enrollment) {
        databaseWriteExecutor.execute(() -> enrollmentDao.insert(enrollment));
    }

    public void updateEnrollment(Enrollment enrollment) {
        databaseWriteExecutor.execute(() -> enrollmentDao.update(enrollment));
    }

    public void deleteEnrollment(Enrollment enrollment) {
        databaseWriteExecutor.execute(() -> enrollmentDao.delete(enrollment));
    }
}
