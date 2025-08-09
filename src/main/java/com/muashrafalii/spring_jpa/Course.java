package com.muashrafalii.spring_jpa;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Course {
    @Id
    private long id;

    @Column
    private String name;

    @Column
    private String author;

    public Course() {
    }

    public Course(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Course{" +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
