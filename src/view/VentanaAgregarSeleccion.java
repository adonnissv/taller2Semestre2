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
    private JTextField numJugadorField;
    private JTextField nombreJugadorField;
    private JComboBox<String> posicionComboBox;
    private JButton agregarJugadorButton;

    public VentanaAgregarSeleccion() {
        frame = new JFrame("Agregar Selección");
    }

    public void mostrarVentana() {
        frame.setVisible(true);
    }
}
