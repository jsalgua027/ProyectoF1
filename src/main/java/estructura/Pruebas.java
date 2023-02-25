/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estructura;

import funcionalidad.GranPremio;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.util.ArrayList;

/**
 *
 * @author Windows10
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//CIRCUITO
        Circuito barehin = new Circuito("Bareinh", Year.of(1995), "56", 25, 4);
// ALPINE
        Piloto fernando = new Piloto("Fernado Alonso", LocalDate.of(1981, Month.JULY, 29), 2, 33, 356, 0, 0);
        Piloto ocon = new Piloto("Esteban Ocon", LocalDate.of(1996, Month.SEPTEMBER, 17), 0, 0, 111, 0, 0);

        Monoplaza m1 = new Monoplaza(Motor.HONDA, Chasis.C43);
        Monoplaza m2 = new Monoplaza(Motor.RENAULT, Chasis.A_523);

        Equipo alpine = new Equipo("ALPINE", "Eric baser", 0, 4, 41, 0, 0);
        alpine.registarPiloto(fernando);
        alpine.registarPiloto(ocon);
        alpine.registraMonoplaza(m1);
        alpine.registraMonoplaza(m2);
        // MERCEDES
        Piloto hamilton = new Piloto("Hamilton", LocalDate.of(1981, Month.JULY, 29), 2, 0, 356, 0, 0);
        Piloto russel = new Piloto("Russel", LocalDate.of(1996, Month.SEPTEMBER, 17), 0, 0, 111, 0, 0);

        Monoplaza mer1 = new Monoplaza(Motor.MERCEDES, Chasis.W_14);
        Monoplaza mer2 = new Monoplaza(Motor.MERCEDES, Chasis.W_14);
        Equipo mercedes = new Equipo("MERCEDES", "Toto", 0, 1, 41, 0, 0);

        mercedes.registarPiloto(hamilton);
        mercedes.registarPiloto(russel);
        alpine.registraMonoplaza(mer1);
        alpine.registraMonoplaza(mer2);

        System.out.println("Imprimo a los equipos y fernado sin tocar las victorias, ahora tienen que estar a cero");
         System.out.println(alpine.toString());
       
        
     
// GRAN PREMIO

        Equipo[] listaEquipos= {alpine, mercedes};

        GranPremio granPremioBarei = new GranPremio(barehin, listaEquipos);
        
        granPremioBarei.victoriaEquipoGanador(alpine);
      
        granPremioBarei.victoriaPilotoGanador(alpine, fernando);
        
          System.out.println("Imprimo a los equipos y fernado sumando una vitoria, ahora tienen que estar a cero");
        System.out.println(alpine.toString());
      
       

    }

}
