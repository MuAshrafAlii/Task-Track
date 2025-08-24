package com.muashrafalii.webapp.todo;


import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public class TodoDTO {
    private String username;

    @Size(min = 10, message = "Enter atleast 10")
    private String description;
    private LocalDate targetDate;
    private boolean isDone;



    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(LocalDate targetDate) {
        this.targetDate = targetDate;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }
}
