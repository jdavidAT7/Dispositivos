
import com.csvreader.CsvWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;


public class Administracion {
    
    private static final String ARCHIVO_ADMINISTRACIONES = "./administracion.csv";
    
    
    private String tipoDispositivo;
    private String nombreDispositivo;
    private String campoEditar;
    private String nuevoValor;

    public Administracion() {
    }

    public Administracion(String nombreDispositivo) {
        this.nombreDispositivo = nombreDispositivo;
    }
    

    public Administracion(String tipoDispositivo, String nombreDispositivo, 
            String campoEditar, String nuevoValor) {
        this.tipoDispositivo = tipoDispositivo;
        this.nombreDispositivo = nombreDispositivo;
        this.campoEditar = campoEditar;
        this.nuevoValor = nuevoValor;
    }  
    

    public String getTipoDispositivo() {
        return tipoDispositivo;
    }

    public void setTipoDispositivo(String tipoDispositivo) {
        this.tipoDispositivo = tipoDispositivo;
    }

    public String getNombreDispositivo() {
        return nombreDispositivo;
    }

    public void setNombreDispositivo(String nombreDispositivo) {
        this.nombreDispositivo = nombreDispositivo;
    }

    public String getCampoEditar() {
        return campoEditar;
    }

    public void setCampoEditar(String campoEditar) {
        this.campoEditar = campoEditar;
    }

    public String getNuevoValor() {
        return nuevoValor;
    }

    public void setNuevoValor(String nuevoValor) {
        this.nuevoValor = nuevoValor;
    }
    
    
    public static void actualizar(List<Administracion> adminitraciones) {
        String salidaArchivo = ARCHIVO_ADMINISTRACIONES; // Nombre del archivo

        try {
            // Crea el archivo
            CsvWriter salidaCSV = new CsvWriter(new FileWriter(salidaArchivo, true), ',');

            salidaCSV.endRecord(); // Deja de escribir en el archivo

            // Recorremos la lista y lo insertamos en el archivo
            for (Administracion admin : adminitraciones) {
                
                salidaCSV.write(admin.getTipoDispositivo());
                salidaCSV.write(admin.getNombreDispositivo());
                salidaCSV.write(admin.getCampoEditar());
                salidaCSV.write(admin.getNuevoValor());

                salidaCSV.endRecord(); // Deja de escribir en el archivo
            }

            salidaCSV.close(); // Cierra el archivo

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    
    
}
