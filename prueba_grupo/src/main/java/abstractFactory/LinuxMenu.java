package abstractFactory;

public class LinuxMenu implements Menu {
    @Override
    public void render() {
        System.out.println("Rendering Linux Menu");
    }
}
