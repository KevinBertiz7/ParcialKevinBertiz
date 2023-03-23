/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.time.LocalDate;
/**
 *
 * @author ESTUDIANTES
 */
public class Tramo {
    private String nombreTramo;
    private LocalDate tiempoPromedio;
    
    
    public Tramo(){
        
    }

    public Tramo(String nombreTramo, LocalDate tiempoPromedio) {
        this.nombreTramo = nombreTramo;
        this.tiempoPromedio = tiempoPromedio;
    }

    public String getNombreTramo() {
        return nombreTramo;
    }

    public LocalDate getTiempoPromedio() {
        return tiempoPromedio;
    }

    public void setNombreTramo(String nombreTramo) {
        this.nombreTramo = nombreTramo;
    }

    public void setTiempoPromedio(LocalDate tiempoPromedio) {
        this.tiempoPromedio = tiempoPromedio;
    }

    @Override
    public String toString() {
        return "Tramo{" + "nombreTramo=" + nombreTramo + ", tiempoPromedio=" + tiempoPromedio + '}';
    }
    
    
    
    
    
}
