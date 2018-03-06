
package Modelo;


public class Jugada implements Cloneable {
   private int x;
   private int y;

    public Jugada(int x, int y) {
        this.x = x;
        this.y = y;
    }

   

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
   
   public void crearJugada(int x , int y){
       this.x=x;
       this.y=y;
   }
    
   public Jugada Clone() throws CloneNotSupportedException{
   return (Jugada)super.clone();
   }

    
    

}
