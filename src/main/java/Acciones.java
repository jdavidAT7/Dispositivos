public class Acciones {

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

    
}
