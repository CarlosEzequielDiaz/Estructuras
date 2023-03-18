/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.teorica.ejercicio.pkg8;

import java.util.Scanner;

/**
 *
 * @author Carlos Ezequiel Diaz
 */
public class GuiaTeoricaEjercicio8 {

    /**
     Escriba un programa que valide si una nota está  entre 0 y 10, sino está  entre 0
y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
       /* System.out.println("Ingrese una nota del 0 al 10");
        int nota = leer.nextInt();
        
        while (nota<0 || nota>10){
            
            System.out.println("La nota ingresada no es correcta, vuelva a intentarlo");
            nota = leer.nextInt();
        }
        
        System.out.println("La nota ingresada es correcta, Felicitaciones!!!");
        
    }*/
        
            
       int nota;
       
       do {
       System.out.println("Ingrese una nota del 0 al 10");
       nota = leer.nextInt();
          
           
       } while (nota <0 || nota>10);
    
System.out.println("La nota ingresada es correcta, Felicitaciones!!!");               
               
}
}