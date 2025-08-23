package com.muashrafalii.webapp.todo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.util.List;

@Controller
public class TodoController {

    private TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @RequestMapping(value = "list-todos")
    public String showTodosList(ModelMap model) {
        List<Todo> todos = todoService.findByUsername("muashraf");
        model.addAttribute("todos", todos);
        return "todo/list";
    }

    @RequestMapping(value="add-todo", method = RequestMethod.GET)
    public String showNewTodoPage(ModelMap model) {
        String username = (String) model.get("name");
        Todo todo = new Todo(0, username, "", LocalDate.now(),false);

        model.addAttribute("todo", todo);
        return "todo/add";
    }

    @RequestMapping(value = "add-todo", method = RequestMethod.POST)
    public String addNewTodo(ModelMap model, Todo todo) {
        String username = (String) model.get("name");
        todoService.addTodo(username, todo.getDescription(), LocalDate.now().plusYears(1), false);
        return "redirect:list-todos";
    }

}
