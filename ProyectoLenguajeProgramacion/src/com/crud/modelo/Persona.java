
package com.crud.modelo;

import java.util.Date;

public class Persona {
            private int id_persona;
            private String nombre;
            private String apellido;
            private Date fecha_nac;
            private String tratamiento;
            private Boolean edad;
    
    public Persona() {
    }

    public Persona(String nombre, String apellido, Date fecha_nac, String tratamiento, Boolean edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_nac = fecha_nac;
        this.tratamiento = tratamiento;
        this.edad = edad;
    }

    public Persona(int id_persona, String nombre, String apellido, Date fecha_nac, String tratamiento, Boolean edad) {
        this.id_persona = id_persona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha_nac = fecha_nac;
        this.tratamiento = tratamiento;
        this.edad = edad;
    }



    public int getId_persona() {
        return id_persona;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(Date fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public Boolean getEdad() {
        return edad;
    }

    public void setEdad(Boolean edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "id_persona=" + id_persona + ", nombre=" + nombre + ", apellido=" + apellido + ", fecha_nac=" + fecha_nac + ", tratamiento=" + tratamiento + ", edad=" + edad + '}';
    }
    
    
            
    
}
