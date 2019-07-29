package modelos;

public class Alumnos {

    int id;
    String nombrecom;
    String curp;
    String fechanaci;
    String sexo;
    String grpsangre;
//    int idgrado;
    String numero;
//    int idpadre;
    String NombreCompleto;

    public Alumnos() {

    }

    public Alumnos(int id, String nombrecom, String curp, String fechana, String sexo, String grpsangre, String numero, String nombrecompleto) {
        this.id = id;
        this.nombrecom = nombrecom;
        this.curp = curp;
        this.fechanaci = fechana;
        this.sexo = sexo;
        this.grpsangre = grpsangre;
//        this.idgrado = idgrado;
        this.numero = numero;
        this.NombreCompleto = nombrecom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombrecom() {
        return nombrecom;
    }

    public void setNombrecom(String nombrecom) {
        this.nombrecom = nombrecom;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getFechanaci() {
        return fechanaci;
    }

    public void setFechanaci(String fechanaci) {
        this.fechanaci = fechanaci;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getGrpsangre() {
        return grpsangre;
    }

    public void setGrpsangre(String grpsangre) {
        this.grpsangre = grpsangre;
    }

//    public int getIdgrado() {
//        return idgrado;
//    }
//
//    public void setIdgrado(int idgrado) {
//        this.idgrado = idgrado;
//    }
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNombreCompleto() {
        return NombreCompleto;
    }

    public void setNombreCompleto(String NombreCompleto) {
        this.NombreCompleto = NombreCompleto;
    }
}
