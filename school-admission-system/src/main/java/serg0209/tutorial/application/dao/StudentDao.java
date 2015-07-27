package serg0209.tutorial.application.dao;

import serg0209.tutorial.application.domain.Student;
import serg0209.tutorial.application.form.StudentSearchForm;

import java.util.List;


public interface StudentDao {
    public void addStudent(Student student);

    public List<Student> findStudent(StudentSearchForm studentSearchForm);

    public Student findStudent(int rollNo);

    public void updateStudent(Student student);

    public void deleteStudent(int rollNo);
}