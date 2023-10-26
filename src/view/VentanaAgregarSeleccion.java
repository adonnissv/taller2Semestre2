package view;

import controller.SeleccionController;
import model.Seleccion;
import model.Jugador;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaAgregarSeleccion {
    private JFrame frame;
    private JTextField idField;
    private JTextField nombrePaisField;
    private JTextField rankingField;
    private JButton agregarSeleccionButton;
    private SeleccionController controller;

    public VentanaAgregarSeleccion(SeleccionController controller) {
        this.controller = controller; // Asignar el controlador

        frame = new JFrame("Agregar Selección");
        idField = new JTextField(10);
        nombrePaisField = new JTextField(20);
        rankingField = new JTextField(10);
        agregarSeleccionButton = new JButton("Agregar Selección");

        agregarSeleccionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int id = Integer.parseInt(idField.getText());
                String nombrePais = nombrePaisField.getText();
                int ranking = Integer.parseInt(rankingField.getText());

                Seleccion nuevaSeleccion = new Seleccion(id, nombrePais, ranking);
                controller.agregarSeleccion(nuevaSeleccion);

                JOptionPane.showMessageDialog(frame, "Selección agregada con éxito", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                frame.dispose();
            }
        });

        JPanel panel = new JPanel(new GridLayout(4, 2));
        panel.add(new JLabel("ID de Selección:"));
        panel.add(idField);
        panel.add(new JLabel("Nombre del País:"));
        panel.add(nombrePaisField);
        panel.add(new JLabel("Ranking:"));
        panel.add(rankingField);
        panel.add(new JLabel("")); // Espacio en blanco
        panel.add(agregarSeleccionButton);

        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(300, 200);
    }

    public void mostrarVentana() {
        frame.setVisible(true);
    }
}

