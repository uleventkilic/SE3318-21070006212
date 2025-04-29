package org.example;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

public class TaskManagerTest {

    @Test
    void testAssignTaskToUser() {
        NotificationService ns = new NotificationService();
        TaskManager manager = new TaskManager(ns);
        User user = new User("testuser", "test@example.com");
        Task task = new Task("Prepare report", LocalDate.now());

        manager.assignTaskToUser(task, user);
        assertTrue(user.hasTask("Prepare report"));
        assertTrue(ns.getNotifications(user).contains("New task assigned: Prepare report"));
    }

    @Test
    void testRemoveTaskFromUser() {
        NotificationService ns = new NotificationService();
        TaskManager manager = new TaskManager(ns);
        User user = new User("testuser", "test@example.com");
        Task task = new Task("Task to remove", LocalDate.now());

        user.addTask(task);
        manager.removeTaskFromUser(task, user);
        assertFalse(user.hasTask("Task to remove"));
    }

    @Test
    void testListUserTasks() {
        NotificationService ns = new NotificationService();
        TaskManager manager = new TaskManager(ns);
        User user = new User("testuser", "test@example.com");

        assertNotNull(manager.listUserTasks(user));
    }
}
