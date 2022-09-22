package Ficha2;
public class Impressora extends ProdutoEletronico {
private String velocidadeI;

    public String getVelocidadeI() {
        return velocidadeI;
    }

    public void setVelocidadeI(String velocidadeI) {
        this.velocidadeI = velocidadeI;
    }
public void processarI(){
    System.out.println("Impressora processando");
}
@Override
public void ligar(){
    System.out.println("A impressora esta pronta para receber os documentos");
    
}
public void desligar(){
    System.out.println("A impressora nao esta mais disponivel");
}

    @Override
    public String toString() {
        return "Impressora{" + "velocidadeI=" + velocidadeI + '}';
    }
   

    
}
