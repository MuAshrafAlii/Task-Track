package com.muashrafalii.spring_jpa;

public class Course {
    private String name;
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
