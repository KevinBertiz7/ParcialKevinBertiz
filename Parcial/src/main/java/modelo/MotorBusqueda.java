/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.util.ArrayList;
/**
 *
 * @author ESTUDIANTES
 */
public class MotorBusqueda {
    private String rutaCorta;
    private ArrayList<Ruta> rutas;
    private ArrayList<Tramo> camino;
    
    public MotorBusqueda(){
        
    }

    public MotorBusqueda(String rutaCorta) {
        this.rutaCorta = rutaCorta;
        this.rutas = new ArrayList();
        this.camino = new ArrayList();
        
    }

    public String getRutaCorta() {
        return rutaCorta;
    }

    public void setRutaCorta(String rutaCorta) {
        this.rutaCorta = rutaCorta;
    }

    @Override
    public String toString() {
        return "MotorBusqueda{" + "rutaCorta=" + rutaCorta + '}';
    }
    
    public ArrayList<Ruta>getRuta(){
        return rutas;
    }

    public void setRutas(ArrayList<Ruta> rutas) {
        this.rutas = rutas;
    }
    
    public void registrarRuta(Ruta r){
         this.rutas.add(r);
     }
    
     

    public ArrayList<Tramo> getCamino() {
        return camino;
    }

    public void setCamino(ArrayList<Tramo> camino) {
        this.camino = camino;
    }
    
    public ArrayList<Tramo>getcamino(){
        return camino;
    }
    
    public void setTramo(ArrayList<Tramo>camino){
        this.camino = camino;
    }
    public void registrarcamino(Tramo c){
        this.camino.add(c);
    }
    
    
    
 }
    
    
    

