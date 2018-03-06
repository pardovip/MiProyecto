
package Modelo;

import java.util.ArrayList;

public class Jugador {
    private String nombre;
    private Ficha ficha;
    private ArrayList <Jugada> jugadas;

    
    Jugador() {
          }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public Ficha getFicha() {
        return ficha;
    }

    public void setFicha(Ficha ficha) {
        this.ficha = ficha;
    }

 
    public ArrayList<Jugada> getJugadas() {
        return jugadas;
    }

    public void setJugadas(ArrayList<Jugada> jugadas) {
        this.jugadas = jugadas;
    }
    
    
}
