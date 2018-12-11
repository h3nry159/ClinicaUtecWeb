package cl.model.pojos;
// Generated 11-dic-2018 11:36:45 by Hibernate Tools 4.3.1



/**
 * Recetas generated by hbm2java
 */
public class Recetas  implements java.io.Serializable {


     private Integer idReceta;
     private Enfermeras enfermeras;
     private Paciente paciente;
     private String fechaPrescripcion;
     private String farmaco;
     private int unidades;
     private String pauta;
     private String indicacionesFarmaco;

    public Recetas() {
    }

    public Recetas(Enfermeras enfermeras, Paciente paciente, String fechaPrescripcion, String farmaco, int unidades, String pauta, String indicacionesFarmaco) {
       this.enfermeras = enfermeras;
       this.paciente = paciente;
       this.fechaPrescripcion = fechaPrescripcion;
       this.farmaco = farmaco;
       this.unidades = unidades;
       this.pauta = pauta;
       this.indicacionesFarmaco = indicacionesFarmaco;
    }
   
    public Integer getIdReceta() {
        return this.idReceta;
    }
    
    public void setIdReceta(Integer idReceta) {
        this.idReceta = idReceta;
    }
    public Enfermeras getEnfermeras() {
        return this.enfermeras;
    }
    
    public void setEnfermeras(Enfermeras enfermeras) {
        this.enfermeras = enfermeras;
    }
    public Paciente getPaciente() {
        return this.paciente;
    }
    
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
    public String getFechaPrescripcion() {
        return this.fechaPrescripcion;
    }
    
    public void setFechaPrescripcion(String fechaPrescripcion) {
        this.fechaPrescripcion = fechaPrescripcion;
    }
    public String getFarmaco() {
        return this.farmaco;
    }
    
    public void setFarmaco(String farmaco) {
        this.farmaco = farmaco;
    }
    public int getUnidades() {
        return this.unidades;
    }
    
    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }
    public String getPauta() {
        return this.pauta;
    }
    
    public void setPauta(String pauta) {
        this.pauta = pauta;
    }
    public String getIndicacionesFarmaco() {
        return this.indicacionesFarmaco;
    }
    
    public void setIndicacionesFarmaco(String indicacionesFarmaco) {
        this.indicacionesFarmaco = indicacionesFarmaco;
    }




}


