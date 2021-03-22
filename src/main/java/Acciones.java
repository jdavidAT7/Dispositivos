
import com.csvreader.CsvReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Acciones {

    private static final String ARCHIVO_DISPOSITIVOS = "./dispositivos.csv";

    private String tipoAccion;
    private String nombreDispositivo;
    private String accion;
    private String dispositivoDestino;

    public Acciones() {
    }

    public Acciones(String tipoAccion, String nombreDispositivo, String accion,
            String dispositivoDestino) {
        this.tipoAccion = tipoAccion;
        this.nombreDispositivo = nombreDispositivo;
        this.accion = accion;
        this.dispositivoDestino = dispositivoDestino;
    }

    public String getTipoAccion() {
        return tipoAccion;
    }

    public void setTipoAccion(String tipoAccion) {
        this.tipoAccion = tipoAccion;
    }

    public String getNombreDispositivo() {
        return nombreDispositivo;
    }

    public void setNombreDispositivo(String nombreDispositivo) {
        this.nombreDispositivo = nombreDispositivo;
    }

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    public String getDispositivoDestino() {
        return dispositivoDestino;
    }

    public void setDispositivoDestino(String dispositivoDestino) {
        this.dispositivoDestino = dispositivoDestino;
    }

    public static void verificarSmartphone() {
        try {
            List<Dispositivos> dispositivos = new ArrayList<>(); // Lista donde guardaremos los datos del archivo

            CsvReader leerDispositivos = new CsvReader(ARCHIVO_DISPOSITIVOS);
            leerDispositivos.readHeaders();

            // Mientras haya lineas obtenemos los datos del archivo
            while (leerDispositivos.readRecord()) {
                String tipoDispositivo = leerDispositivos.get(0);
                String noTelefono = leerDispositivos.get(1);
                String dispoAsociado = leerDispositivos.get(2);
                String email = leerDispositivos.get(3);
                String nombreDispositivo = leerDispositivos.get(4);
                String visible = leerDispositivos.get(5);

                dispositivos.add(new Dispositivos(tipoDispositivo, noTelefono,
                        dispoAsociado, email, nombreDispositivo, visible)); // Añade la informacion a la lista
            }

            leerDispositivos.close(); // Cierra el archivo

            String letra = "computadora portatil";
            String letra2 = "smartphone";
            int contador = 0;
            String correo = null;
            // Recorremos la lista y la mostramos en la pantalla
            for (Dispositivos dispo : dispositivos) {
                if (dispo.getTipoDispositivo().equalsIgnoreCase(letra)) {
                    correo = dispo.getCorreoElectronico();
                    break;
                }
            }

            for (Dispositivos dispo : dispositivos) {
                if (dispo.getTipoDispositivo().equalsIgnoreCase(letra2)) {
                    if (correo.equals(dispo.getCorreoElectronico())) {
                        System.out.println("Si existen dispositivos asosciados con el correo");
                    }else{
                        System.out.println("No existen dispositivos asosciados con el correo");
                    }

                }
            }
            /*
            for (Dispositivos dispo : dispositivos) {
                contador++;
                if (dispo.getTipoDispositivo().equalsIgnoreCase(letra)) {
                    System.out.println(contador + ". " + dispo.getNombreDispositivo() + ",\t"
                            + dispo.getVisible());
                }
            }
             */

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
