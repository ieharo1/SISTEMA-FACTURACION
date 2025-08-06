// PrbHerenciaMultiple.java
/*
Implementa herencia multiple
*/
package prbherenciamultiple;

/**
 *
 * @author Fausto
 */
public class PrbHerenciaMultiple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Circulo cir = new Circulo(10);
        System.out.println("Soy un circulo, mi area es: " + cir.area());
        cir.dibujar();
    }
    
}
