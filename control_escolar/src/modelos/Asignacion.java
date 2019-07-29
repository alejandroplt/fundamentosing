package modelos;

public class Asignacion {

    int id;
    String numero;
    String ncompleto;

    public Asignacion() {

    }

    public Asignacion(int id, String numero, String ncompleto) {
        this.id = id;
        this.numero = numero;
        this.ncompleto = ncompleto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNcompleto() {
        return ncompleto;
    }

    public void setNcompleto(String ncompleto) {
        this.ncompleto = ncompleto;
    }
}
