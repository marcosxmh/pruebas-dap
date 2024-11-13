package abstractFactory;

public class LinuxDialog implements Dialog {
    @Override
    public void render() {
        System.out.println("Rendering Linux Dialog");
    }
}
