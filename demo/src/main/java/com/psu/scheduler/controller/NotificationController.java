package com.psu.scheduler.controller;

import com.psu.scheduler.model.Notification;
import com.psu.scheduler.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/notifications")
public class NotificationController 
{
    @Autowired
    private NotificationService notificationService;

    @GetMapping
    public List<Notification> getAllNotifications()
    {
        return notificationService.getAllNotifications();
    }

    @PostMapping
    public Notification createNotification(@RequestBody Notification notification) 
    {
        return notificationService.saveNotification(notification);
    }

    @DeleteMapping("/{id}")
    public void deleteNotification(@PathVariable int id) 
    {
        notificationService.deleteNotification(id);
    }


}