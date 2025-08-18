package com.muashrafalii.webapp.todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {
    private static List<Todo> todos = new ArrayList<>();

    static {
        todos.add(new Todo(1, "muashraf", "Complete Spring Boot tutorial", LocalDate.now().plusYears(1), false));
        todos.add(new Todo(2, "muashraf", "Learn Hibernate JPA", LocalDate.now().plusMonths(6), false));
        todos.add(new Todo(3, "muashraf", "Prepare for Java certification", LocalDate.now().plusWeeks(12), false));
        todos.add(new Todo(4, "muashraf", "Build personal portfolio website", LocalDate.now().plusDays(45), true));
    }

    public List<Todo> findByUsername(String username) {
        return todos;
//        return todos.stream()
//                .filter(todo -> todo.getUsername().equalsIgnoreCase(username))
//                .toList();
    }
}
