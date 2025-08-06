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
public class PrbHerenciaMultiple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circulo cir = new Circulo(10);
        System.out.println("Soy un circulo, mi area es: "+cir.area());
        cir.dibujar();
        
    }
    
}
