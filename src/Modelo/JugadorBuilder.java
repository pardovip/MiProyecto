
package Modelo;

import java.util.ArrayList;

public abstract class JugadorBuilder {
         protected Jugador jugador;

  

    public Jugador getJugador() {
        return jugador;
    }

   public void crearJugador(){
    jugador=new Jugador();
   }

public abstract void agregarNombre(String nombre);
public abstract void agregarFicha(Ficha ficha);
//public abstract void agregarJugada(ArrayList <Jugada> jugadas);
    
    
}
