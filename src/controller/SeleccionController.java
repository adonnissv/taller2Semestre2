package controller;
import model.Seleccion;
import data.SeleccionesData;

public class SeleccionController {
    private SeleccionesData data;

    public SeleccionController() {
        this.data = new SeleccionesData();
    }

    public void agregarSeleccion(Seleccion seleccion) {
        data.guardarSeleccion(seleccion);
    }

}
