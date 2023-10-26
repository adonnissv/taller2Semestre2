package view;

import controller.SeleccionController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaMenu {
    private JFrame frame;
    private JButton agregarSeleccionButton;

    public VentanaMenu() {
        frame = new JFrame("Menú Principal");
        agregarSeleccionButton = new JButton("Agregar Selección");
        agregarSeleccionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VentanaAgregarSeleccion ventanaAgregarSeleccion = new VentanaAgregarSeleccion();
                ventanaAgregarSeleccion.mostrarVentana();
            }
        });
        frame.add(agregarSeleccionButton);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
    }

    public void mostrarMenu() {
        frame.setVisible(true);
    }
}
