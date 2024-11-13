package abstractFactory;

public class LinuxNotificationCenter implements NotificationCenter {
    @Override
    public void showNotification(String title, String message) {
        System.out.println("Linux Notification - " + title + ": " + message);
    }
}
