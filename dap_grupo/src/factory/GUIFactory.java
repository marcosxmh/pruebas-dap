// src/factory/GUIFactory.java
package factory;

import products.Button;
import products.Dialog;
import products.NotificationCenter;

public interface GUIFactory {
    Button createButton();
    Dialog createDialog();
    NotificationCenter createNotificationCenter();
}
