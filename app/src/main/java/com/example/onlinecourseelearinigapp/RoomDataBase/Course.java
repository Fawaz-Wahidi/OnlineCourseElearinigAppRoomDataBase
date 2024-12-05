package com.example.onlinecourseelearinigapp.RoomDataBase;
import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity (tableName = "course_table")
public class Course {
//    id,title,description,instractor

    @PrimaryKey
    private long id ;
@NonNull
    private String title;
@NonNull
    private String description;
@NonNull
    private String instructor;

public Course(){

}

public Course (long id,String title,String description,String instructor ){
    this.id=id;
    this.description=description;
    this.instructor=instructor;
    this.title=title;
}

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @NonNull
    public String getTitle() {
        return title;
    }

    public void setTitle(@NonNull String title) {
        this.title = title;
    }

    @NonNull
    public String getDescription() {
        return description;
    }

    public void setDescription(@NonNull String description) {
        this.description = description;
    }

    @NonNull
    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(@NonNull String instructor) {
        this.instructor = instructor;
    }
}
