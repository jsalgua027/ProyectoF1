/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package funcionalidad;


import estructura.Equipo;
import estructura.Piloto;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Windows10
 */
public abstract class  CampeonatoF1 {
    
    private Set<GranPremio> grandesPremios;

   

    public CampeonatoF1() {
        this.grandesPremios = new HashSet<>();
    }

    public Set<GranPremio> getGrandesPremios() {
        return grandesPremios;
    }

    public void setGrandesPremios(Set<GranPremio> grandesPremios) {
        this.grandesPremios = grandesPremios;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CampeonatoF1{");
        sb.append("grandesPremios=").append(grandesPremios);
        sb.append('}');
        return sb.toString();
    }
    
       //*********************************METODOS*************************
    
    // método que señale el ganador y sume victoria a equipo y  piloto
    // metodo que señale pole y le sume pole al equipo y piloto
    // método que señale vuelta rápida y se la sume a los dos
    
    public abstract  void victoriaEquipoGanador(Equipo e);
    
      public abstract void victoriaPilotoGanador( Equipo e,Piloto p);
      
      
       public abstract  void poleEquipoGanador(Equipo e);
    
      public abstract void polePilotoGanador( Equipo e,Piloto p);
      
      
        public abstract void vueltaRapidaEquipoGanador(Equipo e);
    
      public abstract void vueltaRapidaPilotoGanador( Equipo e,Piloto p);
            
    
    
}
