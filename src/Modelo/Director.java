
package Modelo;

public class Director {
    private JugadorBuilder jugador;

    public Jugador getJugador() {
        return this.jugador.getJugador();
    }
    
    public void setJugador(JugadorBuilder jugador){
        this.jugador=jugador;
    }
    
    public void construirJugador (String nombre ,Ficha ficha){
            jugador.crearJugador();
            jugador.agregarNombre(nombre);
            jugador.agregarFicha(ficha);
    }
}
