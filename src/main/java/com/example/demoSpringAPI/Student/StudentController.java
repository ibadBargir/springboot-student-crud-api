package com.example.demoSpringAPI.Student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping (path = "api/student/ib")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getStudent(){

        return this.studentService.getStudent();

    }

    @PostMapping("/addStudent")
    public void addStudent(@RequestBody Student student){
        studentService.addStudent(student);
    }

    @DeleteMapping(path = "{studentId}")
    public void DeleteStudent(@PathVariable ("studentId") Long id){

        studentService.DeleteStudent(id);

    }


}
