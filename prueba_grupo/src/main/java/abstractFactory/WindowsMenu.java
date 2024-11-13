package abstractFactory;

public class WindowsMenu implements Menu {
    @Override
    public void render() {
        System.out.println("Rendering Windows Menu");
    }
}
