package products.windows;

import products.Dialog;
import com.sun.jna.platform.win32.WinDef;

public class WindowsDialog implements Dialog {
    private static final int MB_OK = 0x00000000;
    private static final int MB_ICONINFORMATION = 0x00000040;

    @Override
    public void render() {
        User32Library.INSTANCE.MessageBox(
                null,
                "This is a native Windows Dialog!",
                "Dialog",
                MB_OK | MB_ICONINFORMATION
        );
    }
}
