
package boletin.pkg12;

import static boletin.pkg12.Garaxe.numeroCoches;
import javax.swing.JOptionPane;



public class Boletin12 {

  
    public static void main(String[] args) {
    Garaxe garage = new Garaxe();
     
    
        
    Coches coche1 = new Coches("E-211223");
    
    Coches coche2 = new Coches("B-2233200");
    
    Coches coche3 = new Coches("C-3332234");
 
   int tempTotal = Integer.parseInt(JOptionPane.showInputDialog(" Introduza o tempo total "));
   if (tempTotal>0&&tempTotal<=3)
 coche1.coste1();
   else 
       coche1.coste2();
          
          
    }     
    }
    

