package products.windows;

import com.sun.jna.Native;
import com.sun.jna.platform.win32.User32;
import com.sun.jna.platform.win32.WinDef;
import com.sun.jna.win32.W32APIOptions;

public interface User32Library extends User32 {
    User32Library INSTANCE = Native.load("user32", User32Library.class, W32APIOptions.DEFAULT_OPTIONS);

    int MessageBox(WinDef.HWND hwnd, String text, String caption, int type);
}
