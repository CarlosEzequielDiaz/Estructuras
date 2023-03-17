/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg1.ejercicio.pkg3;

import java.util.Scanner;

/**
 *
 * @author Carlos Ezequiel Diaz
 */
public class Guia1Ejercicio3 {

    /**
     * Escribir un programa que pida una frase y la muestre toda en mayúsculas
     * y después toda en minúsculas. 
     * Nota: investigar la función toUpperCase() y toLowerCase() en Java.
     */
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        String frase;
        
        System.out.println("Ingrese una frase: ");
        frase = leer.nextLine();
        
        System.out.println("La frase en mayusculas es "+ frase.toUpperCase());
        System.out.println("La frase en minusculas es "+ frase.toLowerCase());
        
        
    }
    
}
