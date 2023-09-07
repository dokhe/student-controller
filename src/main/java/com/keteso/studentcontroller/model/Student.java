package com.keteso.studentcontroller.model;


import jakarta.persistence.*;
import lombok.Data;
@Entity
@Data
@Table(name = "student_data")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String admissionNumber;
    private int age;
}
