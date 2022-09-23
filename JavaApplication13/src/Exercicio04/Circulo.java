/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio04;

/**
 *
 * @author Massingue
 */
public class Circulo extends FigurasGeometricas {
    private float raio;
  
 
  public void area(float raio){
      float area=(float) (3.14*raio*raio);
      System.out.println("A area eh "+area);
  }
    
}
