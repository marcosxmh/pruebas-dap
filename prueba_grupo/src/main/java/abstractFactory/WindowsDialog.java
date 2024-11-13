package abstractFactory;

import com.sun.jna.Native;
import com.sun.jna.platform.win32.User32;
import com.sun.jna.platform.win32.WinDef;

public class WindowsDialog implements Dialog {
    @Override
    public void render() {
        // Utilizar JNA para abrir un cuadro de diálogo nativo en Windows
        User32.INSTANCE.MessageBox(WinDef.HWND.NULL, "Este es un diálogo nativo de Windows", "Diálogo de Windows", User32.MB_OK);
    }
}
