package com.psu.scheduler.service;

import com.psu.scheduler.model.Notification;
import com.psu.scheduler.repository.NotificationRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationService 
{
    @Autowired
    private NotificationRepository notificationRepository;

    public List<Notification> getAllNotifications() 
    {
        return notificationRepository.findAll();
    }

    public Notification saveNotification(Notification notification) 
    {
        return notificationRepository.save(notification);
    }

    public void deleteNotification(int notificationId) 
    {
        notificationRepository.deleteById(notificationId);
    }

    // Other methods as needed
}