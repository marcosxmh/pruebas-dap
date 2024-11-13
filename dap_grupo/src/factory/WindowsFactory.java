// src/factory/WindowsFactory.java
package factory;

import products.Button;
import products.Dialog;
import products.NotificationCenter;
import products.windows.*;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Dialog createDialog() {
        return new WindowsDialog();
    }

    @Override
    public NotificationCenter createNotificationCenter() {
        return new WindowsNotificationCenter();
    }
}
