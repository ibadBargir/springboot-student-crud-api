package com.example.demoSpringAPI.Student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

    private final StudentRespository studentRespository;

    public StudentService(StudentRespository studentRespository) {
        this.studentRespository = studentRespository;
    }

    public List<Student> getStudent(){

        return studentRespository.findAll();
    }

    public void addStudent(Student student){
        studentRespository.save(student);
    }


    public void DeleteStudent(Long id){

        boolean exists = studentRespository.existsById(id);
        if (!exists){
            throw new IllegalStateException("Student with Id"+ id+ "does not exist." );
        }

        studentRespository.deleteById(id);
    }

     

}
