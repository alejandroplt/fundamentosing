package modelos;

public class Padres {

    int id;
    String nombrecompleto;
    String ocupacion;
    String direccion;
    String telefonocel;
    String telefonocasa;
    String correo;

    public Padres() {

    }

    public Padres(int id, String nombrecompleto, String ocupacion, String direccion, String telefonocel, String telefonocasa, String correo) {
        this.id = id;
        this.nombrecompleto = nombrecompleto;
        this.ocupacion = ocupacion;
        this.direccion = direccion;
        this.telefonocel = telefonocel;
        this.telefonocasa = telefonocasa;
        this.correo = correo;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombrecompleto() {
        return nombrecompleto;
    }

    public void setNombrecompleto(String nombrecompleto) {
        this.nombrecompleto = nombrecompleto;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefonocel() {
        return telefonocel;
    }

    public void setTelefonocel(String telefonocel) {
        this.telefonocel = telefonocel;
    }

    public String getTelefonocasa() {
        return telefonocasa;
    }

    public void setTelefonocasa(String telefonocasa) {
        this.telefonocasa = telefonocasa;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
