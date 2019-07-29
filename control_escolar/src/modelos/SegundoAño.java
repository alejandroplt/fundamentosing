package modelos;

public class SegundoAño {

    int id;
    String grado;
    int grupo;
    int nombrealumno;
    int docente;

    public SegundoAño() {

    }

    public SegundoAño(int id, String grado, int grupo, int nombrealu, int docente) {
        this.id = id;
        this.grado = grado;
        this.grupo = grupo;
        this.nombrealumno = nombrealu;
        this.docente = docente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public int getGrupo() {
        return grupo;
    }

    public void setGrupo(int grupo) {
        this.grupo = grupo;
    }

    public int getNombrealumno() {
        return nombrealumno;
    }

    public void setNombrealumno(int nombrealumno) {
        this.nombrealumno = nombrealumno;
    }

    public int getDocente() {
        return docente;
    }

    public void setDocente(int docente) {
        this.docente = docente;
    }
}
