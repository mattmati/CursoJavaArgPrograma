
import javax.swing.JOptionPane;

/**
 *
 * @author Matias Romero
 */
public class Clase1 {

    public static void main(String args[]) {

        try {

            int numInicio = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese número de Inicio : ",
                    JOptionPane.QUESTION_MESSAGE));
            int numFin = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese número de Fin : ",
                    JOptionPane.QUESTION_MESSAGE));

            int array[] = new int[numFin];

            int opcion;

            do {

                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Ingrese 1 si desea mostrar números en orden Ascendente\n"
                        + "Ingrese 2 si desea mostrar números en orden Descendente\n"
                        + "Ingrese 3 si desea mostrar solo números Pares\n"
                        + "Ingrese 4 si desea mostrar solo números Impares\n"
                        + "Ingrese 5 si desea salir de la aplicación\n",
                        JOptionPane.CENTER_ALIGNMENT));

                switch (opcion) {
                    case 1:

                        System.out.println("Números en oden ascendente:");

                        for (int i = 0; i <= array.length; i++) {

                            if (i >= numInicio) {

                                System.out.println(i);
                            }
                        }
                        break;

                    case 2:

                        System.out.println("");
                        System.out.println("Números en oden Descendente:");

                        for (int l = array.length; l >= 0; l--) {

                            if (l >= numInicio) {

                                System.out.println(l);
                            }

                        }
                        break;

                    case 3:

                        System.out.println("");
                        System.out.println("Solo Números Pares:");

                        for (int j = 0; j <= array.length; j++) {

                            if (j >= numInicio && j % 2 == 0) {

                                System.out.println(j);
                            }

                        }
                        break;

                    case 4:

                        System.out.println("");
                        System.out.println("Solo Números Impares:");

                        for (int k = 0; k <= array.length; k++) {

                            if (k >= numInicio && k % 2 != 0) {

                                System.out.println(k);
                            }

                        }
                        break;

                    case 5:
                        JOptionPane.showMessageDialog(null, "Gracias por utilizar la aplicación!!!", "Saliendo de la aplicación",
                                JOptionPane.INFORMATION_MESSAGE);

                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "El valor ingresado es incorrecto", "ERROR",
                                JOptionPane.ERROR_MESSAGE);
                }

            } while (opcion != 5);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ingrese solo número enteros", "ERROR",
                    JOptionPane.ERROR_MESSAGE);
        }

    }

}
