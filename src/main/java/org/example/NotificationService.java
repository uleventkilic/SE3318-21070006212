package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NotificationService {
    private Map<User, List<String>> notifications;

    public NotificationService() {
        this.notifications = new HashMap<>();
    }

    // requires: user != null, message != null
    // effects: sends a notification message to the user
    public void sendNotification(User user, String message) {
        notifications.computeIfAbsent(user, k -> new ArrayList<>()).add(message);
    }

    // requires: user != null
    // effects: returns the list of notifications sent to the user; returns empty list if none
    public List<String> getNotifications(User user) {
        return notifications.getOrDefault(user, new ArrayList<>());
    }
}
