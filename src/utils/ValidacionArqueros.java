package utils;

import model.Seleccion;
import model.Jugador;

public class ValidacionArqueros {
    public boolean tieneTresArqueros(Seleccion seleccion) {
        int arqueros = 0;
        for (Jugador jugador : seleccion.getJugadores()) {
            if (jugador.getPosicion().equalsIgnoreCase("portero")) {
                arqueros++;
            }
            if (arqueros >= 3) {
                return true;
            }
        }
        return false;
    }
}
