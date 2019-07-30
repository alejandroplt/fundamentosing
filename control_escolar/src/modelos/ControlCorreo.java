package modelos;

public class ControlCorreo {

    int id;
    String correodestino;
    String asunto;
    String fecha;

    public ControlCorreo() {

    }

    public ControlCorreo(int id, String correodestino, String asunto, String fecha) {
        this.id = id;
        this.correodestino = correodestino;
        this.asunto = asunto;
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCorreodestino() {
        return correodestino;
    }

    public void setCorreodestino(String correodestino) {
        this.correodestino = correodestino;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

}
