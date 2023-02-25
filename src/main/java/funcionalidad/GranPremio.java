/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcionalidad;

import estructura.Circuito;
import estructura.Equipo;
import estructura.Piloto;
import java.util.Objects;


/**
 *
 * @author jsalc
 * 
 *     
    //*********************************METODOS*************************
    
    // método que señale el ganador y sume victoria a equipo y  piloto
    // metodo que señale pole y le sume pole al equipo y piloto
    // método que señale vuelta rápida y se la sume a los dos
 * 
 */
public class GranPremio extends CampeonatoF1{
    
    private Circuito circuito;
    private Equipo[] equipos;

  
    


    public GranPremio(Circuito circuito, Equipo[] equipos) {
        this.circuito = circuito;
        this.equipos = equipos;
    }

    public Circuito getCircuito() {
        return circuito;
    }

    public Equipo[] getEquipos() {
        return equipos;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GranPremio{");
        sb.append("circuito=").append(circuito);
        sb.append(", equipos=").append(equipos);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.circuito);
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
        final GranPremio other = (GranPremio) obj;
        return Objects.equals(this.circuito, other.circuito);
    }

    @Override
    public void victoriaEquipoGanador(Equipo e) {
        for (Equipo equipo : this.equipos) {
            if (equipo.equals(e)) {
                e.setVictorias(+1);
            }
        }
    }

    @Override
    public void victoriaPilotoGanador(Equipo e,Piloto p) {
        for (int i = 0; i < this.equipos.length; i++) {
            if(this.equipos[i].equals(e)){
                for (int j = 0; j < e.getPilotos().getNumeroPilotos(); j++) {
                    
                }
            }
        }
    }

    @Override
    public void poleEquipoGanador(Equipo e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void polePilotoGanador(Equipo e,Piloto p) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void vueltaRapidaEquipoGanador(Equipo e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void vueltaRapidaPilotoGanador(Equipo e,Piloto p) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
    
    
    
}