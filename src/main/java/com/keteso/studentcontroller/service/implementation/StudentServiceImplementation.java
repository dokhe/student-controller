package com.keteso.studentcontroller.service.implementation;

import com.keteso.studentcontroller.model.Student;
import com.keteso.studentcontroller.repository.StudentRepository;
import com.keteso.studentcontroller.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImplementation implements StudentService {
    @Autowired
    private StudentRepository studentRepository;
//    Create student
    @Override
    public Student createStudent(Student student){
        return studentRepository.save(student);
    }
//    Update student
    @Override
    public void updateStudent(Student student){
        studentRepository.save(student);
    }
//    Get student with id
    @Override
    public Student getStudent(int id){
        Optional<Student> optional = studentRepository.findById(id);
        Student student = optional.get();
        return student;
    }
//    Get a list of students
    @Override
    public List<Student> getStudents(){
        return (List<Student>) studentRepository.findAll();
    }
//    Delete student with id
    @Override
    public void deleteStudent(int id){
        studentRepository.deleteById(id);
    }
//    Check of the student with id exists
    @Override
    public boolean isStudentExist(int id){
        return studentRepository.existsById(id);
    }

}
