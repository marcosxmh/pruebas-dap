// src/factory/MobileFactory.java
package factory;

import products.Button;
import products.Dialog;
import products.NotificationCenter;
import products.mobile.*;

public class MobileFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MobileButton();
    }

    @Override
    public Dialog createDialog() {
        return new MobileDialog();
    }

    @Override
    public NotificationCenter createNotificationCenter() {
        return new MobileNotificationCenter();
    }
}
