
package com.matt.clase3;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Matias Romero
 */
public class Clase3ejer1b {

    public static void main(String[] args) {
        //clase 3 ejercisio 1 b
        // Dados 3 números y un orden (ascendente o decreciente) que ordene los
        // mismos y los retorne en un vector de 3
        
        int nro1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese número 1: "));
        int nro2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese número 2: "));
        int nro3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese número 3: "));
        
        int numeros [] = {nro1, nro2, nro3};
        
        Arrays.sort(numeros);
        
        System.out.println("Números ordenados en forma ASCENDENTE");
        
        for (int i = 0; i < numeros.length; i++) {                        
            
            System.out.println("- " + numeros[i]);
            
        }
        
        System.out.println("Números ordenados en forma DESCENDENTE");
        
        for (int j = numeros.length - 1; j >= 0; j--) {
            
            System.out.println("- " + numeros[j]);
        }
        
        
        
    }
    
}
