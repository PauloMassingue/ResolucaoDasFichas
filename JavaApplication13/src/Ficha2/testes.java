/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ficha2;

/**
 *
 * @author Massingue
 */
public class testes {
    public static void main(String[] args) {
        Computador computador=new Computador();
        Impressora impressora=new Impressora();
        Simulacao simulacao=new Simulacao();
        simulacao.Simular(computador);
        simulacao.Simular(impressora);
    }
  
}
