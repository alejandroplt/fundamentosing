package modelos;

public class TercerAño {

    int id;
    String grado;
    String grupo;
    String nombrealumno;
    String docente;

    public TercerAño() {

    }

    public TercerAño(int id, String grado, String grupo, String nombrealumno, String docente) {
        this.id = id;
        this.grado = grado;
        this.grupo = grupo;
        this.nombrealumno = nombrealumno;
        this.docente = docente;
    }
    

    public int getId() {
        return id;
    }

    public String getGrado() {
        return grado;
    }

    public String getGrupo() {
        return grupo;
    }

    public String getNombrealumno() {
        return nombrealumno;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public void setNombrealumno(String nombrealumno) {
        this.nombrealumno = nombrealumno;
    }

    public void setDocente(String docente) {
        this.docente = docente;
    }
    

    public String getDocente() {
        return docente;
    }
    

    
}
