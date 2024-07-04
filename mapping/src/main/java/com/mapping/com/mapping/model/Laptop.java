package com.mapping.com.mapping.model;

import com.mapping.com.mapping.service.StudentService;
import jakarta.persistence.*;

@Entity
@Table (name = "jpa_laptop")
public class Laptop {
    @Id
    private int laptopId;
    private String modelNumber;
    private String brand;
    @OneToOne
    @JoinColumn(name = "student_id")
    private Student student;
}
