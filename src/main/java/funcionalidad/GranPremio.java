/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcionalidad;

import estructura.Circuito;
import estructura.Equipo;
import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author jsalc
 */
public class GranPremio {
    
    private Circuito circuito;
    private estructura.Equipo[] equipos;

    public GranPremio() {
    }

    public GranPremio(Circuito circuito, Equipo[] equipos) {
        this.circuito = circuito;
        this.equipos = equipos;
    }

    public Circuito getCircuito() {
        return circuito;
    }

    public void setCircuito(Circuito circuito) {
        this.circuito = circuito;
    }

    public Equipo[] getEquipos() {
        return equipos;
    }

    public void setEquipos(Equipo[] equipos) {
        this.equipos = equipos;
    }

    @Override
    public String toString() {
        
        String resultado="""
                                    Bienvenidos al Gran Premio de: %s
                                    Los Equipos partizipantes son: %s
                         
                                   """.formatted(circuito,equipos);
        
        return resultado;
//        return "GranPremio{" + "circuito=" + circuito + ", equipos=" + equipos + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.circuito);
        hash = 71 * hash + Arrays.deepHashCode(this.equipos);
        return hash;
    }
// son iguales por el nombre del circuito 
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
        final GranPremio other = (GranPremio) obj;
        return Objects.equals(this.circuito, other.circuito);
    }
    
    
    //*********************************METODOS*************************
    
    // método que señale el ganador y sume victoria a equipo y  piloto
    // metodo que señale pole y le sume pole al equipo y piloto
    // método que señale vuelta rápida y se la sume a los dos
    
    
    
}