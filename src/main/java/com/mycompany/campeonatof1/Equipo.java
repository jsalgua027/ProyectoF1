/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.campeonatof1;

import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author Windows10
 */
public class Equipo {

    private String nombreEquipo;
    private Monoplaza[] monoplazas;
    private Piloto[] pilotos;
    private String jefeEquipo;
    private int titulos;
    private int victorias;
    private int GrandesPremiosDisputados;
    private int poles;
    private int vueltasRapidas;

    public Equipo() {
    }

    public Equipo(String nombreEquipo, Monoplaza[] monoplazas, Piloto[] pilotos, String jefeEquipo, int titulos, int victorias, int GrandesPremiosDisputados, int poles, int vueltasRapidas) {
        this.nombreEquipo = nombreEquipo;
        this.monoplazas = monoplazas;
        this.pilotos = pilotos;
        this.jefeEquipo = jefeEquipo;
        this.titulos = titulos;
        this.victorias = victorias;
        this.GrandesPremiosDisputados = GrandesPremiosDisputados;
        this.poles = poles;
        this.vueltasRapidas = vueltasRapidas;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public Monoplaza[] getMonoplazas() {
        return monoplazas;
    }

    public void setMonoplazas(Monoplaza[] monoplazas) {
        this.monoplazas = monoplazas;
    }

    public Piloto[] getPilotos() {
        return pilotos;
    }

    public void setPilotos(Piloto[] pilotos) {
        this.pilotos = pilotos;
    }

    public String getJefeEquipo() {
        return jefeEquipo;
    }

    public void setJefeEquipo(String jefeEquipo) {
        this.jefeEquipo = jefeEquipo;
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
        
        
         String resultado
                = """
                                *********Equipo***********
                  
                                   -Nombre Equipo: %s
                                   -Monoplazas: %s
                                   -Pilotos: %s
                                   -Jefe de Equipo: %s
                                   -Titulos: %s
                                   -Victorias en Grandes Premios: %s
                                   -Poles: %s
                                   -Vueltas Rapidas: %s
                  
                                   *****************************
                                   """.formatted(nombreEquipo,monoplazas,pilotos,
                                           jefeEquipo, titulos,victorias,GrandesPremiosDisputados,
                                           poles,vueltasRapidas);
        
        
        
        
        return resultado;
        
        
//        return "Equipo{" + "nombreEquipo=" + nombreEquipo + ", monoplazas=" +
//                monoplazas + ", pilotos=" + pilotos + ", jefeEquipo=" 
//                + jefeEquipo + ", titulos=" + titulos + ", victorias=" + victorias
//                + ", GrandesPremiosDisputados=" + GrandesPremiosDisputados 
//                + ", poles=" + poles + ", vueltasRapidas=" + vueltasRapidas + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.nombreEquipo);
        hash = 89 * hash + Arrays.deepHashCode(this.monoplazas);
        hash = 89 * hash + Arrays.deepHashCode(this.pilotos);
        hash = 89 * hash + Objects.hashCode(this.jefeEquipo);
        hash = 89 * hash + this.titulos;
        hash = 89 * hash + this.victorias;
        hash = 89 * hash + this.GrandesPremiosDisputados;
        hash = 89 * hash + this.poles;
        hash = 89 * hash + this.vueltasRapidas;
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
        final Equipo other = (Equipo) obj;
        return Objects.equals(this.nombreEquipo, other.nombreEquipo);
    }
    
    
    
    
    
    
    }


