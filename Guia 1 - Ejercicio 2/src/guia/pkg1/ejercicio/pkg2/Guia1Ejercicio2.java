/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg1.ejercicio.pkg2;

import java.util.Scanner;

/**
 *
 * @author Carlos Ezequiel Diaz
 */
public class Guia1Ejercicio2 {

    /**
     * Escribir un programa que pida tu nombre, lo guarde en una variable 
     * y lo muestre por pantalla.
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        String nombre;
        
        System.out.println("Ingrese su nombre: ");
        nombre = leer.nextLine();
        
        System.out.println("El nombre ingresado es: "+nombre);
        
                
    }
    
}
