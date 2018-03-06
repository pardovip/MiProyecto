
package Modelo;

public class Ficha1 extends Ficha{
    private String nombre;

    public Ficha1(String nombre) {
        this.nombre = nombre;
    }

    public Ficha1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
