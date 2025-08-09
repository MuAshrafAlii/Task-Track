package com.muashrafalii.spring_jpa.data_jpa;

import com.muashrafalii.spring_jpa.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long> {
}
