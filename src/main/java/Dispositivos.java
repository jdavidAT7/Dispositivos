import java.util.List;

public class Dispositivos {

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


}
