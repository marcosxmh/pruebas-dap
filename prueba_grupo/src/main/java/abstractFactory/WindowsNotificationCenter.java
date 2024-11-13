package abstractFactory;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.platform.win32.User32;
import com.sun.jna.platform.win32.WinDef;

import javax.swing.*;

public class WindowsNotificationCenter implements NotificationCenter {
    // Interfaz para la librería User32
    public interface User32Lib extends Library {
        User32Lib INSTANCE = Native.load("user32", User32Lib.class);
        void MessageBoxA(WinDef.HWND hWnd, String text, String caption, int type);
    }

    @Override
    public void showNotification(String title, String message) {
        // Usar JNA para mostrar una ventana de notificación nativa en Windows
        User32Lib.INSTANCE.MessageBoxA(null, message, title, 0);
    }
}
