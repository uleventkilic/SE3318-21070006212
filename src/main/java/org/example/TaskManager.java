package org.example;

import java.util.List;

public class TaskManager {
    private NotificationService notificationService;

    public TaskManager(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    // requires: task != null, user != null
    // effects: assigns the task to the user and sends a notification
    public void assignTaskToUser(Task task, User user) {
        user.addTask(task);
        notificationService.sendNotification(user, "New task assigned: " + task.getTitle());
    }

    // requires: task != null, user != null
    // effects: removes the task from the user's task list (if exists)
    public void removeTaskFromUser(Task task, User user) {
        user.getTasks().remove(task);
    }

    // requires: user != null
    // effects: returns all tasks currently assigned to the user
    public List<Task> listUserTasks(User user) {
        return user.getTasks();
    }
}
