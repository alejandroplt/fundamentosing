package modelos;

public class GruposDisponibles {

    int id;
//    int grado;
    String numero;
//    int grupo;
    String identificador;
//    int docente;
    String nombrecompleto;

    public GruposDisponibles() {

    }

    public GruposDisponibles(int id, String numero, String identificador, String nombrecompleto) {
        this.id = id;
//        this.grado = grado;
//        this.grupo = grupo;
//        this.docente = docente;
        this.numero = numero;
        this.identificador = identificador;
        this.nombrecompleto = nombrecompleto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

//    public int getGrado() {
//        return grado;
//    }
//
//    public void setGrado(int grado) {
//        this.grado = grado;
//    }
//
//    public int getGrupo() {
//        return grupo;
//    }
//
//    public void setGrupo(int grupo) {
//        this.grupo = grupo;
//    }
//
//    public int getDocente() {
//        return docente;
//    }
//
//    public void setDocente(int docente) {
//        this.docente = docente;
//    }
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getNombrecompleto() {
        return nombrecompleto;
    }

    public void setNombrecompleto(String nombrecompleto) {
        this.nombrecompleto = nombrecompleto;
    }
}
