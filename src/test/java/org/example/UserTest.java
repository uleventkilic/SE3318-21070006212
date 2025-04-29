package org.example;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

public class UserTest {

    @Test
    void testAddTaskAndHasTask() {
        User user = new User("testuser", "test@example.com");
        Task task = new Task("Read book", LocalDate.now());
        user.addTask(task);
        assertTrue(user.hasTask("Read book"));
    }

    @Test
    void testHasTaskFalse() {
        User user = new User("testuser", "test@example.com");
        assertFalse(user.hasTask("Unknown Task"));
    }

    @Test
    void testGetTasks() {
        User user = new User("testuser", "test@example.com");
        assertNotNull(user.getTasks());
    }
}
