
import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejecutar {

    private static final int SALIR = 0;
    private static final int SI = 1;
    private static final int NO = 2;

    private static final int CREAR_DISPOSITIVOS = 1;
    private static final int ADMINISTRAR_DISPOSITIVO = 2;
    private static final int ACCIONES_DISPOSITIVO = 3;
    private static final int ACCIONES_EXTERNAS_DISPOSITIVOS = 4;
    private static final int CARGAS_MASIVAS = 5;
    private static final int LOGS = 6;

    private static final String COMPUTADORA_PORTATIL = "Computadora Portatil";
    private static final String TABLET = "Tablet";
    private static final String SMARTWATCH = "SmartWatch";
    private static final String SMARTPHONE = "SmartPhone";
    private static final String AURICULARES_INALAMBRICOS = "Auriculares inalambricos";
    
    private static final String EDITARCORREO = "Correo Electronico";
    private static final String EDITARNOMBRE = "Nombre del Dispositivo";
    private static final String VISIBILDIDAD = "Visibilidad del Dispositivo";

    private static final int COMPUTADORAS = 1;
    private static final int TABLETS = 2;
    private static final int SMARTWATCHS = 3;
    private static final int SMARTPHONES = 4;
    private static final int AURICULARES = 5;

    private static final String ARCHIVO_ACCIONES_EXTERNAS = "./acciones_externas.csv";
    private static final String ARCHIVO_ACCIONES = "./acciones.csv";
    private static final String ARCHIVO_DISPOSITIVOS = "./dispositivos.csv";
    private static final String ARCHIVO_NOTIFICACIONES = "./notificaciones.csv";

    public static Scanner teclado;

    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        listarWatches();

        List<Dispositivos> dispositvos = new ArrayList<>();
        List<Administracion> administraciones = new ArrayList<>();

        teclado = new Scanner(System.in);

        int opcion;
        int opcionSubMenu;

        do {
            do {
                mostrarMenuPrincipal();
                opcion = capturarNumeroEntero("Digite la operacion a realizar");

                if (opcion < SALIR || opcion > LOGS) {
                    mostrarMensaje("MENSAJE: Debe digitar un valor entre 0 y 6.");
                }

            } while (opcion < SALIR || opcion > LOGS);

            if (opcion == SALIR) {
                break;
            }

            System.out.println();

            switch (opcion) {
                case CREAR_DISPOSITIVOS:

                    do {
                        do {
                            mostrarMenuCreacionDispositivos("Dispositivos");
                            opcionSubMenu = capturarNumeroEntero("Digite la Operacion a realizar");

                            if (opcionSubMenu < SALIR || opcionSubMenu > AURICULARES) {
                                mostrarMensaje("MENSAJE: Debe digitar un valor entre 0 y 5.");
                                continuar();
                            }

                        } while (opcionSubMenu < SALIR || opcionSubMenu > AURICULARES);

                        if (opcionSubMenu == SALIR) {
                            break;
                        }

                        switch (opcionSubMenu) {
                            case COMPUTADORAS:

                                System.out.println();
                                System.out.println("--- CREAR COMPUTADORA PORTATIL ---");

                                String CorreoElectronico;
                                while (true) {

                                    CorreoElectronico = capturarCadenaCaracteres("Digite el correo electronico: ");

                                    if (!correoElectronicoValido(CorreoElectronico)) {
                                        mostrarMensaje("MENSAJE: Ha digito un valor que no corresponde con un correo electrónico.");
                                        continuar();
                                        continue;
                                    }
                                    break;
                                }

                                String nombreDispositivo = capturarCadenaCaracteres("Digite el nombre del dispositivo: ");
                                String visible = capturarCadenaCaracteres("Visible para la conexion si/no: ");

                                String tipoDispositivo = COMPUTADORA_PORTATIL;
                                String numeroTelefono = "";
                                String dispositivoAsociado = "";

                                dispositvos.add(new Dispositivos(tipoDispositivo, numeroTelefono, dispositivoAsociado,
                                        CorreoElectronico, nombreDispositivo, visible));

                                creaCompuTabletWatch(dispositvos);
                                break;

                            case TABLETS:

                                System.out.println();
                                System.out.println("--- CREAR TABLET ---");

                                String CorreoElectronico1;
                                while (true) {

                                    CorreoElectronico1 = capturarCadenaCaracteres("Digite el correo electronico: ");

                                    if (!correoElectronicoValido(CorreoElectronico1)) {
                                        mostrarMensaje("MENSAJE: Ha digito un valor que no corresponde con un correo electrónico.");
                                        continuar();
                                        continue;
                                    }
                                    break;
                                }

                                String nombreDispositivo1 = capturarCadenaCaracteres("Digite el nombre del dispositivo: ");
                                String visible1 = capturarCadenaCaracteres("Visible para la conexion si/no: ");

                                String tipoDispositivo1 = TABLET;
                                String numeroTelefono1 = "";
                                String dispositivoAsociado1 = "";

                                dispositvos.add(new Dispositivos(tipoDispositivo1, numeroTelefono1,
                                        dispositivoAsociado1, CorreoElectronico1, nombreDispositivo1,
                                        visible1));

                                creaCompuTabletWatch(dispositvos);
                                break;

                            case SMARTWATCHS:

                                System.out.println();
                                System.out.println("--- CREAR SMARTWATH ---\n");

                                String CorreoElectronico2;
                                while (true) {

                                    CorreoElectronico2 = capturarCadenaCaracteres("Digite el correo electronico: ");

                                    if (!correoElectronicoValido(CorreoElectronico2)) {
                                        mostrarMensaje("MENSAJE: Ha digito un valor que no corresponde con un correo electrónico.");
                                        continuar();
                                        continue;
                                    }
                                    break;
                                }

                                String nombreDispositivo2 = capturarCadenaCaracteres("Digite el nombre del dispositivo: ");
                                String visible2 = capturarCadenaCaracteres("Visible para la conexion si/no: ");

                                String tipoDispositivo2 = SMARTWATCH;
                                String numeroTelefono2 = "";
                                String dispositivoAsociado2 = "";

                                dispositvos.add(new Dispositivos(tipoDispositivo2, numeroTelefono2,
                                        dispositivoAsociado2, CorreoElectronico2, nombreDispositivo2,
                                        visible2));

                                creaCompuTabletWatch(dispositvos);
                                break;

                            case SMARTPHONES:

                                System.out.println();
                                System.out.println("--- CREAR SMARTPHONE ---");

                                String CorreoElectronico3;
                                while (true) {

                                    CorreoElectronico3 = capturarCadenaCaracteres("Digite el correo electronico: ");

                                    if (!correoElectronicoValido(CorreoElectronico3)) {
                                        mostrarMensaje("MENSAJE: Ha digito un valor que no corresponde con un correo electrónico.");
                                        continuar();
                                        continue;
                                    }
                                    break;
                                }

                                String nombreDispositivo3 = capturarCadenaCaracteres("Digite el nombre del dispositivo: ");
                                String visible3 = capturarCadenaCaracteres("Visible para la conexion si/no: ");
                                String numeroTelefono3 = capturarCadenaCaracteres("Digite el numero de telefono");

                                String tipoDispositivo3 = SMARTPHONE;
                                String dispositivoAsociado3 = "";

                                dispositvos.add(new Dispositivos(tipoDispositivo3, numeroTelefono3,
                                        dispositivoAsociado3, CorreoElectronico3, nombreDispositivo3,
                                        visible3));

                                creaCompuTabletWatch(dispositvos);
                                break;

                            case AURICULARES:

                                System.out.println();
                                System.out.println("--- CREAR AURICULARES ---");

                                String nombreDispositivo4 = capturarCadenaCaracteres("Digite el nombre del dispositivo");

                                System.out.println("Listado de Dispositivos\n");

                                listarDispositivos();

                                int noregistro = capturarNumeroEntero("Digite el numero de Dispositivo para enlazar los auriculares");

                                List<Dispositivos> dispositivos0 = new ArrayList<>(); // Lista donde guardaremos los datos del archivo

                                CsvReader leerDispositivos = new CsvReader(ARCHIVO_DISPOSITIVOS);
                                leerDispositivos.readHeaders();

                                // Mientras haya lineas obtenemos los datos del archivo
                                while (leerDispositivos.readRecord()) {
                                    String tipoDispositivo0 = leerDispositivos.get(0);
                                    String noTelefono0 = leerDispositivos.get(1);
                                    String dispoAsociado0 = leerDispositivos.get(2);
                                    String email0 = leerDispositivos.get(3);
                                    String nombreDispositivo0 = leerDispositivos.get(4);
                                    String visible0 = leerDispositivos.get(5);

                                    dispositivos0.add(new Dispositivos(tipoDispositivo0, noTelefono0,
                                            dispoAsociado0, email0, nombreDispositivo0, visible0)); // Añade la informacion a la lista
                                }

                                leerDispositivos.close(); // Cierra el archivo

                                String CorreoElectronico4 = null;
                                String dispositivoAsociado4 = null;
                                String numeroTelefono4 = null;
                                int contador = 0;
                                // Recorremos la lista y la mostramos en la pantalla
                                for (Dispositivos dispo : dispositivos0) {
                                    contador++;

                                    if (contador == noregistro) {

                                        CorreoElectronico4 = dispo.getCorreoElectronico();
                                        dispositivoAsociado4 = dispo.getNombreDispositivo();
                                        numeroTelefono4 = dispo.getNumeroTelefono();
                                    }
                                }

                                String visible4 = capturarCadenaCaracteres("Visible para la conexion si/no: ");
                                String tipoDispositivo4 = AURICULARES_INALAMBRICOS;

                                dispositvos.add(new Dispositivos(tipoDispositivo4, numeroTelefono4,
                                        dispositivoAsociado4, CorreoElectronico4, nombreDispositivo4,
                                        visible4));

                                creaCompuTabletWatch(dispositvos);
                                break;
                        }

                        continuar();
                    } while (opcionSubMenu != SALIR);

                    break;
        //ADMINISTRACION DE DISPOSITIVOS        
                case ADMINISTRAR_DISPOSITIVO:

                    do {
                        do {
                            mostrarMenuCreacionDispositivos("Dispositivos");
                            opcionSubMenu = capturarNumeroEntero("Digite la Operacion a realizar");

                            if (opcionSubMenu < SALIR || opcionSubMenu > AURICULARES) {
                                mostrarMensaje("MENSAJE: Debe digitar un valor entre 0 y 5.");
                                continuar();
                            }

                        } while (opcionSubMenu < SALIR || opcionSubMenu > AURICULARES);

                        if (opcionSubMenu == SALIR) {
                            break;
                        }

                        switch (opcionSubMenu) {

                            case COMPUTADORAS:

                                System.out.println();
                                System.out.println("--- CREAR SMARTWATH ---\n");

                                String CorreoElectronico2;
                                while (true) {

                                    CorreoElectronico2 = capturarCadenaCaracteres("Digite el correo electronico: ");

                                    if (!correoElectronicoValido(CorreoElectronico2)) {
                                        mostrarMensaje("MENSAJE: Ha digito un valor que no corresponde con un correo electrónico.");
                                        continuar();
                                        continue;
                                    }
                                    break;
                                }

                                String nombreDispositivo2 = capturarCadenaCaracteres("Digite el nombre del dispositivo: ");
                                String visible2 = capturarCadenaCaracteres("Visible para la conexion si/no: ");

                                String tipoDispositivo2 = SMARTWATCH;
                                String numeroTelefono2 = "";
                                String dispositivoAsociado2 = "";

                                dispositvos.add(new Dispositivos(tipoDispositivo2, numeroTelefono2,
                                        dispositivoAsociado2, CorreoElectronico2, nombreDispositivo2,
                                        visible2));

                                creaCompuTabletWatch(dispositvos);
                                break;

                            case TABLETS:

                                System.out.println();
                                System.out.println("--- EDITAR CORREO ELECTRONICO  ---\n");
                                

                                System.out.println("Listado de Dispositivos\n");

                                listarTablets();

                                int noregistro = capturarNumeroEntero("Digite un numero para administrar un dispositivo");

                                List<Dispositivos> dispositivos00 = new ArrayList<>(); // Lista donde guardaremos los datos del archivo

                                CsvReader leerDispositivos = new CsvReader(ARCHIVO_DISPOSITIVOS);
                                leerDispositivos.readHeaders();

                                // Mientras haya lineas obtenemos los datos del archivo
                                while (leerDispositivos.readRecord()) {
                                    String tipoDispositivo0 = leerDispositivos.get(0);
                                    String noTelefono0 = leerDispositivos.get(1);
                                    String dispoAsociado0 = leerDispositivos.get(2);
                                    String email0 = leerDispositivos.get(3);
                                    String nombreDispositivo0 = leerDispositivos.get(4);
                                    String visible0 = leerDispositivos.get(5);

                                    dispositivos00.add(new Dispositivos(tipoDispositivo0, noTelefono0,
                                            dispoAsociado0, email0, nombreDispositivo0, visible0)); // Añade la informacion a la lista
                                }

                                leerDispositivos.close(); // Cierra el archivo

                                String CorreoElectronico51 = capturarCadenaCaracteres("Digite el correo electronico: ");

                                if (!correoElectronicoValido(CorreoElectronico51)) {
                                    mostrarMensaje("MENSAJE: Ha digito un valor que no corresponde con un correo electrónico.");
                                    continuar();
                                    continue;

                                }
                                
                                String adminDispositivo = null;
                                String adminNombre = null;
                                String campoEditar = EDITARCORREO;
                                String nuevoValor = CorreoElectronico51;
                                int contador = 0;
                                // Recorremos la lista y la mostramos en la pantalla
                                for (Dispositivos dispo : dispositivos00) {
                                    contador++;

                                    if (contador == noregistro) {
                                        
                                        adminDispositivo = dispo.getTipoDispositivo();
                                        adminNombre = dispo.getNombreDispositivo();
                                        
                                        
                                        dispo.setCorreoElectronico(CorreoElectronico51);

                                    }
                                }

                                dispositvos.add(new Dispositivos(CorreoElectronico51));                                
                                creaCompuTabletWatch(dispositvos);
                                
                                administraciones.add(new Administracion(adminDispositivo, 
                                        adminNombre, campoEditar, nuevoValor));                                
                                Administracion.actualizar(administraciones);

                                break;
                            
                            case SMARTWATCHS:

                                System.out.println();
                                System.out.println("--- EDITAR NOMBRE DEL DISPOSITIVO  ---\n");
                                

                                System.out.println("Listado de Dispositivos\n");

                                listarWatches();

                                int noregistro01 = capturarNumeroEntero("Digite un numero para administrar un dispositivo");

                                List<Dispositivos> dispositivos01 = new ArrayList<>(); // Lista donde guardaremos los datos del archivo

                                CsvReader leerDispositivos01 = new CsvReader(ARCHIVO_DISPOSITIVOS);
                                leerDispositivos01.readHeaders();

                                // Mientras haya lineas obtenemos los datos del archivo
                                while (leerDispositivos01.readRecord()) {
                                    String tipoDispositivo0 = leerDispositivos01.get(0);
                                    String noTelefono0 = leerDispositivos01.get(1);
                                    String dispoAsociado0 = leerDispositivos01.get(2);
                                    String email0 = leerDispositivos01.get(3);
                                    String nombreDispositivo0 = leerDispositivos01.get(4);
                                    String visible0 = leerDispositivos01.get(5);

                                    dispositivos01.add(new Dispositivos(tipoDispositivo0, noTelefono0,
                                            dispoAsociado0, email0, nombreDispositivo0, visible0)); // Añade la informacion a la lista
                                }

                                leerDispositivos01.close(); // Cierra el archivo
                                
                                String adminDispositivo01 = null;
                                String adminNombre01 = null;
                                String campoEditar01 = EDITARNOMBRE;
                                String nuevoValor01 = capturarCadenaCaracteres("Digite el nuevo nombre del dispositivo");
                                
                                int contador01 = 0;
                                // Recorremos la lista y la mostramos en la pantalla
                                for (Dispositivos dispo : dispositivos01) {
                                    contador01++;

                                    if (contador01 == noregistro01) {
                                        
                                        adminDispositivo01 = dispo.getTipoDispositivo();
                                        adminNombre01 = dispo.getNombreDispositivo();  
                                        
                                        dispo.setNombreDispositivo(nuevoValor01);

                                    }
                                }

                                dispositvos.add(new Dispositivos(nuevoValor01));                                
                                creaCompuTabletWatch(dispositvos);
                                
                                administraciones.add(new Administracion(adminDispositivo01, 
                                        adminNombre01, campoEditar01, nuevoValor01));                                
                                Administracion.actualizar(administraciones);

                                break;
                             
                            case SMARTPHONES:

                                System.out.println();
                                System.out.println("--- APAGAR DISPOSITIVO  ---\n");
                                

                                System.out.println("Listado de Dispositivos\n");

                                listarPhones();

                                int noregistro02 = capturarNumeroEntero("Digite un numero para administrar un dispositivo");

                                List<Dispositivos> dispositivos02 = new ArrayList<>(); // Lista donde guardaremos los datos del archivo

                                CsvReader leerDispositivos02 = new CsvReader(ARCHIVO_DISPOSITIVOS);
                                leerDispositivos02.readHeaders();

                                // Mientras haya lineas obtenemos los datos del archivo
                                while (leerDispositivos02.readRecord()) {
                                    String tipoDispositivo = leerDispositivos02.get(0);
                                    String noTelefono = leerDispositivos02.get(1);
                                    String dispoAsociado = leerDispositivos02.get(2);
                                    String email = leerDispositivos02.get(3);
                                    String nombreDispositivo = leerDispositivos02.get(4);
                                    String visible = leerDispositivos02.get(5);

                                    dispositivos02.add(new Dispositivos(tipoDispositivo, noTelefono,
                                            dispoAsociado, email, nombreDispositivo, visible)); // Añade la informacion a la lista
                                }

                                leerDispositivos02.close(); // Cierra el archivo
                                
                                String adminDispositivo02 = null;
                                String adminNombre02 = null;
                                String campoEditar02 = VISIBILDIDAD;
                                String visible02 = capturarCadenaCaracteres("visibilidad si/no: ");;
                                String nuevoValor02 = visible02;
                                
                                
                                int contador02 = 0;
                                // Recorremos la lista y la mostramos en la pantalla
                                for (Dispositivos dispo : dispositivos02) {
                                    contador02++;

                                    if (contador02 == noregistro02) {
                                        
                                        adminDispositivo02 = dispo.getTipoDispositivo();
                                        adminNombre02 = dispo.getNombreDispositivo();  
                                        
                                        dispo.setVisible(visible02);

                                    }
                                }

                                dispositvos.add(new Dispositivos(nuevoValor02));                                
                                creaCompuTabletWatch(dispositvos);
                                
                                administraciones.add(new Administracion(adminDispositivo02, 
                                        adminNombre02, campoEditar02, nuevoValor02));                                
                                Administracion.actualizar(administraciones);

                                break;
                        }

                        continuar();
                    } while (opcionSubMenu != SALIR);

                    break;

                case ACCIONES_DISPOSITIVO:

                    break;

                case ACCIONES_EXTERNAS_DISPOSITIVOS:

                    break;

                case CARGAS_MASIVAS:

                    break;

                case LOGS:

                    break;
            }
        } while (true);

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

    public static void mostrarMenuPrincipal() {
        System.out.println("------- Ecosistema de Dispositivos -------\n");
        System.out.println("1. Crear dispositivos");
        System.out.println("2. Administrar dispositivo");
        System.out.println("3. Acciones con dispositivos");
        System.out.println("4. Acciones externas de dispositivos");
        System.out.println("5. Cargas masivas");
        System.out.println("6. Logs\n");
        System.out.println("0. Salir");
    }

    public static void mostrarMenuCreacionDispositivos(String tipoMenu) {
        System.out.printf("------- Menu creacion %s-------\n", tipoMenu);
        System.out.println("1. Computadora portatil");
        System.out.println("2. Tablet");
        System.out.println("3. SmartWatch");
        System.out.println("4. Smartphone");
        System.out.println("5. Auriculares inalambricos\n");
        System.out.println("0. Salir\n");
    }

    public static void menuEditarDispositivos(String tipoMenu) {
        System.out.printf("------- Admnistracion de %s-------\n", tipoMenu);
        System.out.println("Nombre del Dispositivo seleccionado: ");
        System.out.println("1. Editar correo Electronico");
        System.out.println("2. Editar nombre del Dispositivo");
        System.out.println("3. Visibilidad del dispositivo");
        System.out.println("0. Salir\n");
    }

    public static int capturarNumeroEntero(String mensaje) {
        while (true) {
            try {
                System.out.printf("%s: ", mensaje);
                return Integer.parseInt(teclado.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("\nMENSAJE: Digite un valor que corresponda con un número entero.");
            }

            continuar();
        }
    }

    public static String capturarCadenaCaracteres(String mensaje) {
        String resultado;
        while (true) {
            System.out.printf("%s: ", mensaje);
            resultado = teclado.nextLine();

            if (!resultado.isEmpty()) {
                return resultado;
            }

            System.out.println("\nMENSAJE: Ha escrito una cadena vacía. Específique un valor concreto.");

            continuar();
        }
    }

    public static double capturarNumeroReal(String mensaje) {
        while (true) {
            try {
                System.out.printf("%s: ", mensaje);
                return Double.parseDouble(teclado.nextLine());

            } catch (NumberFormatException e) {
                System.out.println("\nMENSAJE: Digite un valor que corresponda con un número real.");
            }
        }
    }

    static boolean correoElectronicoValido(String correo) {
        String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        return correo.matches(regex);
    }

    static void continuar() {
        System.out.println();
        System.out.print("Presione Enter para continuar...");
        teclado.nextLine();
        System.out.println();
    }

    static void mostrarMensaje(String mensaje) {
        System.out.println();
        System.out.printf(mensaje);
        System.out.println();
    }
}
