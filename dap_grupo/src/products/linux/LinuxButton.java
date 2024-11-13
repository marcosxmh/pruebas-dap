package products.linux;

import products.Button;

public class LinuxButton implements Button {
    @Override
    public void render() {
        GtkLibrary.INSTANCE.gtk_init(0, null);

        long window = GtkLibrary.INSTANCE.gtk_window_new(0);
        GtkLibrary.INSTANCE.gtk_window_set_title(window, "Linux Button");
        GtkLibrary.INSTANCE.gtk_window_set_default_size(window, 300, 200);
        GtkLibrary.INSTANCE.gtk_widget_show_all(window);

        GtkLibrary.INSTANCE.gtk_main();
    }
}
