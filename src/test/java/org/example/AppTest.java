package org.example;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    void testFullFlow() {
        Task task1 = new Task("Task A", LocalDate.now().plusDays(3));
        Task task2 = new Task("Task B", LocalDate.now().plusDays(5));

        User user = new User("testuser", "test@example.com");

        Project project = new Project();
        project.addUser(user);
        project.addTask(task1);
        project.addTask(task2);

        NotificationService notificationService = new NotificationService();
        TaskManager taskManager = new TaskManager(notificationService);

        taskManager.assignTaskToUser(task1, user);
        taskManager.assignTaskToUser(task2, user);

        List<Task> userTasks = user.getTasks();
        assertEquals(2, userTasks.size());
        assertTrue(user.hasTask("Task A"));
        assertTrue(user.hasTask("Task B"));

        List<String> notes = notificationService.getNotifications(user);
        assertEquals(2, notes.size());
        assertTrue(notes.contains("New task assigned: Task A"));
        assertTrue(notes.contains("New task assigned: Task B"));

        task1.markAsCompleted();
        assertTrue(task1.isCompleted());
        assertFalse(task1.isOverdue());
    }
}
