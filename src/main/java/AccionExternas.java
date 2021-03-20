public class AccionExternas {

    private String accion;
    private String noTelefono;
    private String tipoAccion;
    private String txtMensaje;
    private String noAppRedSocial;
    private String remitente;

    public AccionExternas() {
    }

    public AccionExternas(String accion, String noTelefono, String tipoAccion, 
            String txtMensaje, String noAppRedSocial, String remitente) {
        this.accion = accion;
        this.noTelefono = noTelefono;
        this.tipoAccion = tipoAccion;
        this.txtMensaje = txtMensaje;
        this.noAppRedSocial = noAppRedSocial;
        this.remitente = remitente;
    }   

    public String getAccion() {
        return accion;
    }

    public void setAccion(String accion) {
        this.accion = accion;
    }

    public String getNoTelefono() {
        return noTelefono;
    }

    public void setNoTelefono(String noTelefono) {
        this.noTelefono = noTelefono;
    }

    public String getTipoAccion() {
        return tipoAccion;
    }

    public void setTipoAccion(String tipoAccion) {
        this.tipoAccion = tipoAccion;
    }

    public String getTxtMensaje() {
        return txtMensaje;
    }

    public void setTxtMensaje(String txtMensaje) {
        this.txtMensaje = txtMensaje;
    }

    public String getNoAppRedSocial() {
        return noAppRedSocial;
    }

    public void setNoAppRedSocial(String noAppRedSocial) {
        this.noAppRedSocial = noAppRedSocial;
    }

    public String getRemitente() {
        return remitente;
    }

    public void setRemitente(String remitente) {
        this.remitente = remitente;
    }

    

    
}
