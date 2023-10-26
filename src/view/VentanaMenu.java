package view;

import controller.SeleccionController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaMenu {
    private JFrame frame;
    private JButton agregarSeleccionButton;
    private JButton buscarSeleccionButton;

    public VentanaMenu() {
        frame = new JFrame("Menú Principal");
        agregarSeleccionButton = new JButton("Agregar Selección");
        buscarSeleccionButton = new JButton("Buscar Selección");

        agregarSeleccionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VentanaAgregarSeleccion ventanaAgregarSeleccion = new VentanaAgregarSeleccion(new SeleccionController());
                ventanaAgregarSeleccion.mostrarVentana();
            }
        });

        buscarSeleccionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VentanaBuscarSeleccion ventanaBuscarSeleccion = new VentanaBuscarSeleccion();
                ventanaBuscarSeleccion.mostrarVentana();
            }
        });

        JPanel panel = new JPanel();
        panel.add(agregarSeleccionButton);
        panel.add(buscarSeleccionButton);

        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
    }

    public void mostrarMenu() {
        frame.setVisible(true);
    }
}
