/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructura;

import java.time.Year;
import java.util.Objects;

/**
 *
 * @author Windows10
 */
public class Circuito {
    
    private String nombreGP;
    private Year anioDebut;
    private String vueltas;
    private double longitud;
    private int zonasDRS;

    public Circuito(String nombreGP, Year anioDebut, String vueltas, double longitud, int zonasDRS) {
        this.nombreGP = nombreGP;
        this.anioDebut = anioDebut;
        this.vueltas = vueltas;
        this.longitud = longitud;
        this.zonasDRS = zonasDRS;
    }

    public String getNombreGP() {
        return nombreGP;
    }

    public void setNombreGP(String nombreGP) {
        this.nombreGP = nombreGP;
    }

    public Year getAnioDebut() {
        return anioDebut;
    }

    public void setAnioDebut(Year anioDebut) {
        this.anioDebut = anioDebut;
    }

    public String getVueltas() {
        return vueltas;
    }

    public void setVueltas(String vueltas) {
        this.vueltas = vueltas;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public int getZonasDRS() {
        return zonasDRS;
    }

    public void setZonasDRS(int zonasDRS) {
        this.zonasDRS = zonasDRS;
    }

    @Override
    public String toString() {
        
         String resultado= """
                                        *********Circuito*******
                           
                                        -Nombre: %s
                                        -Año de debut: %s
                                        -Número de vueltas: %s
                                        -Longitud: %s
                                        -Zonas DRS: %s
                                        
                                        *************************
                                     """.formatted(nombreGP,anioDebut,vueltas,longitud,zonasDRS);
        
        return  resultado;
//        return "GranPremio{" + "nombreGP=" + nombreGP +
//                ", anioDebut=" + anioDebut + ", vueltas=" + vueltas + ", longitud=" 
//                + longitud + ", zonasDRS=" + zonasDRS + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.nombreGP);
        hash = 89 * hash + Objects.hashCode(this.anioDebut);
        hash = 89 * hash + Objects.hashCode(this.vueltas);
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.longitud) ^ (Double.doubleToLongBits(this.longitud) >>> 32));
        hash = 89 * hash + this.zonasDRS;
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
        final Circuito other = (Circuito) obj;
        return Objects.equals(this.nombreGP, other.nombreGP);
    }
    
    
    
    
    
    
    
}
