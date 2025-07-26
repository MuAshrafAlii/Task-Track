package com.muashrafalii.spring_jpa.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository // A class talks to database
public class CourseJdbcRepository {
    @Autowired
    private JdbcTemplate springJdbcTemplate;

    private static String INSERT_QUERY =
            """
            INSERT INTO COURSE (name,author)
            VALUES('name from jdbc', 'author from jdbc')
            """;

    public void insert() {
        // using Spring JDBC. (Not JAVA Native JDBC)
        springJdbcTemplate.update(INSERT_QUERY);
    }
}
