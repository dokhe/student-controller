package com.keteso.studentcontroller.model;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "STUDENTS_DATA")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String admissionNumber;
    private int age;
}
