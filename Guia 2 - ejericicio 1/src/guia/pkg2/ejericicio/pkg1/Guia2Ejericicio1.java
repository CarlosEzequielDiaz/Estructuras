/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg2.ejericicio.pkg1;

import java.util.Scanner;

/**
 *
 * @author Carlos Ezequiel Diaz
 */
public class Guia2Ejericicio1 {

    /**
     1. Crear un programa que dado un número determine si es par o impar.
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        int n;
        
        System.out.print("Ingrese un numero: ");
        n = leer.nextInt();
        
        if (n%2 == 0) {
            
            System.out.println("El numero ingresado es par");
            
        } else {
            
            System.out.println("El numero ingresado es impar");
        }
        
        
    }
    
}
