package com.muashrafalii.webapp.todo;

import jakarta.validation.Valid;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TodoService {
    private TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<Todo> findByUsername(String username) {
        return todoRepository.findByUsername(username);
    }

    public Optional<Todo> findById(Long id) {
        if (id == null || id <= 0) return Optional.empty();

        // Spring Data JPA returns Optional<Todo> here.
        return todoRepository.findById(id);
    }

    public Todo addTodo(TodoDTO dto, String username) {
        Todo entity = new Todo();
        entity.setUsername(username);
        entity.setDescription(dto.getDescription());
        entity.setTargetDate(dto.getTargetDate());
        entity.setIsDone(dto.isDone());
        return todoRepository.save(entity);
    }

    public void deleteTodo(Long id) {
        if (id == null || id <= 0) return; // defensive
        todoRepository.deleteById(id);
    }

    public void updateTodo(@Valid Todo todo) {
        todoRepository.save(todo);

    }
}
