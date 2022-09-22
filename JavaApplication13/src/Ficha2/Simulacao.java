
package Ficha2;


public class Simulacao {
    
    public void Simular(Computador object){
    object.ligar();
    object.desligar();
    object.processar();
    System.out.println(object);
    }
    public void Simular(Impressora object){
    object.ligar();
    object.desligar();
    object.processarI();
    System.out.println(object);
       
     
}
   
    
}
