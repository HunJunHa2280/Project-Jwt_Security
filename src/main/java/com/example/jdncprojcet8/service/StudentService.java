package com.example.jdncprojcet8.service;

import com.example.jdncprojcet8.dto.CreateRequestDto;
import com.example.jdncprojcet8.entity.Student;
import com.example.jdncprojcet8.repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor // 생성자 생략을 위해 사용
public class StudentService {

    private final StudentRepository studentRepository;

    public Student createStudent(CreateRequestDto createRequestDto) {
        Student student = new Student();
        student.set(createRequestDto);
        studentRepository.save(student);
        return student;
    }

    public List<Student> getStudent() {
        return studentRepository.findAll();
    }

    public Student update(Long id, CreateRequestDto createRequestDto) {
        Student student = studentRepository.findById(id).orElseThrow( () ->
                new NullPointerException("해당 학생은 없는 학생입니다."));
        student.set(createRequestDto);
        studentRepository.save(student);
        return student;
    }

    public List<Student> deleteStudent(Long id) {
        Student student = studentRepository.findById(id).orElseThrow( () ->
                new NullPointerException("해당 학생은 존재하지 않습니다."));

        studentRepository.delete(student);
        return studentRepository.findAll(); // findByAll이 학생을 가져오면 제거하고 남은 학생을 보이게 리턴
    }
}
