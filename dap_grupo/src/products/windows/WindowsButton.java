// src/products/windows/WindowsButton.java
package products.windows;

import products.Button;
import com.sun.jna.platform.win32.*;
import com.sun.jna.platform.win32.WinUser.*;

public class WindowsButton implements Button {
    @Override
    public void render() {
        WinDef.HWND hwnd = User32.INSTANCE.FindWindow(null, "Windows Button");
        if (hwnd == null) {
            hwnd = User32.INSTANCE.CreateWindowEx(0, "STATIC", "Windows Button",
                    WinUser.WS_OVERLAPPEDWINDOW | WinUser.WS_VISIBLE,
                    100, 100, 300, 200,
                    null, null, null, null);
        }

        if (hwnd != null) {
            User32.INSTANCE.ShowWindow(hwnd, WinUser.SW_SHOW);
            User32.INSTANCE.UpdateWindow(hwnd);
        }
    }
}
