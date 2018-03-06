
package Modelo;

import java.util.ArrayList;
import java.util.Iterator;

public class ReglaConcreta extends Regla{
                           
    
    
    @Override
    public void agregarJugada(int x, int y) {
        if(this.regla.size()<3){
       this.regla.add(new Jugada(x,y));
    }
    }

}
