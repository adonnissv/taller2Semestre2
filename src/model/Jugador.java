package model;

public class Jugador {
    private int num;
    private String nombreJugador;
    private String posicion;

    public Jugador(int num, String nombreJugador, String posicion) {
        this.num = num;
        this.nombreJugador = nombreJugador;
        this.posicion = posicion;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getNombreJugador() {
        return nombreJugador;
    }

    public void setNombreJugador(String nombreJugador) {
        this.nombreJugador = nombreJugador;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

}
