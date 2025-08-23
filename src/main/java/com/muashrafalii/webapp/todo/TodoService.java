package com.muashrafalii.webapp.todo;

import jakarta.validation.Valid;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {
    private static List<Todo> todos = new ArrayList<>();
    private static int todoCcount = 0;

    static {
        todos.add(new Todo(++todoCcount, "muashraf", "Complete Spring Boot tutorial", LocalDate.now().plusYears(1), false));
        todos.add(new Todo(++todoCcount, "muashraf", "Learn Hibernate JPA", LocalDate.now().plusMonths(6), false));
        todos.add(new Todo(++todoCcount, "muashraf", "Prepare for Java certification", LocalDate.now().plusWeeks(12), false));
        todos.add(new Todo(++todoCcount, "muashraf", "Build personal portfolio website", LocalDate.now().plusDays(45), true));
    }

    public List<Todo> findByUsername(String username) {
        return todos;
//        return todos.stream()
//                .filter(todo -> todo.getUsername().equalsIgnoreCase(username))
//                .toList();
    }

    public void addTodo(String username, String description, LocalDate targetDate, boolean isDone) {
        Todo todo = new Todo(++todoCcount,username,description,targetDate,isDone);
        todos.add(todo);
    }

    public void deleteTodo(int id) {
        todos.removeIf(todo -> todo.getId() == id);
    }

    public Todo findbyId(int id) {
        return todos.stream().filter(todo -> todo.getId() == id).findFirst().get();
    }

    public void updateTodo(@Valid Todo todo) {
        deleteTodo((int) todo.getId());
        todos.add(todo);

    }
}
