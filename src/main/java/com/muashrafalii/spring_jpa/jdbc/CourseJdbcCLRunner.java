package com.muashrafalii.spring_jpa.jdbc;

import com.muashrafalii.spring_jpa.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCLRunner implements CommandLineRunner {

    @Autowired
    private CourseJdbcRepository repository;

    @Override
    public void run(String... args) throws Exception {
        Course newCourse = new Course("course bta3 mido", "Mido y3m");
        repository.insert(newCourse);
        repository.delete(1);

        System.out.println(repository.findById(2));
//        System.out.println(repository.findById(1));
    }
}
