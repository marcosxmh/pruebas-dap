package products.windows;

import products.NotificationCenter;
import com.sun.jna.platform.win32.WinDef;

public class WindowsNotificationCenter implements NotificationCenter {
    private static final int MB_OK = 0x00000000;
    private static final int MB_ICONASTERISK = 0x00000040;

    @Override
    public void notifyUser(String message) {
        User32Library.INSTANCE.MessageBox(
                null,
                message,
                "Windows Notification",
                MB_OK | MB_ICONASTERISK
        );
    }
}
