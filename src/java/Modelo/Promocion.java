package Modelo;
// Generated 06/06/2020 07:59:00 PM by Hibernate Tools 3.6.0



/**
 * Promocion generated by hbm2java
 */
public class Promocion  implements java.io.Serializable {


     private Integer idPromocion;
     private String examenparcial;
     private String trentino;
     private String pandemia;

    public Promocion() {
    }

    public Promocion(String examenparcial, String trentino, String pandemia) {
       this.examenparcial = examenparcial;
       this.trentino = trentino;
       this.pandemia = pandemia;
    }
   
    public Integer getIdPromocion() {
        return this.idPromocion;
    }
    
    public void setIdPromocion(Integer idPromocion) {
        this.idPromocion = idPromocion;
    }
    public String getExamenparcial() {
        return this.examenparcial;
    }
    
    public void setExamenparcial(String examenparcial) {
        this.examenparcial = examenparcial;
    }
    public String getTrentino() {
        return this.trentino;
    }
    
    public void setTrentino(String trentino) {
        this.trentino = trentino;
    }
    public String getPandemia() {
        return this.pandemia;
    }
    
    public void setPandemia(String pandemia) {
        this.pandemia = pandemia;
    }




}

