package abstractFactory;

import javax.swing.*;
import java.awt.*;
import java.awt.Button;
import java.awt.Dialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame {
    private UIFactory factory;
    private JPanel panel;

    public MainWindow() {
        setTitle("Gestor de Interfaces - Abstract Factory");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Configuración del menú
        JMenuBar menuBar = new JMenuBar();
        JMenu platformMenu = new JMenu("Seleccionar Plataforma");
        menuBar.add(platformMenu);

        JMenuItem windowsItem = new JMenuItem("Windows");
        JMenuItem linuxItem = new JMenuItem("Linux");
        JMenuItem mobileItem = new JMenuItem("Mobile");

        platformMenu.add(windowsItem);
        platformMenu.add(linuxItem);
        platformMenu.add(mobileItem);

        setJMenuBar(menuBar);

        // Panel principal
        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        add(panel);

        // Listeners para el menú
        windowsItem.addActionListener(e -> setPlatform(new WindowsFactory()));
        linuxItem.addActionListener(e -> setPlatform(new LinuxFactory()));
        mobileItem.addActionListener(e -> setPlatform(new MobileFactory()));
    }

    private void setPlatform(UIFactory factory) {
        this.factory = factory;
        renderUIComponents();
    }

    private void renderUIComponents() {
        panel.removeAll(); // Limpia el panel antes de agregar nuevos componentes

        if (factory == null) return;

        Button button = factory.createButton();
        Menu menu = factory.createMenu();
        Dialog dialog = factory.createDialog();
        NotificationCenter notificationCenter = factory.createNotificationCenter();

        // Crear y renderizar los componentes
        JButton swingButton = new JButton("Mostrar Botón");
        swingButton.addActionListener(e -> button.render());
        panel.add(swingButton);

        JButton showMenuButton = new JButton("Mostrar Menú");
        showMenuButton.addActionListener(e -> menu.render());
        panel.add(showMenuButton);

        JButton showDialogButton = new JButton("Mostrar Diálogo");
        showDialogButton.addActionListener(e -> dialog.render());
        panel.add(showDialogButton);

        JButton showNotificationButton = new JButton("Notificación");
        showNotificationButton.addActionListener(e -> notificationCenter.showNotification("Aviso", "Esto es una notificación"));
        panel.add(showNotificationButton);

        panel.revalidate();
        panel.repaint();
    }
}

