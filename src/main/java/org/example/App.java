package org.example;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        Task task1 = new Task("Design DB Schema", LocalDate.of(2025, 5, 5));
        Task task2 = new Task("Implement API", LocalDate.of(2025, 5, 10));

        User user1 = new User("levent", "levent@example.com");

        Project project = new Project();
        project.addUser(user1);
        project.addTask(task1);
        project.addTask(task2);

        NotificationService notificationService = new NotificationService();
        TaskManager taskManager = new TaskManager(notificationService);

        taskManager.assignTaskToUser(task1, user1);
        taskManager.assignTaskToUser(task2, user1);

        System.out.println("User's Tasks:");
        for (Task task : user1.getTasks()) {
            System.out.println("- " + task.getTitle() + " | Completed: " + task.isCompleted());
        }

        System.out.println("\nNotifications:");
        for (String note : notificationService.getNotifications(user1)) {
            System.out.println("- " + note);
        }
        task1.markAsCompleted();
        System.out.println("\nTask '" + task1.getTitle() + "' completed? " + task1.isCompleted());
        System.out.println("Is overdue? " + task1.isOverdue());
    }
}
