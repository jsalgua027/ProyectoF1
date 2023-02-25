/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listas;

import estructura.Monoplaza;

/**
 *
 * @author Windows10
 */
public class ListaMonoplazas {

    private int numeroMonoplzas;

    Monoplaza[] listaMonoplazas;

    // constructor de la lista de pilotos
    public ListaMonoplazas() {

     
        this.numeroMonoplzas = 2;
        this.listaMonoplazas = new Monoplaza[numeroMonoplzas];
        for (int i = 0; i < listaMonoplazas.length; i++) {
            this.listaMonoplazas[i] = new Monoplaza();
        }
    }

    @Override
    public String toString() {

        String tmp = "";

        for (Monoplaza m : listaMonoplazas) {
            if (m != null) {
                tmp += m.toString() + "\n";
            }

        }

        return tmp;
    }

    public int getNumeroMonoplzas() {
        return numeroMonoplzas;
    }

    // buscar piloto 
    private int buscarMonoplazaObjeto(Monoplaza m) {

        if (m != null) {// si el parametro NO es nulo
            for (int i = 0; i < this.listaMonoplazas.length; i++) {//recorre la lista
                if (this.listaMonoplazas[i] != null && m.equals(this.listaMonoplazas[i])) {// si no es nulo y es igual a el valor de dentro de la lista
                    return i;// numero positivo o cero
                }
            }

        }
        return -1;// sino negativo
    }

    // busqueda piloto por Nombre
    public Monoplaza buscarMonoplazaBastidor(String bastidor) {
        // creo el piloto para el paso por referencia
        Monoplaza aux = new Monoplaza();
        aux.setNumero_bastidor(bastidor);//fuerzo el nombre
        // uso el metodo buscar piloto que me da un valor int
        int posicion = buscarMonoplazaObjeto(aux);

        return (posicion >= 0) ? this.listaMonoplazas[posicion] : null; // me devuelves el piloto o nulo si no existe

    }

    // metodo privado copia
    private Monoplaza[] copiar() {

        Monoplaza[] aux = new Monoplaza[this.listaMonoplazas.length + 1];//array para realizar la copia +1 para que salte el null pointer
        for (int i = 0; i < this.listaMonoplazas.length; i++) {
            aux[i] = this.listaMonoplazas[i];
        }
        return aux;
    }

    // añadir piloto
    public void añadirMonoplaza(Monoplaza m) {
        if (numeroMonoplzas < this.listaMonoplazas.length) {
            for (int i = 0; i < this.listaMonoplazas.length; i++) {
                if (this.listaMonoplazas[i] == null) {// si encuentras un valor a null
                    this.listaMonoplazas[i] = m;//lo añades
                    this.numeroMonoplzas++;// sumas uno al tamaño del array
                    break;
                }
            }

        } else {
            this.numeroMonoplzas++;
            this.listaMonoplazas = copiar();
            this.listaMonoplazas[this.numeroMonoplzas - 1] = m;
        }

    }

    // borrar piloto
    public boolean borrarMonoplaza(Monoplaza m) {
        int posicion = buscarMonoplazaObjeto(m);// buscamos el objeto
        if (posicion >= 0) {// si lo encuentra
            this.listaMonoplazas[posicion] = null; //borramos
            this.numeroMonoplzas--;// arreglas el tamaño
            return true;

        }
        return false;
    }

}
