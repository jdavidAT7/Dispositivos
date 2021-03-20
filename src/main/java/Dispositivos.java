
import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Dispositivos {
    
    private static final String ARCHIVO_DISPOSITIVOS = "./dispositivos.csv";

    private String tipoDispositivo;
    private String numeroTelefono;
    private String dispositivoAsociado;
    private String CorreoElectronico;
    private String nombreDispositivo;
    private String visible;

    public Dispositivos() {
    }

    public Dispositivos(String CorreoElectronico) {
        this.CorreoElectronico = CorreoElectronico;
    }

    public Dispositivos(String tipoDispositivo, String numeroTelefono, String dispositivoAsociado, String CorreoElectronico, String nombreDispositivo, String visible) {
        this.tipoDispositivo = tipoDispositivo;
        this.numeroTelefono = numeroTelefono;
        this.dispositivoAsociado = dispositivoAsociado;
        this.CorreoElectronico = CorreoElectronico;
        this.nombreDispositivo = nombreDispositivo;
        this.visible = visible;
    }

    public Dispositivos(String tipoDispositivo, String CorreoElectronico, String nombreDispositivo, String visible) {
        this.tipoDispositivo = tipoDispositivo;
        this.CorreoElectronico = CorreoElectronico;
        this.nombreDispositivo = nombreDispositivo;
        this.visible = visible;
    }

    public String getTipoDispositivo() {
        return tipoDispositivo;
    }

    public void setTipoDispositivo(String tipoDispositivo) {
        this.tipoDispositivo = tipoDispositivo;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getDispositivoAsociado() {
        return dispositivoAsociado;
    }

    public void setDispositivoAsociado(String dispositivoAsociado) {
        this.dispositivoAsociado = dispositivoAsociado;
    }

    public String getCorreoElectronico() {
        return CorreoElectronico;
    }

    public void setCorreoElectronico(String CorreoElectronico) {
        this.CorreoElectronico = CorreoElectronico;
    }

    public String getNombreDispositivo() {
        return nombreDispositivo;
    }

    public void setNombreDispositivo(String nombreDispositivo) {
        this.nombreDispositivo = nombreDispositivo;
    }

    public String getVisible() {
        return visible;
    }

    public void setVisible(String visible) {
        this.visible = visible;
    }

    public static void creaCompuTabletWatch(List<Dispositivos> dispositivos) {
        String salidaArchivo = ARCHIVO_DISPOSITIVOS; // Nombre del archivo

        try {
            // Crea el archivo
            CsvWriter salidaCSV = new CsvWriter(new FileWriter(salidaArchivo, true), ',');

            salidaCSV.endRecord(); // Deja de escribir en el archivo

            // Recorremos la lista y lo insertamos en el archivo
            for (Dispositivos dispo : dispositivos) {
                salidaCSV.write(dispo.getTipoDispositivo());
                salidaCSV.write(dispo.getNumeroTelefono());
                salidaCSV.write(dispo.getDispositivoAsociado());
                salidaCSV.write(dispo.getCorreoElectronico());
                salidaCSV.write(dispo.getNombreDispositivo());
                salidaCSV.write(dispo.getVisible());

                salidaCSV.endRecord(); // Deja de escribir en el archivo
            }

            salidaCSV.close(); // Cierra el archivo

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void listarDispositivos() {
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

            int contador = 0;
            // Recorremos la lista y la mostramos en la pantalla
            for (Dispositivos dispo : dispositivos) {
                contador++;

                System.out.println(contador + ". " + dispo.getNombreDispositivo() + ",\t"
                        + dispo.getCorreoElectronico());
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void listarTablets() {
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

            String letra = "tablet";
            int contador = 0;
            // Recorremos la lista y la mostramos en la pantalla
            for (Dispositivos dispo : dispositivos) {
                contador++;
                if (dispo.getTipoDispositivo().equalsIgnoreCase(letra)) {
                    System.out.println(contador + ". " + dispo.getNombreDispositivo() + ",\t"
                            + dispo.getVisible());
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void listarWatches() {
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

            String letra = "smartwatch";
            int contador = 0;
            // Recorremos la lista y la mostramos en la pantalla
            for (Dispositivos dispo : dispositivos) {
                contador++;
                if (dispo.getTipoDispositivo().equalsIgnoreCase(letra)) {
                    System.out.println(contador + ". " + dispo.getNombreDispositivo() + ",\t"
                            + dispo.getVisible());
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void listarPhones() {
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

            String letra = "smartphone";
            int contador = 0;
            // Recorremos la lista y la mostramos en la pantalla
            for (Dispositivos dispo : dispositivos) {
                contador++;
                if (dispo.getTipoDispositivo().equalsIgnoreCase(letra)) {
                    System.out.println(contador + ". " + dispo.getNombreDispositivo() + ",\t"
                            + dispo.getVisible());
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void listarAuriculares() {
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

            String letra = "auriculares";
            int contador = 0;
            // Recorremos la lista y la mostramos en la pantalla
            for (Dispositivos dispo : dispositivos) {
                contador++;
                if (dispo.getTipoDispositivo().equalsIgnoreCase(letra)) {
                    System.out.println(contador + ". " + dispo.getNombreDispositivo() + ",\t"
                            + dispo.getVisible());
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
