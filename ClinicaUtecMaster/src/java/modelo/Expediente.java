/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author freak
 */
public class Expediente {
    
    private String nombres;
    private String apellidos;
    private String domicilio;
    private String correo;
    private String telefono;
    private String genero;
    private String fecha_nacimiento;
    private String lugar_nacimiento;
    private int edad;
    private String ocupacion;
    private String observaciones;
    private String alergias;
    private String dui_paciente;

    public Expediente() {
    }

    public Expediente(String nombres, String apellidos, String domicilio, String correo, String telefono, String genero, String fecha_nacimiento, String lugar_nacimiento, int edad, String ocupacion, String observaciones, String alergias, String dui_paciente) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.domicilio = domicilio;
        this.correo = correo;
        this.telefono = telefono;
        this.genero = genero;
        this.fecha_nacimiento = fecha_nacimiento;
        this.lugar_nacimiento = lugar_nacimiento;
        this.edad = edad;
        this.ocupacion = ocupacion;
        this.observaciones = observaciones;
        this.alergias = alergias;
        this.dui_paciente = dui_paciente;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getLugar_nacimiento() {
        return lugar_nacimiento;
    }

    public void setLugar_nacimiento(String lugar_nacimiento) {
        this.lugar_nacimiento = lugar_nacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getDui_paciente() {
        return dui_paciente;
    }

    public void setDui_paciente(String dui_paciente) {
        this.dui_paciente = dui_paciente;
    }
    
    
    
    
   
    
}
