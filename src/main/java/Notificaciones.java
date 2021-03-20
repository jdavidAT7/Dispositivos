
import java.util.Date;

public class Notificaciones {

    private String notificacion;
    private String nombreEquipo;
    private String asuntoCorreo;
    private String nombreEvento;
    private Date fecha;
    private String hora;

    public Notificaciones() {
    }

    public Notificaciones(String notificacion, String nombreEquipo, 
            String asuntoCorreo, String nombreEvento, Date fecha, String hora) {
        this.notificacion = notificacion;
        this.nombreEquipo = nombreEquipo;
        this.asuntoCorreo = asuntoCorreo;
        this.nombreEvento = nombreEvento;
        this.fecha = fecha;
        this.hora = hora;
    }

    public String getNotificacion() {
        return notificacion;
    }

    public void setNotificacion(String notificacion) {
        this.notificacion = notificacion;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public String getAsuntoCorreo() {
        return asuntoCorreo;
    }

    public void setAsuntoCorreo(String asuntoCorreo) {
        this.asuntoCorreo = asuntoCorreo;
    }

    public String getNombreEvento() {
        return nombreEvento;
    }

    public void setNombreEvento(String nombreEvento) {
        this.nombreEvento = nombreEvento;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }   
    
}
