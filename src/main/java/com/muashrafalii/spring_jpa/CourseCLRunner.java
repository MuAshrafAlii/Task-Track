package com.muashrafalii.spring_jpa;

import com.muashrafalii.spring_jpa.jdbc.CourseJdbcRepository;
import com.muashrafalii.spring_jpa.jpa.CourseJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCLRunner implements CommandLineRunner {

    @Autowired
//    private CourseJdbcRepository repository;
    private CourseJpaRepository repository;
    @Override
    public void run(String... args) throws Exception {
        Course newCourse = new Course("course bta3 mido", "Mido y3m");
        repository.insert(newCourse);
//        repository.deleteById(1);

        System.out.println(repository.findById(0));
//        System.out.println(repository.findById(1));
    }
}
