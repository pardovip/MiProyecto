
package Modelo;

import java.util.ArrayList;

public class Jugador1 extends JugadorBuilder{

    @Override
    public void agregarNombre(String nombre) {
       this.jugador.setNombre(nombre);
    }

    @Override
    public void agregarFicha(Ficha ficha) {
    this.jugador.setFicha(ficha);
    }
/*
    @Override
    public void agregarJugada(ArrayList <Jugada> jugadas) {
     this.jugador.setJugadas(jugadas);
    }*/
    
}
