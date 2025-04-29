package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NotificationServiceTest {

    @Test
    void testSendAndGetNotification() {
        NotificationService service = new NotificationService();
        User user = new User("testuser", "test@example.com");
        service.sendNotification(user, "Test message");
        assertTrue(service.getNotifications(user).contains("Test message"));
    }

    @Test
    void testGetNotificationsEmpty() {
        NotificationService service = new NotificationService();
        User user = new User("testuser", "test@example.com");
        assertTrue(service.getNotifications(user).isEmpty());
    }
}
