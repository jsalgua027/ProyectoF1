/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estructura;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Windows10
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      

          Piloto fernando =new Piloto("Fernado Alonso",LocalDate.of(1981, Month.JULY, 29), 2, 32, 356, 22,23);
           Piloto ocon = new Piloto("Esteban Ocon", LocalDate.of(1996, Month.SEPTEMBER, 17),0, 0, 111, 0, 0);
           
           Monoplaza m1 = new Monoplaza(Motor.RENAULT, Chasis.A522);
           Monoplaza m2 = new Monoplaza(Motor.RENAULT, Chasis.A522);

       
        Equipo alpine = new Equipo("ALPINE", "Eric baser", 0, 1, 41, 0, 1);
        alpine.registarPiloto(fernando);
        alpine.registarPiloto(ocon);
        alpine.registraMonoplaza(m1);
        alpine.registraMonoplaza(m2);
        
        System.out.println(alpine);
        
    }
    
}
