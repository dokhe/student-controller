package com.keteso.studentcontroller.service;

import com.keteso.studentcontroller.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public interface StudentService {
    public abstract Student createStudent(Student student);
    public abstract void updateStudent(Student student);
    public abstract Student getStudent(int id);
    public abstract List<Student> getStudents();
    public abstract void deleteStudent(int id);
    public abstract boolean isStudentExist(int id);
}
