import factory.*;
import products.*;

public class App {
    private static GUIFactory getFactory() {

        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("win")) {
            return new WindowsFactory();
        } else if (osName.contains("nix") || osName.contains("nux") || osName.contains("linux")) {
            return new LinuxFactory();
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        GUIFactory factory = getFactory();

        if (factory == null) {
            System.out.println("Unsupported OS");
            return;
        }

        Button button = factory.createButton();
        Dialog dialog = factory.createDialog();
        NotificationCenter notificationCenter = factory.createNotificationCenter();

        // Renderizar los elementos
        button.render();
        dialog.render();
        notificationCenter.notifyUser("This is a Linux notification!");
    }
}
