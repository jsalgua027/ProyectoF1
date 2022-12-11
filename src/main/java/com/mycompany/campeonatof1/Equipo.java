/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.campeonatof1;

import java.util.Objects;

/**
 *
 * @author Windows10
 */
public class Equipo {
    
    private String nombreEquipo;
    private Motor motor;
    private Chasis chasis;
    private Piloto pilotoUno;
    private Piloto pilotoDos;
    private String jefeEquipo;
    private int titulos;
    private int victorias;
    private int GrandesPremiosDisputados;
    private int poles;
    private int vueltasRapidas;

    public Equipo() {
    }

    public Equipo(String nombreEquipo, Motor motor, Chasis chasis, Piloto pilotoUno, Piloto pilotoDos, String jefeEquipo, int titulos, int victorias, int GrandesPremiosDisputados, int poles, int vueltasRapidas) {
        this.nombreEquipo = nombreEquipo;
        this.motor = motor;
        this.chasis = chasis;
        this.pilotoUno = pilotoUno;
        this.pilotoDos = pilotoDos;
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

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Chasis getChasis() {
        return chasis;
    }

    public void setChasis(Chasis chasis) {
        this.chasis = chasis;
    }

    public Piloto getPilotoUno() {
        return pilotoUno;
    }

    public void setPilotoUno(Piloto pilotoUno) {
        this.pilotoUno = pilotoUno;
    }

    public Piloto getPilotoDos() {
        return pilotoDos;
    }

    public void setPilotoDos(Piloto pilotoDos) {
        this.pilotoDos = pilotoDos;
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
        
        String resultado=
                                   """
                                   -Nombre Equipo: %s
                                   -Motor: %s
                                   -Chasis: %s
                                   -Primer Piloto: %s
                                   -Segundo Piloto: %s
                                   -Jefe de Equipo: %s
                                   -Titulos: %s
                                   -Victorias en Grandes Premios: %s
                                   -Poles: %s
                                   -Vueltas Rapidas: %s
                                   """.formatted(nombreEquipo,motor,chasis,pilotoUno,pilotoDos,
                                           jefeEquipo,titulos,victorias,GrandesPremiosDisputados,poles,vueltasRapidas);
        
        
        return resultado;
//        return "Equipo{" + "nombreEquipo=" + nombreEquipo + ", motor=" + motor + ", chasis="
//                + chasis + ", pilotoUno=" + pilotoUno + ", pilotoDos=" + pilotoDos + ", jefeEquipo=" + jefeEquipo
//                + ", titulos=" + titulos + ", victorias=" + victorias + ", GrandesPremiosDisputados=" 
//                + GrandesPremiosDisputados + ", poles=" + poles + ", vueltasRapidas=" + vueltasRapidas + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.nombreEquipo);
        hash = 71 * hash + Objects.hashCode(this.motor);
        hash = 71 * hash + Objects.hashCode(this.chasis);
        hash = 71 * hash + Objects.hashCode(this.pilotoUno);
        hash = 71 * hash + Objects.hashCode(this.pilotoDos);
        hash = 71 * hash + Objects.hashCode(this.jefeEquipo);
        hash = 71 * hash + this.titulos;
        hash = 71 * hash + this.victorias;
        hash = 71 * hash + this.GrandesPremiosDisputados;
        hash = 71 * hash + this.poles;
        hash = 71 * hash + this.vueltasRapidas;
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
