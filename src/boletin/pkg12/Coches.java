
package boletin.pkg12;


import javax.swing.JOptionPane;





public class Coches extends Garaxe{
  
    
  private String matricula ;
  private float pago;
  
  
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

  public void factura(){
       
         
     int horas = Integer.parseInt(JOptionPane.showInputDialog(" Amose o número de horas "));//pidese o número de horas que o coche estivo no parking
     if (horas<3&&horas>0){ //se e menor a tres aplicaselle a tarifa de 0,50 a hora,amosando pago e devolución
     JOptionPane.showMessageDialog(null,"A sua matricula e " +matricula+" Vostede estivo no parking " +horas+ " Horas " + " \n O seu total a pagar e " +((horas)*(0.50))+" € ");
     pago = Float.parseFloat (JOptionPane.showInputDialog("Introduza o diñeiro ")); //pedimos que se introduzan os cartos
     JOptionPane.showMessageDialog(null," \n vostede Ha introducido " +pago+ " \n O seu cambio e " +(pago -((horas)*(0.50)))+" €"+ "\n Grazas por usar o noso aparcadoiro");
     }   else    //se o coche está mais de 3 horas aplicaselle a segunda tarifa e amosase o pago e a devolución     
     JOptionPane.showMessageDialog(null," A sua matricula e "+matricula+" Estivo no parking "+horas+" Horas "+ " e seu total a pagar e "+(1.5)+(horas) *(0.20)+" € ");
      pago = Float.parseFloat (JOptionPane.showInputDialog(" Introduza o diñeiro "));
     JOptionPane.showMessageDialog(null,"\n vostede Ha introducido " +pago+ "\n O seu cambio son "+ (pago - ((1.5)+(horas) *(0.20)))+" \n Grazas por usar o noso aparcadoiro");
    }
      
  
    
    
     }
       
  
     
  
