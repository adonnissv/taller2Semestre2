package view;

import controller.SeleccionController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaBuscarSeleccion {
    private JFrame frame;
    private JTextField idSeleccionField;
    private JButton buscarButton;

    public VentanaBuscarSeleccion() {
        frame = new JFrame("Buscar Selección");
        idSeleccionField = new JTextField(10);
        buscarButton = new JButton("Buscar");

        buscarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int idSeleccion = Integer.parseInt(idSeleccionField.getText());

                SeleccionController controller = new SeleccionController();
model.Seleccion seleccion = controller.buscarSeleccionPorId(idSeleccion);

                if (seleccion != null) {
                    VentanaMostrarSeleccion ventanaMostrarSeleccion = new VentanaMostrarSeleccion(seleccion);
                    ventanaMostrarSeleccion.mostrarVentana();
                } else {
                    JOptionPane.showMessageDialog(frame, "No se encontró la selección con el ID ingresado");
                }
            }
        });

        JPanel panel = new JPanel();
        panel.add(new JLabel("ID de Selección:"));
        panel.add(idSeleccionField);
        panel.add(buscarButton);

        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(300, 150);
    }

    public void mostrarVentana() {
        frame.setVisible(true);
    }
}

