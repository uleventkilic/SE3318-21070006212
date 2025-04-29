package org.example;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private String email;
    private List<Task> tasks;

    public User(String username, String email) {
        this.username = username;
        this.email = email;
        this.tasks = new ArrayList<>();
    }

    // requires: task != null
    // effects: adds the task to the user's task list
    public void addTask(Task task) {
        tasks.add(task);
    }

    // requires: title != null
    // effects: returns true if the user has a task with the given title (case-insensitive)
    public boolean hasTask(String title) {
        for (Task task : tasks) {
            if (task.getTitle().equalsIgnoreCase(title)) {
                return true;
            }
        }
        return false;
    }

    // requires: none
    // effects: returns a list of all tasks assigned to the user
    public List<Task> getTasks() {
        return tasks;
    }

    // requires: none
    // effects: returns the username
    public String getUsername() {
        return username;
    }

    // requires: none
    // effects: returns the email address
    public String getEmail() {
        return email;
    }
}
