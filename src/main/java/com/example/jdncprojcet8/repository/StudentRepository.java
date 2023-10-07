package com.example.jdncprojcet8.repository;


import com.example.jdncprojcet8.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
