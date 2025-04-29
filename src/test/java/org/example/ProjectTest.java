package org.example;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

public class ProjectTest {

    @Test
    void testAddUserAndGetUsers() {
        Project project = new Project();
        User user = new User("testuser", "test@example.com");
        project.addUser(user);
        assertTrue(project.getUsers().contains(user));
    }

    @Test
    void testAddTaskAndGetByTitle() {
        Project project = new Project();
        Task task = new Task("Write tests", LocalDate.now());
        project.addTask(task);
        assertEquals(task, project.getTaskByTitle("Write tests"));
    }

    @Test
    void testGetTasks() {
        Project project = new Project();
        assertNotNull(project.getTasks());
    }
}
