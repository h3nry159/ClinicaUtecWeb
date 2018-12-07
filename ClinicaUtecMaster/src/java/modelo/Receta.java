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
public class Receta {
    
    private String duiEnfermera;
    private String duiPaciente;
    private String farmaco;
    private String fechaPrescripcion;
    private String indicacionesFarmaco;
    private String pauta;
    private int unidades;
    private int id;

    public Receta() {
    }

    public Receta(String duiEnfermera, String duiPaciente, String farmaco, String fechaPrescripcion, String indicacionesFarmaco, String pauta, int unidades, int id) {
        this.duiEnfermera = duiEnfermera;
        this.duiPaciente = duiPaciente;
        this.farmaco = farmaco;
        this.fechaPrescripcion = fechaPrescripcion;
        this.indicacionesFarmaco = indicacionesFarmaco;
        this.pauta = pauta;
        this.unidades = unidades;
        this.id = id;
    }

    public String getDuiEnfermera() {
        return duiEnfermera;
    }

    public void setDuiEnfermera(String duiEnfermera) {
        this.duiEnfermera = duiEnfermera;
    }

    public String getDuiPaciente() {
        return duiPaciente;
    }

    public void setDuiPaciente(String duiPaciente) {
        this.duiPaciente = duiPaciente;
    }

    public String getFarmaco() {
        return farmaco;
    }

    public void setFarmaco(String farmaco) {
        this.farmaco = farmaco;
    }

    public String getFechaPrescripcion() {
        return fechaPrescripcion;
    }

    public void setFechaPrescripcion(String fechaPrescripcion) {
        this.fechaPrescripcion = fechaPrescripcion;
    }

    public String getIndicacionesFarmaco() {
        return indicacionesFarmaco;
    }

    public void setIndicacionesFarmaco(String indicacionesFarmaco) {
        this.indicacionesFarmaco = indicacionesFarmaco;
    }

    public String getPauta() {
        return pauta;
    }

    public void setPauta(String pauta) {
        this.pauta = pauta;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
}
