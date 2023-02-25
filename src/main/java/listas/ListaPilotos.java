/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listas;

import estructura.Piloto;

/**
 *
 * @author Windows10
 */
public class ListaPilotos {

    private int numeroPilotos;

    Piloto[] listaPilotos;

    // constructor de la lista de pilotos
    public ListaPilotos() {

    
        this.numeroPilotos =3;
        this.listaPilotos = new Piloto[numeroPilotos];
        for (int i = 0; i < listaPilotos.length; i++) {
            this.listaPilotos[i] = new Piloto();
        }
    }

    @Override
    public String toString() {

        String tmp = "";

        for (Piloto p : listaPilotos) {
            if (p != null) {
                tmp += p.toString() + "\n";
            }

        }

        return tmp;
    }

    public int getNumeroPilotos() {
        return numeroPilotos;
    }

    // buscar piloto 
    private int buscarPilotoObjeto(Piloto p) {

        if (p != null) {// si el parametro NO es nulo
            for (int i = 0; i < this.listaPilotos.length; i++) {//recorre la lista
                if (this.listaPilotos[i] != null && p.equals(this.listaPilotos[i])) {// si no es nulo y es igual a el valor de dentro de la lista
                    return i;// numero positivo o cero
                }
            }

        }
        return -1;// sino negativo
    }

    // busqueda piloto por Nombre
    public Piloto buscarPilotoNombre(String nombre) {
        // creo el piloto para el paso por referencia
        Piloto aux = new Piloto();
        aux.setNombrePiloto(nombre);//fuerzo el nombre
        // uso el metodo buscar piloto que me da un valor int
        int posicion = buscarPilotoObjeto(aux);

        return (posicion >= 0) ? this.listaPilotos[posicion] : null; // me devuelves el piloto o nulo si no existe

    }

    // metodo privado copia
    private Piloto[] copiar() {

        Piloto[] aux = new Piloto[this.listaPilotos.length + 1];//array para realizar la copia +1 para que salte el null pointer
        for (int i = 0; i < this.listaPilotos.length; i++) {
            aux[i] = this.listaPilotos[i];
        }
        return aux;
    }

    // añadir piloto
    public void añadirPiloto(Piloto p) {
        if (numeroPilotos < this.listaPilotos.length) {
            for (int i = 0; i < this.listaPilotos.length; i++) {
                if (this.listaPilotos[i] == null) {// si encuentras un valor a null
                    this.listaPilotos[i] = p;//lo añades
                    this.numeroPilotos++;// sumas uno al tamaño del array
                    break;
                }
            }

        } else {
            this.numeroPilotos++;
            this.listaPilotos = copiar();
            this.listaPilotos[this.numeroPilotos - 1] = p;
        }

    }
    
    // borrar piloto
    public boolean borrarPiloto(Piloto p){
    int posicion= buscarPilotoObjeto(p);// buscamos el objeto
    if(posicion>=0){// si lo encuentra
    this.listaPilotos[posicion]=null; //borramos
    this.numeroPilotos--;// arreglas el tamaño
    return true;
    
    }
    return false;
    }

}
