package com.mycompany.peluqueriacanina.Logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author felipeaguilerafuentealba
 */

@Entity
public class Duenio implements Serializable {
    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int idDuenio;
    private String nombre;
    private String celDuenio;
    
    //Constructores
    public Duenio() {
    }

    public Duenio(int idDuenio, String nombre, String celDuenio) {
        this.idDuenio = idDuenio;
        this.nombre = nombre;
        this.celDuenio = celDuenio;
    }
    
    //Metodos Get y Set
    public int getIdDuenio() {
        return idDuenio;
    }

    public void setIdDuenio(int idDuenio) {
        this.idDuenio = idDuenio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCelDuenio() {
        return celDuenio;
    }

    public void setCelDuenio(String celDuenio) {
        this.celDuenio = celDuenio;
    }
    
}
