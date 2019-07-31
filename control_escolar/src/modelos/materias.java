/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author Román
 */
public class materias {
    int id_materia;
    String materia;
    String grado;
 public materias(){
     
 }
    public materias(int id_materia, String materia, String grado) {
        this.id_materia = id_materia;
        this.materia = materia;
        this.grado = grado;
    }

    public void setId_materia(int id_materia) {
        this.id_materia = id_materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }
    

    public int getId_materia() {
        return id_materia;
    }

    public String getMateria() {
        return materia;
    }

    public String getGrado() {
        return grado;
    }
    
    
    
            
    
}
