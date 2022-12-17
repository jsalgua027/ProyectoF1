/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estructura;

import java.util.Arrays;
import java.util.Objects;
import listas.ListaMonoplazas;
import listas.ListaPilotos;

/**
 *
 * @author Windows10
 */
public class Equipo {

    private String nombreEquipo;
    private ListaMonoplazas monoplazas;
    private ListaPilotos pilotos;
    private String jefeEquipo;
    private int titulos;
    private int victorias;
    private int grandesPremiosDisputados;
    private int poles;
    private int vueltasRapidas;

    public Equipo() {
    }

    public Equipo(String nombreEquipo, String jefeEquipo, int titulos, int victorias, int grandesPremiosDisputados, int poles, int vueltasRapidas) {
        this.nombreEquipo = nombreEquipo;
        this.monoplazas = new ListaMonoplazas(0);
        this.pilotos = new ListaPilotos(0);
        this.jefeEquipo = jefeEquipo;
        this.titulos = titulos;
        this.victorias = victorias;
        this.grandesPremiosDisputados = grandesPremiosDisputados;
        this.poles = poles;
        this.vueltasRapidas = vueltasRapidas;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public ListaMonoplazas getMonoplazas() {
        return monoplazas;
    }

    public ListaPilotos getPilotos() {
        return pilotos;
    }

    public String getJefeEquipo() {
        return jefeEquipo;
    }

    public int getTitulos() {
        return titulos;
    }

    public int getVictorias() {
        return victorias;
    }

    public int getGrandesPremiosDisputados() {
        return grandesPremiosDisputados;
    }

    public int getPoles() {
        return poles;
    }

    public int getVueltasRapidas() {
        return vueltasRapidas;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public void setJefeEquipo(String jefeEquipo) {
        this.jefeEquipo = jefeEquipo;
    }

    public void setTitulos(int titulos) {
        this.titulos = titulos;
    }

    public void setVictorias(int victorias) {
        this.victorias = victorias;
    }

    public void setGrandesPremiosDisputados(int grandesPremiosDisputados) {
        this.grandesPremiosDisputados = grandesPremiosDisputados;
    }

    public void setPoles(int poles) {
        this.poles = poles;
    }

    public void setVueltasRapidas(int vueltasRapidas) {
        this.vueltasRapidas = vueltasRapidas;
    }

    @Override
    public String toString() {

        String resultado
                = """
                                *********EQUIPO: %s ***********
                                                    
                                   %s
                                   %s
                                   -Jefe de Equipo: %s
                                   -Titulos: %s
                                   -Victorias en Grandes Premios: %s
                                   -Poles: %s
                                   -Vueltas Rapidas: %s
                  
                                   *****************************
                                   """.formatted(nombreEquipo, monoplazas, pilotos,
                        jefeEquipo, titulos, victorias, grandesPremiosDisputados,
                        poles, vueltasRapidas);

        return resultado;

//        return "Equipo{" + "nombreEquipo=" + nombreEquipo + ", monoplazas=" +
//                Arrays.toString(monoplazas) + ", pilotos=" + Arrays.toString(pilotos) + ", jefeEquipo=" 
//                + jefeEquipo + ", titulos=" + titulos + ", victorias=" + victorias
//                + ", grandesPremiosDisputados=" + grandesPremiosDisputados 
//                + ", poles=" + poles + ", vueltasRapidas=" + vueltasRapidas + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.nombreEquipo);
        hash = 83 * hash + Objects.hashCode(this.monoplazas);
        hash = 83 * hash + Objects.hashCode(this.pilotos);
        hash = 83 * hash + Objects.hashCode(this.jefeEquipo);
        hash = 83 * hash + this.titulos;
        hash = 83 * hash + this.victorias;
        hash = 83 * hash + this.grandesPremiosDisputados;
        hash = 83 * hash + this.poles;
        hash = 83 * hash + this.vueltasRapidas;
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

    // añadir monoplaza
    public void registraMonoplaza(Monoplaza m) {
        this.monoplazas.añadirMonoplaza(m);

    }

    // otra manera de añadir
    public void registraMonoplaza() {
        Monoplaza aux = new Monoplaza();
        this.monoplazas.añadirMonoplaza(aux);
    }

    // registar Cliente
    public void registarPiloto() {
        Piloto aux = new Piloto();
        this.pilotos.añadirPiloto(aux);

    }

    // registar Cliente
    public void registarPiloto(Piloto aux) {
        //  Cliente aux = new Cliente();
        this.pilotos.añadirPiloto(aux);

    }

    // busca piloto
    public Piloto buscarPiloto(String nombre){
    return this.pilotos.buscarPilotoNombre(nombre);
    
    }
    // buscar monoplaza 
    
    public Monoplaza buscarMonoplaza(String Bastidor){
    return this.monoplazas.buscarMonoplazaBastidor(Bastidor);
    
    }
    
}
