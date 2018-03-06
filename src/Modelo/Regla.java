
package Modelo;

import java.util.ArrayList;

public abstract class Regla implements Cloneable {
    
     protected ArrayList <Jugada> regla;

    public Regla() {
        regla=new ArrayList();
    }

    public ArrayList<Jugada> getReglas() {
        return regla;
    }

    public void setReglas(ArrayList<Jugada> regla) {
        this.regla = regla;
    }
     
    public abstract void agregarJugada (int x , int y );
}
