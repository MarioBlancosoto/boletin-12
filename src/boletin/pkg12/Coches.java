
package boletin.pkg12;

import java.time.Instant;
import javax.swing.JOptionPane;





public class Coches extends Garaxe{
  
    
  private String matricula ;
  
    public Coches(String matricula){
        this.matricula=matricula;
        numeroCoches++;
        
    }
    
    public Coches(){
      numeroCoches++;
      
    }

    public String getMatricula(String matricula) {
      
     this.matricula = matricula;  
      
   return matricula;
        
        
     
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

  public void coste1(){
       
         
     int horas = Integer.parseInt(JOptionPane.showInputDialog(" Amose o número de horas "));
     float total =  (float) ((horas)*(0.50)); 
         float pago = Float.parseFloat (JOptionPane.showInputDialog("Introduza o diñeiro "));
           
             JOptionPane.showMessageDialog(null,"A sua matricula e " +matricula+" Vostede estivo no parking " +horas+ "Horas" + "\n O seu total a pagar e " +total+" € ");
                   JOptionPane.showMessageDialog(null,"\n vostede Ha introducido " +pago+ "\n O seu cambio e " +(pago -total)+" €"+ "\n Grazas por usar o noso aparcadoiro");
    }
  
  
    public void coste2(){
        
   
       int horas = Integer.parseInt(JOptionPane.showInputDialog(" Amose o número de horas "));
        float total = (float) ((1.5)+(horas) *(0.20));
         float pago = Float.parseFloat (JOptionPane.showInputDialog("Introduza o diñeiro "));
           JOptionPane.showMessageDialog(null,"A sua matricula e "+matricula+" Estuvo no parking "+horas+" Horas"+ " e seu total a pagar e "+ total +" € ");
             JOptionPane.showMessageDialog(null,"\n vostede Ha introducido " +pago+ "\n O seu cambio e"+ (pago - total)+"\n Grazas por usar o noso aparcadoiro");
     
             
          
    }
     }
       
       
       
  
