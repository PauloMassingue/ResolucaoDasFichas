
package Ficha2;
public abstract class ProdutoEletronico {
    private int nrSerie;
    private String tipo;

    public int getNrSerie() {
        return nrSerie;
    }

    public void setNrSerie(int nrSerie) {
        this.nrSerie = nrSerie;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
   
    public void ligar(){
        
    }      
    public void desligar(){
       
    }
}
