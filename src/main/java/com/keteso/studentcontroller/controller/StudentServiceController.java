package com.keteso.studentcontroller.controller;


import com.keteso.studentcontroller.exception.StudentNotfoundException;
import com.keteso.studentcontroller.model.Student;
import com.keteso.studentcontroller.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class StudentServiceController {
    @Autowired
    private StudentService studentService;
//    Create student
    @RequestMapping(value = "/students", method = RequestMethod.POST)
    public ResponseEntity<Object> createStudent(@RequestBody Student student){
        student = studentService.createStudent(student);
        return new ResponseEntity<>("Student is created successfully with id = " +student.getId(), HttpStatus.CREATED);
    }
//    Update student with id
    @RequestMapping(value = "/students/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Object> updateStudent(@PathVariable("id") int id,
        @RequestBody Student student){
    boolean isStudentExist = studentService.isStudentExist(id);
        if (isStudentExist) {
            student.setId(id);
            studentService.updateStudent(student);
            return new ResponseEntity<>("Student is updated successsfully", HttpStatus.OK);
        }
        else {
            throw new StudentNotfoundException();
        }
    }
//    Get student with Id
    @RequestMapping(value = "/students/{id}", method = RequestMethod.GET)
    public ResponseEntity<Object> getStudent(@PathVariable("id") int id)
    {
        boolean isStudentExist = studentService.isStudentExist(id);
        if (isStudentExist) {
            Student student = studentService.getStudent(id);
            return new ResponseEntity<>(student, HttpStatus.OK);

        }
        else {
            throw new StudentNotfoundException();
        }
    }
//    Get list of all students
    @RequestMapping(value = "/students", method = RequestMethod.GET)
    public ResponseEntity<Object> getStudents(){
        List<Student> studentList = studentService.getStudents();
        return new ResponseEntity<>(studentList, HttpStatus.OK);
    }
//    Delete students with id
    @RequestMapping(value = "/students/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Object> deleteStudent(@PathVariable("id")int id){
        boolean isStudentExist =studentService.isStudentExist(id);
        if (isStudentExist) {
            studentService.deleteStudent(id);
            return new ResponseEntity<>("Student is deleted successsfully", HttpStatus.OK);
        }
        else {
            throw new StudentNotfoundException();
        }
    }
}
