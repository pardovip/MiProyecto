
package Modelo;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReglaFactory implements FactoryMethodRegla{

       
    @Override
    public ArrayList<Regla> crearReglas() {
        
        int x=0;
        int y=0;
        
        Jugada j1= new Jugada(x,y);
      int matrizx [][]={{0,0,0}, 
                        {1,1,1},
                         {2,2,2},
                        { 0,1,2},
                        { 0,1,2},
                        { 0,1,2},
                         {0,1,2},
                          { 0,1,2}};
     int matrizy [][]={{0,1,2}, 
                        {0,1,2},
                         {0,1,2},
                        { 0,0,0},
                        { 1,1,1},
                        { 2,2,2},
                         {0,1,2},
                         { 2,1,0}} ;
      ArrayList<Regla> r=new ArrayList();
      Regla re= new ReglaConcreta(); 

      

      int b=1;
      
      for(int i=0 ; i<matrizx.length ;i++){
          for(int j=0 ; j<matrizx.length ;j++){
              if(b<=3){
               Regla ra=re 
               ra.agregarJugada(matrizx[i][j], matrizy[i][j]);
               r.add(ra);
               b++;
          }else{
              b=1;
              }
          }
      }

      
      
      
      for(int i=0 ; i<matrizy.length ;i++){
          for(int j=0 ; j<matrizy.length ;j++){
              y=matrizx[i][j];
          }
      }
        

        try {
            Jugada j2 =j1.Clone();
            j2.crearJugada(0, 1);
            Jugada j3 =j1.Clone();
            
            
        } catch (CloneNotSupportedException ex) {
            
        }
            return null; 
        
    }


        
   
    
}
