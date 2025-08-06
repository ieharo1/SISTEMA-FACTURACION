/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prbherenciamultiple;

/**
 *
 * @author Scrappy Doo Coco
 */
public class Circulo extends Figura implements Dibujable{
    //Atributos:
    private double radio;
    //Metodos:
    public Circulo(double radio){
        this.radio=radio;
    }

   
    public double area() {
     return Math.PI*Math.pow(radio,2);   
    }

    @Override
    public void dibujar() {
        System.out.println("Soy dibujable ");
    }
    
    
}
