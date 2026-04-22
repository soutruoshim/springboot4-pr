package com.srhdp.springboot4.notification.services;

import com.srhdp.springboot4.auth_users.entity.User;
import com.srhdp.springboot4.notification.dtos.NotificationDTO;

public interface NotificationService {
    void sendEmail(NotificationDTO notificationDTO, User user);
}