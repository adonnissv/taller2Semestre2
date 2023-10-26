package view;

import model.Seleccion;
import model.Jugador;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class VentanaMostrarSeleccion {
    private JFrame frame;
    private JTextArea textArea;

    public VentanaMostrarSeleccion(Seleccion seleccion) {
        frame = new JFrame("Mostrar Selección");
        textArea = new JTextArea(10, 40);
        textArea.setEditable(false);

        List<Jugador> jugadores = seleccion.getJugadores();

        textArea.append("ID de Selección: " + seleccion.getId() + "\n");
        textArea.append("Nombre del País: " + seleccion.getNombrePais() + "\n");
        textArea.append("Ranking: " + seleccion.getRanking() + "\n");
        textArea.append("Jugadores:\n");

        for (Jugador jugador : jugadores) {
            textArea.append("Número: " + jugador.getNum() + ", Nombre: " + jugador.getNombreJugador() + ", Posición: " + jugador.getPosicion() + "\n");
        }

        JScrollPane scrollPane = new JScrollPane(textArea);

        frame.add(scrollPane);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(400, 300);
    }

    public void mostrarVentana() {
        frame.setVisible(true);
    }
}
