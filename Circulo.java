// Circulo.java
package prbherenciamultiple;

/**
 *
 * @author Fausto
 */
public class Circulo extends Figura
                     implements Dibujable
{
    // Atributos:
    private double radio;
    
    // Metodos:
    
    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public void dibujar() {
        System.out.println("Soy dibujable");
    }
    
}
