/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg1.ejercicio.pkg4;

import java.util.Scanner;

/**
 *
 * @author Carlos Ezequiel Diaz
 */
public class Guia1Ejercicio4 {

    /**
     * Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit.
     * La fórmula correspondiente es: F = 32 + (9 * C / 5).
     */
    
    public static void main(String[] args) {
        
    Scanner leer = new Scanner (System.in);
    double c;
    
        
    System.out.println("Por favor ingrese la temperatura en Grados Cº: ");
    c = leer.nextDouble();
    
    double f =  32+(9*c/5);
    
    System.out.println("El equivalente el Fahrenheit es: "+ f);
    
          
        
    }
    
}
