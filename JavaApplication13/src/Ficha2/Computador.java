
package Ficha2;


public class Computador extends ProdutoEletronico {
private String velocidadeP;

    public String getVelocidadeP() {
        return velocidadeP;
    }

    public void setVelocidadeP() {
        this.velocidadeP = velocidadeP;
    }

public void processar(String velocidadeP){
    System.out.println("O computador processando");
}
@Override
public void ligar(){
    System.out.println("O computador esta pronto para uso");
}
public void desligar(){
    System.out.println("O computador ja pode ser desligado com seguranca");
}
    
    
}
