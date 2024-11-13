package abstractFactory;

public class MobileNotificationCenter implements NotificationCenter {
    @Override
    public void showNotification(String title, String message) {
        System.out.println("Mobile Notification - " + title + ": " + message);
    }
}
