package products.linux;

import products.Dialog;

public class LinuxDialog implements Dialog {
    @Override
    public void render() {
        GtkLibrary.INSTANCE.gtk_init(0, null);

        long dialog = GtkLibrary.INSTANCE.gtk_window_new(1);
        GtkLibrary.INSTANCE.gtk_window_set_title(dialog, "Linux Dialog");
        GtkLibrary.INSTANCE.gtk_window_set_default_size(dialog, 200, 100);
        GtkLibrary.INSTANCE.gtk_widget_show_all(dialog);

        GtkLibrary.INSTANCE.gtk_main();
    }
}
