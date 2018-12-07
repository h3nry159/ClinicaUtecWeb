/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Date;
import java.sql.Time;

/**
 *
 * @author freak
 */
public class Consulta {
    
    private long id;
    private String razonConsulta;
    private String sintoma;
    private String fecha;
    private String hora;
    private int estadoConsulta;
    private String duiMedico;
    private String duiPaciente;

    public Consulta() {
    }

    public Consulta(long id, String razonConsulta, String sintoma, String fecha, String hora, int estadoConsulta, String duiMedico, String duiPaciente) {
        this.id = id;
        this.razonConsulta = razonConsulta;
        this.sintoma = sintoma;
        this.fecha = fecha;
        this.hora = hora;
        this.estadoConsulta = estadoConsulta;
        this.duiMedico = duiMedico;
        this.duiPaciente = duiPaciente;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRazonConsulta() {
        return razonConsulta;
    }

    public void setRazonConsulta(String razonConsulta) {
        this.razonConsulta = razonConsulta;
    }

    public String getSintoma() {
        return sintoma;
    }

    public void setSintoma(String sintoma) {
        this.sintoma = sintoma;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getEstadoConsulta() {
        return estadoConsulta;
    }

    public void setEstadoConsulta(int estadoConsulta) {
        this.estadoConsulta = estadoConsulta;
    }

    public String getDuiMedico() {
        return duiMedico;
    }

    public void setDuiMedico(String duiMedico) {
        this.duiMedico = duiMedico;
    }

    public String getDuiPaciente() {
        return duiPaciente;
    }

    public void setDuiPaciente(String duiPaciente) {
        this.duiPaciente = duiPaciente;
    }
    
    
    
    
    

    

}
