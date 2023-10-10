package com.example.jdncprojcet8.service;

import com.example.jdncprojcet8.dto.CreateRequestDto;
import com.example.jdncprojcet8.dto.CreateResponseDto;
import com.example.jdncprojcet8.entity.Student;
import com.example.jdncprojcet8.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    public CreateResponseDto createStudent(CreateRequestDto createRequestDto) {
        Student student = new Student();
        student.set(createRequestDto);
        studentRepository.save(student);

        CreateResponseDto createResponseDto = new CreateResponseDto();
        createResponseDto.set(student);

        return createResponseDto;
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

    public Student geOnetStudent(Long id) {
        return studentRepository.findById(id).orElseThrow(() ->
                new NullPointerException("해당 학생은 없는 학생입니다."));
    }
}
