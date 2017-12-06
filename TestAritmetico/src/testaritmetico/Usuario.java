/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testaritmetico;

import java.util.Objects;

/**
 *
 * @author Paredes
 */
public class Usuario {
    
    String nombre;
    String cedula;
    String ciclo;
    String paralelo;
    int numTest;

    public Usuario(String nombre, String cedula, String ciclo, String paralelo) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.ciclo = ciclo;
        this.paralelo = paralelo;
        this.numTest = 1;
    }

    public Usuario(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCiclo() {
        return ciclo;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    public String getParalelo() {
        return paralelo;
    }

    public void setParalelo(String paralelo) {
        this.paralelo = paralelo;
    }

    public int getNumTest() {
        return numTest;
    }

    public void setNumTest(int numTest) {
        this.numTest = numTest;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.cedula, other.cedula)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nCedula: " + cedula + "\nCiclo: " + ciclo + "\nParalelo: " + paralelo + "\n\n";
    }
    
}
