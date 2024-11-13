package abstractFactory;

public class WindowsFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Menu createMenu() {
        return new WindowsMenu();
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
