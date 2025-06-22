package com.example.demoSpringAPI.Student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRespository respository){
      return args -> {

          Student mariyam = new Student(

                  "Mariyam",
                  "mariam.jamal@gmail.com",
                  LocalDate.of(2000, Month.JANUARY, 5),
                  15

          );

          Student Jamal = new Student(

                  "Jamal",
                  "jamal@gmail.com",
                  LocalDate.of(2003, Month.MAY, 25),
                  19

          );

          respository.saveAll(
                  List.of(mariyam , Jamal)
          );
      };
    }
}
