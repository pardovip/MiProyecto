
package Vista;

import Modelo.Director;
import Modelo.Ficha;
import Modelo.Ficha1;
import Modelo.Jugador;
import Modelo.Jugador1;
import Modelo.JugadorBuilder;

public class runJugador {
    public static void main(String[] args) {
        Director d= new Director();
        Ficha f1=new Ficha1("Roja");  // aqui va la ruta 
        d.setJugador(new Jugador1());
        d.construirJugador("juan",f1);
        
        Jugador j1= d.getJugador();
        System.out.println("nombre:"+j1.getNombre());
        System.out.println("ficha :"+j1.getFicha().getNombre());
      }
}
