
package com.matt.clase3;

import javax.swing.JOptionPane;

/**
 *
 * @author Matias Romero
 */
public class Clase3ejer2 {
   
    public static void main(String[] args) {
        
        String texto = JOptionPane.showInputDialog("Ingrese algún texto:");
        int desplz = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cuantos lugares desea desplazarse en la cadena: "));
        
        char [] cadena = texto.replace(" ","").toCharArray();            
        
        for (int i = 0; i < cadena.length; i++) {
            
            cadena[i] += desplz;
            
        }
                
        String salida = new String(cadena);
        System.out.println("cadena ingresada: " + texto);
        System.out.println("Se desplaza: " + desplz + " lugar/es");
        System.out.println("resultado: " + salida);
    }
    
}
