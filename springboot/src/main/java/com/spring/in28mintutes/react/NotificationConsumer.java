package com.spring.in28mintutes.react;

import java.util.function.Consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import reactor.bus.Event;

@Service
public class NotificationConsumer implements Consumer<Event<NotificationData>> {
    
    @Autowired
    private NotificationService notificationService;

    @Override
    public void accept(Event<NotificationData> notificationEvent) {
        NotificationData data=notificationEvent.getData();
        
        try {
            notificationService.initiateNotification(data);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }   
        
    }

}
