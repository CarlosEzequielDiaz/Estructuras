/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg2.ejercicio.pkg3;

import java.util.Scanner;

/**
 *
 * @author Carlos Ezequiel Diaz
 */
public class Guia2Ejercicio3 {

    /**
     Realizar un programa que solo permita introducir frases o palabras
de 8 de largo. Si el usuario ingresa una frase o palabra de 8 de largo se
deberá  de imprimir un mensaje por pantalla que diga “CORRECTO”, en
caso contrario, se deberá  imprimir “INCORRECTO”. Nota: investigar la
funciónn Lenght() en Java.
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        
        System.out.println("Ingrese una palabra o frase de 8 de largo");
        String frase = leer.nextLine();
        
        //int largo = frase.length();
        
        if (frase.length()==8){
            
            System.out.println("Correcto");
            
        } else {
            
            System.out.println("Incorrecto");
        }

        
    }
    
}
