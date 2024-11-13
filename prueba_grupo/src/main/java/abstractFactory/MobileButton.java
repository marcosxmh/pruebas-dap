package abstractFactory;

public class MobileButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering Mobile Button");
    }
}
