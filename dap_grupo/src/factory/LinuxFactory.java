// src/factory/LinuxFactory.java
package factory;

import products.Button;
import products.Dialog;
import products.NotificationCenter;
import products.linux.*;

public class LinuxFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public Dialog createDialog() {
        return new LinuxDialog();
    }

    @Override
    public NotificationCenter createNotificationCenter() {
        return new LinuxNotificationCenter();
    }
}
