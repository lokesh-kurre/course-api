package io.godmode.springbootlearning.courseapi.lessons;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LessonService {

    @Autowired
    private LessonRepository lessonRepository;

    public List<Lesson> getAllLessons(String topicId) {
        List<Lesson> lessons = new ArrayList<>();
        lessonRepository.findByCourseTopicId(topicId).forEach(lessons::add);
        return lessons;
    }

    public List<Lesson> getAllCourseLessons(String courseId) {
        List<Lesson> lessons = new ArrayList<>();
        lessonRepository.findByCourseId(courseId).forEach(lessons::add);
        return lessons;
    }

    public Optional<Lesson> getLesson(String id) {
        return lessonRepository.findById(id);
    }

    public void addLesson(Lesson lesson) {
        lessonRepository.save(lesson);
    }

    public void updateLesson(String id, Lesson lesson) {
        lessonRepository.save(lesson);
    }

    public void deleteLesson(String id) {
        lessonRepository.deleteById(id);
    }

}
