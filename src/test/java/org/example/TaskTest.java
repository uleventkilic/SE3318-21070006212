package org.example;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

public class TaskTest {

    @Test
    void testIsOverdueFalse() {
        Task task = new Task("Test Task", LocalDate.now().plusDays(1));
        assertFalse(task.isOverdue());
    }

    @Test
    void testIsOverdueTrue() {
        Task task = new Task("Test Task", LocalDate.now().minusDays(1));
        assertTrue(task.isOverdue());
    }

    @Test
    void testMarkAsCompleted() {
        Task task = new Task("Test Task", LocalDate.now());
        task.markAsCompleted();
        assertTrue(task.isCompleted());
    }
}
