
package boletin.pkg12;

import javax.swing.JOptionPane;


public class Garaxe {
    public static int numeroCoches;
   
    
   
    public Garaxe(){
    
        
    }

    public int getNumeroCoches() {
        return numeroCoches;
    }

    public void setNumeroCoches(int numeroCoches) {
        this.numeroCoches = numeroCoches;
    }
    
    
    public void aparcamento(){
        
      
        
        if(numeroCoches>=5){
            System.out.println("COMPLETO");
        }
        else if(numeroCoches>0&&numeroCoches<5){
           
            setNumeroCoches(numeroCoches);
            
           JOptionPane.showMessageDialog(null," Agora mesmo hay "+numeroCoches+" no Parking ");
          
    
       }
        
          }
     
    public void amosar(){
        
      
        
    }
    
    
    
      }
       
       
       
    
    
    
    

    

