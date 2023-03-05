
import javax.swing.JOptionPane;

/**
 *
 * @author Maias Romero
 */
public class ejercisio2 {

    public static void main(String args[]) {

        float ingresosTotales = Float.parseFloat(JOptionPane.showInputDialog("Ingresos mensuales totales: ",
                JOptionPane.QUESTION_MESSAGE));
        int cantVehiculos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de vehiculos: ",
                JOptionPane.QUESTION_MESSAGE));
        int cantVehiculosXmar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de vehiculos por mar: ",
                JOptionPane.QUESTION_MESSAGE));
        int cantVehiculosXaire = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de vehiculos por aire: ",
                JOptionPane.QUESTION_MESSAGE));
        int cantInmuebeles = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de inmuebles: ",
                JOptionPane.QUESTION_MESSAGE));

        if (ingresosTotales >= 489.083 && cantInmuebeles >= 3 && cantVehiculos >= 3
                && cantVehiculosXmar > 0 && cantVehiculosXaire > 0) {

            JOptionPane.showMessageDialog(null, "Ud. pertence al segmento de ingresos altos",
                    "Categoría", JOptionPane.INFORMATION_MESSAGE);

        } else if (ingresosTotales >= 489.083 && cantInmuebeles < 3 && cantVehiculos >= 3
                && cantVehiculosXmar > 0 && cantVehiculosXaire > 0) {

            JOptionPane.showMessageDialog(null, "Ud. pertenece al segmento de ingresos medios",
                    "Categoría", JOptionPane.INFORMATION_MESSAGE);

        } else if (ingresosTotales >= 489.083 && cantInmuebeles >= 3 && cantVehiculos < 3
                && cantVehiculosXmar > 0 && cantVehiculosXaire > 0) {

            JOptionPane.showMessageDialog(null, "Ud. pertenece al segmento de ingresos medios",
                    "Categoría", JOptionPane.INFORMATION_MESSAGE);

        } else if (ingresosTotales >= 489.083 && cantInmuebeles >= 3 && cantVehiculos >= 3
                && cantVehiculosXmar == 0 && cantVehiculosXaire > 0) {

            JOptionPane.showMessageDialog(null, "Ud. pertenece al segmento de ingresos medios",
                    "Categoría", JOptionPane.INFORMATION_MESSAGE);

        } else if (ingresosTotales >= 489.083 && cantInmuebeles >= 3 && cantVehiculos >= 3
                && cantVehiculosXmar > 0 && cantVehiculosXaire == 0) {

            JOptionPane.showMessageDialog(null, "Ud. pertenece al segmento de ingresos medios",
                    "Categoría", JOptionPane.INFORMATION_MESSAGE);

        } else if (ingresosTotales < 489.083 && ingresosTotales >= 350.000 ) {

            JOptionPane.showMessageDialog(null, "Ud. pertenece al segmento de ingresos medios",
                    "Categoría", JOptionPane.INFORMATION_MESSAGE);

        } else if (ingresosTotales < 350.000) {

            JOptionPane.showMessageDialog(null, "Ud. pertenece al segmento de ingresos bajos",
                    "Categoría", JOptionPane.INFORMATION_MESSAGE);

        }

    }
}
