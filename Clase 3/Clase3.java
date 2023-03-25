package com.matt.clase3;

import javax.swing.JOptionPane;

/**
 *
 * @author Matias Romero
 */
public class Clase3 {

    public static void main(String[] args) {

        //clase 3 ejercisio 1.a     
        //Dado un String y una letra, que cuente la cantidad de apariciones de la letra en el String       

        String cadena = JOptionPane.showInputDialog("Ingrese texto:");
        char[] chars = cadena.toCharArray();

        if (cadena.length() == 0) {

            JOptionPane.showMessageDialog(null, "La cadena esta vacia.", "Error", JOptionPane.ERROR_MESSAGE);

        } else {
            for (char c : chars) {
                if (Character.isDigit(c)) {
                    JOptionPane.showMessageDialog(null, "Una cadena de texto no contiene números", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }

        char letra = JOptionPane.showInputDialog("Ingrese letra:").charAt(0);

        if ((int) letra == 0) {
            JOptionPane.showMessageDialog(null, "No se ingresó una letra", "Error", JOptionPane.ERROR_MESSAGE);
        }

        int cont = 0;

        for (int i = 0; i < cadena.length(); i++) {

            if (cadena.charAt(i) == letra) {
                cont++;

            }
        }
        JOptionPane.showMessageDialog(null, "La letra: " + "'" + letra + "'\n"
                + "aparece " + "'"+ cont + "'" + " veces en la cadena de texto: \n" + "'" +
                cadena + "'", "Salida", JOptionPane.INFORMATION_MESSAGE);
        //System.out.println("La letra " + letra + " aparece " + cont + " veces en la cadena de texto ingresada");
    }

}
