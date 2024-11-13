// src/products/mobile/MobileNotificationCenter.java
package products.mobile;

import products.NotificationCenter;

public class MobileNotificationCenter implements NotificationCenter {
    @Override
    public void notifyUser(String message) {
        System.out.println("Mobile Notification: " + message);
    }
}
