
package Modelo;

public class Ficha2 extends Ficha{
      private String nombre;

    public Ficha2(String nombre) {
        this.nombre = nombre;
    }

      @Override
    public String getNombre() {
        return nombre;
    }

      @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
