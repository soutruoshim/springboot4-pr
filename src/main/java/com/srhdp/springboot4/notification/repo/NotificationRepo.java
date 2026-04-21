package com.srhdp.springboot4.notification.repo;

import com.srhdp.springboot4.notification.entity.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepo extends JpaRepository<Notification, Long> {
}
