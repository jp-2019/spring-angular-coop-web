package com.example.demo.controller;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @RequestMapping(value = "/test", method = RequestMethod.GET)

    @GetMapping("/students")
    public Page<Student> getStudent(Pageable pageable) {
        return studentRepository.findAll(pageable);
    }

    @PostMapping("/students")
    public Student createStudent(@Valid @RequestBody Student student) {
        return studentRepository.save(student);
    }

    @PutMapping("/students/{studentId}")
    public Student updateStudent(@PathVariable Long studentId,
                                 @Valid @RequestBody Student studentRequest){
        return studentRepository.findById(studentId)
                .map(student -> {
                    student.setFirstName(studentRequest.getFirstName());
                    student.setLastName(studentRequest.getLastName());
                    return studentRepository.save(student);
                }).orElseThrow(() -> new ResourceNotFoundException("Student not found with id " + studentId));
    }

    @DeleteMapping("/students/{studentId}")
    public ResponseEntity<?> deleteStudent(@PathVariable Long studentId) {
        return studentRepository.findById(studentId)
                .map(student -> {
                    studentRepository.delete(student);
                    return ResponseEntity.ok().build();
                }).orElseThrow(() -> new ResourceNotFoundException("Student not found with id " + studentId));
    }

}
