package model;

        import java.util.ArrayList;
        import java.util.List;

public class Seleccion {
    private int id;
    private String nombrePais;
    private int ranking;
    private List<Jugador> jugadores;

    public Seleccion(int id, String nombrePais, int ranking) {
        this.id = id;
        this.nombrePais = nombrePais;
        this.ranking = ranking;
        this.jugadores = new ArrayList<>();
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombrePais() {
        return nombrePais;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }


}
