package serg0209.tutorial.application.service;

import serg0209.tutorial.application.domain.Course;
import serg0209.tutorial.application.form.StudentForm;
import serg0209.tutorial.application.form.StudentSearchForm;
import serg0209a.tutorial.application.domain.Student;

import java.util.List;

public interface SchoolService {
    public void addSudent(StudentForm studentForm);

    public List<Course> loadCourse();

    public List<Student> findStudent(StudentSearchForm studentSearchForm);

    public String loadCourse(int id);

    public StudentForm findStudent(int rollNo);

    public void updateStudent(StudentForm studentForm);

    public void deleteStudent(int rollNo);

    public List<Course> findCourse(int id);
}