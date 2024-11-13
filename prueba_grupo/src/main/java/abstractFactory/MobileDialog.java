package abstractFactory;

public class MobileDialog implements Dialog {
    @Override
    public void render() {
        System.out.println("Rendering Mobile Dialog");
    }
}
