package com.example.jdncprojcet8.controller;


import com.example.jdncprojcet8.dto.CreateRequestDto;
import com.example.jdncprojcet8.entity.Student;
import com.example.jdncprojcet8.repository.StudentRepository;
import com.example.jdncprojcet8.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @PostMapping("/student")
    public Student createStudent(@RequestBody CreateRequestDto createRequestDto) {
        return studentService.createStudent(createRequestDto);
    }

    @GetMapping("/student")
    public List<Student> getAllStudent() {
        return studentService.getStudent();
    }

    @PutMapping("/student/{id}")
    public Student update(@RequestBody CreateRequestDto createRequestDto,
                          @PathVariable Long id) {
        return studentService.update(id,createRequestDto);
    }

    @DeleteMapping("/student/{id}")
    public List<Student> deleteStudent(@PathVariable Long id) {
        return studentService.deleteStudent(id);
    }

    @GetMapping("/student/{id}")
    public Student getStudent(@PathVariable Long id) {
        return studentService.geOnetStudent(id);
    }
}
