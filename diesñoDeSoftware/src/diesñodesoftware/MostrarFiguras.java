/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diesñodesoftware;

import com.udec.figurasgeometricas.Figuras2D;

/**
 *
 * @author Reyes
 */
public class MostrarFiguras {
    /**
     * Metodo que sirve para imprimir por pantalla la lista de todas las figuras en 2D ingresadas
     */
    public void mostrar2D()
    {
        System.out.println("las figuras registradas en 2D son: ");
        for (Figuras2D figuras : figura2) {
            if(figuras instanceof Circulo)
            {
                Circulo cir = (Circulo)figuras;
                cir.imprimir();
            }
            else if(figuras instanceof Cuadrado)
            {
                Cuadrado carro = (Cuadrado)figuras;
                carro.imprimir();
            }
            else if(figuras instanceof Triangulo)
            {
                Triangulo carro = (Triangulo)figuras;
                carro.imprimir();
            }
        }
    }
    /**
     * Metodo que sirve para imprimir por pantalla la lista de todas las figuras en 3D ingresadas
     */
    public void mostrar3D()
    {
        System.out.println("las figuras registradas en 3D son: ");
        for (Figuras3D figuras : figura3) {
            if(figuras instanceof Cubo)
            {
                Cubo cir = (Cubo)figuras;
                cir.imprimir();
            }
            else if(figuras instanceof Piramide)
            {
                Piramide carro = (Piramide)figuras;
                carro.imprimir();
            }
            else if(figuras instanceof Esfera)
            {
                Esfera carro = (Esfera)figuras;
                carro.imprimir();
            }
        }
    }    
    
}
