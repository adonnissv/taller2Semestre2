package controller;

import model.Seleccion;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SeleccionController {
    private List<Seleccion> listaDeSelecciones;
    private String archivoSelecciones = "selecciones.txt";

    public SeleccionController() {
        listaDeSelecciones = new ArrayList<>();
        cargarSeleccionesDesdeArchivo();
    }

    public void agregarSeleccion(Seleccion seleccion) {
        listaDeSelecciones.add(seleccion);
        guardarSeleccionesEnArchivo();
    }

    public Seleccion buscarSeleccionPorId(int idSeleccion) {
        for (Seleccion seleccion : listaDeSelecciones) {
            if (seleccion.getId() == idSeleccion) {
                return seleccion;
            }
        }
        return null;
    }

    private void cargarSeleccionesDesdeArchivo() {
        try (BufferedReader reader = new BufferedReader(new FileReader(archivoSelecciones))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Analiza cada línea del archivo y crea instancias de Selección
                String[] partes = line.split(",");
                if (partes.length == 3) {
                    int id = Integer.parseInt(partes[0]);
                    String nombrePais = partes[1];
                    int ranking = Integer.parseInt(partes[2]);
                    listaDeSelecciones.add(new Seleccion(id, nombrePais, ranking));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void guardarSeleccionesEnArchivo() {

    }

}

