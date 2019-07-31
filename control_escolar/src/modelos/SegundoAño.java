package modelos;

public class SegundoAño {

    int id;
    String grado;
    String grupo;
    String nombrealumno;
    String docente;

    public SegundoAño() {

    }

    public SegundoAño(int id, String grado, String grupo, String nombrealumno) {
        this.id = id;
        this.grado = grado;
        this.grupo = grupo;
        this.nombrealumno = nombrealumno;
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

    public String getDocente() {
        return docente;
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
    
    
    

    
}
