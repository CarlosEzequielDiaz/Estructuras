/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg1.ejercicio.pkg1;

import java.util.Scanner;

/**
 *
 * @author Carlos Ezequiel Diaz
 */
public class Guia1Ejercicio1 {

    /**
     * Escribir un programa que pida dos números enteros por teclado y calcule la suma de los dos. 
     * El programa deberá después mostrar el resultado de la suma
     */
    
    
    public static void main(String[] args) {
        
        int n1;
        int n2;
        
        Scanner leer;
        leer = new Scanner (System.in);
        
        System.out.println("Ingrese dos numeros: ");
        n1 = leer.nextInt();
        n2 = leer.nextInt();
        
        System.out.println("La suma de los numeros ingresados es: "+ (n1+n2));
        
    }
    
}
