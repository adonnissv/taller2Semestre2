package data;
import model.Seleccion;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class SeleccionesData {
    public void guardarSeleccion(Seleccion seleccion) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("selecciones.txt", true))) {
            writer.write(seleccion.getId() + "," + seleccion.getNombrePais() + "," + seleccion.getRanking());
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
