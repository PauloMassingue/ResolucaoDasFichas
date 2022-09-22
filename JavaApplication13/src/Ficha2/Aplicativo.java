
package Ficha2;

public class Aplicativo {
   
    public static void main(String[] args) {
        Computador computador=new Computador();
        Impressora impressora=new Impressora();
        Simulacao simulacao=new Simulacao();
        simulacao.Simular(computador);
        simulacao.Simular(impressora);
     
    }
  
}
