package products.linux;

import products.NotificationCenter;

public class LinuxNotificationCenter implements NotificationCenter {
    @Override
    public void notifyUser(String message) {
        GtkLibrary.INSTANCE.gtk_init(0, null);

        long window = GtkLibrary.INSTANCE.gtk_window_new(1);
        GtkLibrary.INSTANCE.gtk_window_set_title(window, "Notification");
        GtkLibrary.INSTANCE.gtk_window_set_default_size(window, 300, 100);

        GtkLibrary.INSTANCE.gtk_widget_show_all(window);
        GtkLibrary.INSTANCE.gtk_main();
    }
}
