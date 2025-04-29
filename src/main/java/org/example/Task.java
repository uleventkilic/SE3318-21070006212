package org.example;

import java.time.LocalDate;

public class Task {
    private String title;
    private LocalDate dueDate;
    private boolean completed;

    public Task(String title, LocalDate dueDate) {
        this.title = title;
        this.dueDate = dueDate;
        this.completed = false;
    }

    // requires: none
    // effects: returns the title of the task
    public String getTitle() {
        return title;
    }

    // requires: none
    // effects: returns the due date of the task
    public LocalDate getDueDate() {
        return dueDate;
    }

    // requires: none
    // effects: returns true if task is marked as completed
    public boolean isCompleted() {
        return completed;
    }

    // requires: none
    // effects: sets the task as completed
    public void markAsCompleted() {
        this.completed = true;
    }

    // requires: dueDate != null
    // effects: returns true if the task is not completed and the current date is after dueDate
    public boolean isOverdue() {
        return !completed && LocalDate.now().isAfter(dueDate);
    }
}
