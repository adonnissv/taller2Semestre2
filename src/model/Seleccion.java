package model;

public class Seleccion {
    private int id;
    private String nombrePais;
    private int ranking;

    public Seleccion(int id, String nombrePais, int ranking) {
        this.id = id;
        this.nombrePais = nombrePais;
        this.ranking = ranking;
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
