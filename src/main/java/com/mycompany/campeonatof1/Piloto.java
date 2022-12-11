/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.campeonatof1;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author Windows10
 */
public class Piloto {

    private String nombrePiloto;
    private Equipo equipo;
    private LocalDate fechaNacimiento;
    private int titulos;
    private int victorias;
    private int GrandesPremiosDisputados;
    private int poles;
    private int vueltasRapidas;

    public Piloto() {
    }
    
    
    
    

    public Piloto(String nombrePiloto, Equipo equipo, LocalDate fechaNacimiento, int titulos, int victorias, int GrandesPremiosDisputados, int poles, int vueltasRapidas) {
        this.nombrePiloto = nombrePiloto;
        this.equipo = equipo;
        this.fechaNacimiento = fechaNacimiento;
        this.titulos = titulos;
        this.victorias = victorias;
        this.GrandesPremiosDisputados = GrandesPremiosDisputados;
        this.poles = poles;
        this.vueltasRapidas = vueltasRapidas;
    }

    public String getNombrePiloto() {
        return nombrePiloto;
    }

    public void setNombrePiloto(String nombrePiloto) {
        this.nombrePiloto = nombrePiloto;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getTitulos() {
        return titulos;
    }

    public void setTitulos(int titulos) {
        this.titulos = titulos;
    }

    public int getVictorias() {
        return victorias;
    }

    public void setVictorias(int victorias) {
        this.victorias = victorias;
    }

    public int getGrandesPremiosDisputados() {
        return GrandesPremiosDisputados;
    }

    public void setGrandesPremiosDisputados(int GrandesPremiosDisputados) {
        this.GrandesPremiosDisputados = GrandesPremiosDisputados;
    }

    public int getPoles() {
        return poles;
    }

    public void setPoles(int poles) {
        this.poles = poles;
    }

    public int getVueltasRapidas() {
        return vueltasRapidas;
    }

    public void setVueltasRapidas(int vueltasRapidas) {
        this.vueltasRapidas = vueltasRapidas;
    }

    @Override
    public String toString() {
        
        String resultado="""
                                     -Nombre: %s
                                     -Equipo:  %s
                                     -Fecha de Nacimiento: %s
                                     -Títulos: %s
                                     -Número de Victorias: %s
                                     -Grandes Premios disputdos: %s
                                     -Poles: %s
                                     -Vueltas Rapidas: %s
                                   """.formatted(nombrePiloto,equipo,fechaNacimiento,titulos,victorias,GrandesPremiosDisputados,poles,vueltasRapidas);
        
        
        //return "Piloto{" + "nombrePiloto=" + nombrePiloto + ", equipo=" + equipo + ", fechaNacimiento=" + fechaNacimiento + 
        //", titulos=" + titulos + ", victorias=" + victorias + ", GrandesPremiosDisputados=" + GrandesPremiosDisputados +
        //", poles=" + poles + ", vueltasRapidas=" + vueltasRapidas + '}';
        
        return resultado;
        
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 43 * hash + Objects.hashCode(this.nombrePiloto);
        hash = 43 * hash + Objects.hashCode(this.equipo);
        hash = 43 * hash + Objects.hashCode(this.fechaNacimiento);
        hash = 43 * hash + this.titulos;
        hash = 43 * hash + this.victorias;
        hash = 43 * hash + this.GrandesPremiosDisputados;
        hash = 43 * hash + this.poles;
        hash = 43 * hash + this.vueltasRapidas;
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
        final Piloto other = (Piloto) obj;
        return Objects.equals(this.nombrePiloto, other.nombrePiloto);
    }

    
    
    
}
