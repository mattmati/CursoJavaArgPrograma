package com.matt.clase3;

import javax.swing.JOptionPane;

/**
 *
 * @author Matias Romero
 */
public class Clase3ejer1c {

    public static void main(String[] args) {
        // Clase 3 Ejercisio 1.c
        //dado un vector de números, y un número X, que sume todos los números > X y
        //retorne el resultado

        JOptionPane.showMessageDialog(null, "a continuación ingrese 5 números para formar un vector de números",
                 "Vector de números", JOptionPane.INFORMATION_MESSAGE);

        int nro1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese número 1: "));
        int nro2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese número 2: "));
        int nro3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese número 3: "));
        int nro4 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese número 4: "));
        int nro5 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese número 5: "));
        int nroX = Integer.parseInt(JOptionPane.showInputDialog("Ingrese número X: "));

        int[] numeros = {nro1, nro2, nro3, nro4, nro5};

        int sumNumMayoresX = 0;

        System.out.println("Los números ingresados son: ");
        
        for (int i = 0; i < numeros.length; i++) {

            System.out.println("- " + numeros[i]);

            if (numeros[i] > nroX) {

                sumNumMayoresX += numeros[i];
            }

        }

        System.out.println("La suma de los números mayores a " + nroX + " es: " + sumNumMayoresX);

    }

}
