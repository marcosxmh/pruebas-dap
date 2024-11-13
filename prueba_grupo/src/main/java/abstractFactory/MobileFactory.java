package abstractFactory;

public class MobileFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new MobileButton();
    }

    @Override
    public Menu createMenu() {
        return new MobileMenu();
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
