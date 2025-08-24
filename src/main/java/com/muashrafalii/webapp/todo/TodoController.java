package com.muashrafalii.webapp.todo;

import jakarta.validation.Valid;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Controller
public class TodoController {

    private TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @RequestMapping(value = "list-todos")
    public String showTodosList(ModelMap model) {
        String username = getLoggedInUsername();
        List<Todo> todos = todoService.findByUsername(username);
        model.addAttribute("todos", todos);
        return "todo/list";
    }

    @RequestMapping(value="add-todo", method = RequestMethod.GET)
    public String showNewTodoPage(ModelMap model) {
        TodoDTO dto = new TodoDTO();
        dto.setTargetDate(LocalDate.now());
        dto.setDone(false);
        model.addAttribute("todo", dto);
        return "todo/todo";
    }

    @RequestMapping(value = "add-todo", method = RequestMethod.POST)
    public String addNewTodo(@Valid @ModelAttribute("todo") TodoDTO todo, BindingResult result) {
        if(result.hasErrors()) {
            return "todo/todo";
        }
        String username = getLoggedInUsername();
        todoService.addTodo(todo, username);
        return "redirect:list-todos";
    }

    @RequestMapping(value= "delete-todo", method = RequestMethod.GET)
    public String deleteTodo(@RequestParam Long id) {
        todoService.deleteTodo(id);
        return "redirect:list-todos";
    }

    @RequestMapping(value = "update-todo", method = RequestMethod.GET)
    public String showUpdateTodoPAge(@RequestParam Long id, ModelMap model) {
        Optional<Todo> todo = todoService.findById(id);
        model.addAttribute("todo", todo);
        return "todo/todo";
    }

    @RequestMapping(value = "update-todo", method = RequestMethod.POST)
    public String updateTodo(ModelMap model, @Valid Todo todo, BindingResult result) {
        if(result.hasErrors()) {
            return "todo/todo";
        }
        String username = getLoggedInUsername();
        todo.setUsername(username);
        todoService.updateTodo(todo);
        return "redirect:list-todos";
    }

    private String getLoggedInUsername() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return authentication.getName();
    }
}
