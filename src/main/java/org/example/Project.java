package org.example;

import java.util.ArrayList;
import java.util.List;

public class Project {
    private List<User> users;
    private List<Task> tasks;

    public Project() {
        this.users = new ArrayList<>();
        this.tasks = new ArrayList<>();
    }

    // requires: user != null
    // effects: adds the user to the project
    public void addUser(User user) {
        users.add(user);
    }

    // requires: task != null
    // effects: adds the task to the project
    public void addTask(Task task) {
        tasks.add(task);
    }

    // requires: title != null
    // effects: returns the task that matches the title, or null if not found
    public Task getTaskByTitle(String title) {
        for (Task task : tasks) {
            if (task.getTitle().equalsIgnoreCase(title)) {
                return task;
            }
        }
        return null;
    }

    // requires: none
    // effects: returns a list of all users in the project
    public List<User> getUsers() {
        return users;
    }

    // requires: none
    // effects: returns a list of all tasks in the project
    public List<Task> getTasks() {
        return tasks;
    }
}
