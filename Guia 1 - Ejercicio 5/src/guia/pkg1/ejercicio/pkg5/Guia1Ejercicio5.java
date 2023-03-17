/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg1.ejercicio.pkg5;

import java.util.Scanner;

/**
 *
 * @author Carlos Ezequiel Diaz
 */
public class Guia1Ejercicio5 {

    /**
     * Escribir un programa que lea un número entero por teclado
     * y muestre por pantalla el doble, el triple y la raíz cuadrada
     * de ese número. Nota: investigar la función Math.sqrt().
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        System.out.print("Por favor ingrese un numero para hacer calculos: ");
        int n = leer.nextInt();
        
        System.out.println("El doble del valor ingresado es "+n*2);
        System.out.println("El triple del valor ingresado es "+n*3);
        System.out.println("La raiz cuadrada del valor ingresado es "+ Math.sqrt(n));
        
        
    }
    
}
