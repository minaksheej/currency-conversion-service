package com.spring.in28mintutes.react;

public class NotificationServiceimpl implements NotificationService {

    @Override
    public void initiateNotification(NotificationData notificationData)
            throws InterruptedException {
        
        System.out.println("Notification service started for"+ "Notification id"+ notificationData.getId());
        
        Thread.sleep(5000);
        System.out.println("Notification service ended for"+ "Notification id"+ notificationData.getId());

    }

}
