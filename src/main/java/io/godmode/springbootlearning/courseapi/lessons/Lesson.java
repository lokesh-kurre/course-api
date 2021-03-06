package io.godmode.springbootlearning.courseapi.lessons;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import io.godmode.springbootlearning.courseapi.courses.Course;

@Entity
public class Lesson {

    @Id
    private String id;
    private String name;
    private String description;

    @ManyToOne
    private Course course;

    public Lesson() {

    }

    public Lesson(String id, String name, String description, String courseId, String topicId) {
        super();
        this.id = id;
        this.name = name;
        this.description = description;
        this.course = new Course(courseId, "", "", topicId);
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
