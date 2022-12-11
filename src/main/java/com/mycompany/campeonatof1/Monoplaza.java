/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.campeonatof1;

import java.util.Objects;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author jsalc
 *
 *
 * El artículo 28.2 a) del Reglamento Deportivo de la Fórmula 1 establece que
 * "ningún piloto puede utilizar más de 3 motores (ICE), 3 MGU-H, 3
 * turbocompresores (TC), 2 baterías (ES), 2 unidades de control electrónico
 * (EC), 3 MGU-K y 8 de cada uno de los cuatro componentes que constituyen un
 * conjunto del sistema de escape
 */
public class Monoplaza {

    private String  numero_bastidor;
    private Motor motor;
    private Chasis chasis;
    private  int motores_ICE;//3
    private  int mgu_h;//3;
    private  int turboCompresores_TC;//2;
    private  int baterias_ES;//2;
    private  int unidades_control_electronico_EC;//=2;
    private  int mgu_k;//=3;
    private  int componentes_sistema_escape;//=8;
    

    public Monoplaza() {
    }

    public Monoplaza( Motor motor, Chasis chasis) {
        this.numero_bastidor = RandomStringUtils.randomAlphanumeric(15);
        this.motor = motor;
        this.chasis = chasis;
        this.motores_ICE =3;
        this.mgu_h =3;
        this.turboCompresores_TC = 2;
        this.baterias_ES = 2;
        this.unidades_control_electronico_EC = 2;
        this.mgu_k = 3;
        this.componentes_sistema_escape = 8;
    }

    public String getNumero_bastidor() {
        return numero_bastidor;
    }

    public Motor getMotor() {
        return motor;
    }

    public Chasis getChasis() {
        return chasis;
    }

    public int getMotores_ICE() {
        return motores_ICE;
    }

    public int getMgu_h() {
        return mgu_h;
    }

    public int getTurboCompresores_TC() {
        return turboCompresores_TC;
    }

    public int getBaterias_ES() {
        return baterias_ES;
    }

    public int getUnidades_control_electronico_EC() {
        return unidades_control_electronico_EC;
    }

    public int getMgu_k() {
        return mgu_k;
    }

    public int getComponentes_sistema_escape() {
        return componentes_sistema_escape;
    }

    public void setNumero_bastidor(String numero_bastidor) {
        this.numero_bastidor = numero_bastidor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public void setChasis(Chasis chasis) {
        this.chasis = chasis;
    }

    public void setMotores_ICE(int motores_ICE) {
        this.motores_ICE = motores_ICE;
    }

    public void setMgu_h(int mgu_h) {
        this.mgu_h = mgu_h;
    }

    public void setTurboCompresores_TC(int turboCompresores_TC) {
        this.turboCompresores_TC = turboCompresores_TC;
    }

    public void setBaterias_ES(int baterias_ES) {
        this.baterias_ES = baterias_ES;
    }

    public void setUnidades_control_electronico_EC(int unidades_control_electronico_EC) {
        this.unidades_control_electronico_EC = unidades_control_electronico_EC;
    }

    public void setMgu_k(int mgu_k) {
        this.mgu_k = mgu_k;
    }

    public void setComponentes_sistema_escape(int componentes_sistema_escape) {
        this.componentes_sistema_escape = componentes_sistema_escape;
    }

   

   

    @Override
    public String toString() {
        
        
        String resultado="""
                                      ******Monoplaza************
                         
                                    -Número de bastidor: %s
                                    -Motor: %s
                                    -Chasis: %s
                                    -Número de motores (ICE): %s
                                    -Unidades de MGUH: %s
                                    -Unidades de Turbo Compresores (TC): %s
                                    -Número de baterías (ES): %s
                                    -Unidades de MGUK: %s
                                    -Componentes sistema de escape: %s
                         
                                    *********************************************
                                   """.formatted(numero_bastidor,motor
                                           ,chasis,motores_ICE,mgu_h
                                   ,turboCompresores_TC,baterias_ES,unidades_control_electronico_EC
                                   ,mgu_k,componentes_sistema_escape);
        
        
        
        return resultado;
        
//        return "Monoplaza{" + "numero_bastidor=" + numero_bastidor +
//                ", motor=" + motor + ", chasis=" + chasis + ", motores_ICE=" 
//                + motores_ICE + ", mgu_h=" + mgu_h + ", turboCompresores_TC=" 
//                + turboCompresores_TC + ", baterias_ES=" + baterias_ES + ", unidades_control_electronico_EC="
//                + unidades_control_electronico_EC + ", mgu_k=" + mgu_k + ", componentes_sistema_escape=" + 
//                componentes_sistema_escape + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Objects.hashCode(this.numero_bastidor);
        hash = 19 * hash + Objects.hashCode(this.motor);
        hash = 19 * hash + Objects.hashCode(this.chasis);
        hash = 19 * hash + this.motores_ICE;
        hash = 19 * hash + this.mgu_h;
        hash = 19 * hash + this.turboCompresores_TC;
        hash = 19 * hash + this.baterias_ES;
        hash = 19 * hash + this.unidades_control_electronico_EC;
        hash = 19 * hash + this.mgu_k;
        hash = 19 * hash + this.componentes_sistema_escape;
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
        final Monoplaza other = (Monoplaza) obj;
        return Objects.equals(this.numero_bastidor, other.numero_bastidor);
    }

  

   
  

    
    
}
