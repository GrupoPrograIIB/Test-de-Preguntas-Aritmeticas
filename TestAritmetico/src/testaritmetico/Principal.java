/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testaritmetico;

import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Paredes
 */
public class Principal {

    private static String testResuelto;
    private static ArrayList<Usuario> usuarios = new ArrayList<>();

    /**
     * Método Principal, es nuestra clase ejecutable en la que se presentara un
     * menú que contendrá las opciones que serán presentadas al usuario. Las
     * opciónes mostradas en el switch serán: Resolver test, ver respuesta,
     * calificar y finalmente salir que se presentarán dentro de un bucle "do
     * while".
     *
     */
    public static void main(String[] args) {

        String test[] = new String[11];
        String test2[] = new String[10];
        int respCorrectas[] = new int[10];
        int respuestasUser[] = new int[10];

        for (int i = 0; i < 10; i++) {
            int n = (int) (Math.random() * 4 + 1);
            test2[i] = Test.generarPregunta(n, (i + 1));
            test[i] = (i + 1) + " )  " + Test.generarPregunta(n, (i + 1)) + "\n";
            respCorrectas[i] = Test.generarRespuesta();
        }
        Test.setLista(test2);
        Test.setRespuesta(respCorrectas);
        test[10] = "11 )  Verficar";

        int op = 0;
        testResuelto = "        TEST ARITMETICO     \n\n";
        String ced = JOptionPane.showInputDialog("Ingresar numero de cedula");
        Usuario u = nuevoUsuario(ced);

        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(null, "Escoga una opcion:\n1 Resolver Test\n2 Ver Respuestas\n3 Calificar\n4 Salir"));
            switch (op) {
                case 1:// Resolver Test
                    respuestasUser = Principal.resolverTest(test);
                    break;
                case 2:// Ver Respuestas
                    JOptionPane.showMessageDialog(null, Test.mensajeRespuesta(respuestasUser));
                    break;
                case 3:// Calificar
                    JOptionPane.showMessageDialog(null, Test.calificacion(respuestasUser));
                    break;
                case 4:// Salir
                    testResuelto += u;
                    System.out.println(u);
                    testResuelto += Test.mensajeRespuesta(respuestasUser) + "\n";
                    testResuelto += Test.calificacion(respuestasUser);
                    Test.escribirTest(testResuelto);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "ELija una opcion valida (1 - 4)");
            }

        } while (op != 4);
    }

    private static Usuario nuevoUsuario(String cedula) {
        String nombre = JOptionPane.showInputDialog("Ingresar nombre usuario");
        String ciclo = JOptionPane.showInputDialog("Ingresar cicloque cursa el usuario");
        String paralelo = JOptionPane.showInputDialog("Ingresar paralelo al que pertenece el usuario");
        Usuario u = new Usuario(nombre, cedula, ciclo, paralelo);
        return u;
    }

    private static Usuario verificarUsuario() {
        String ced = JOptionPane.showInputDialog("Ingresar numero de cedula");
        Usuario u = new Usuario(ced);
        for (Usuario usuario : usuarios) {
            if (!u.equals(usuario)) {
                usuario.setNumTest(usuario.getNumTest() + 1);
            } else {
                u = nuevoUsuario(ced);
            }
        }
        return u;
    }

    /**
     * Método resolverTest, en el se ha creado un arreglo tipo entero en el que
     * se almacenaran las respuestas dadas por el usuario.Las opciónes mostradas
     * en el switch estarán entre (0-11) que serán equivalentes a las dies
     * respuestas del encuestado más la opcion 11 la cual expondra un mensaje en
     * el que se le presentará sus respuestas en un listado.
     *
     * @param test String[], arreglo que contiene el test
     *
     */
    public static int[] resolverTest(String[] test) {
        int[] respuestasUser = new int[10];
        boolean band = true;
        int opc;
        do {
            opc = Integer.parseInt(JOptionPane.showInputDialog(test, "Elija la pregunta que desea responer"));
            switch (opc) {
                case 1:
                    respuestasUser[0] = Integer.parseInt(JOptionPane.showInputDialog(test[0], "Ingrese su respuesta"));
                    break;
                case 2:
                    respuestasUser[1] = Integer.parseInt(JOptionPane.showInputDialog(test[1], "Ingrese su respuesta"));
                    break;
                case 3:
                    respuestasUser[2] = Integer.parseInt(JOptionPane.showInputDialog(test[2], "Ingrese su respuesta"));
                    break;
                case 4:
                    respuestasUser[3] = Integer.parseInt(JOptionPane.showInputDialog(test[3], "Ingrese su respuesta"));
                    break;
                case 5:
                    respuestasUser[4] = Integer.parseInt(JOptionPane.showInputDialog(test[4], "Ingrese su respuesta"));
                    break;
                case 6:
                    respuestasUser[5] = Integer.parseInt(JOptionPane.showInputDialog(test[5], "Ingrese su respuesta"));
                    break;
                case 7:
                    respuestasUser[6] = Integer.parseInt(JOptionPane.showInputDialog(test[6], "Ingrese su respuesta"));
                    break;
                case 8:
                    respuestasUser[7] = Integer.parseInt(JOptionPane.showInputDialog(test[7], "Ingrese su respuesta"));
                    break;
                case 9:
                    respuestasUser[8] = Integer.parseInt(JOptionPane.showInputDialog(test[8], "Ingrese su respuesta"));
                    break;
                case 10:
                    respuestasUser[9] = Integer.parseInt(JOptionPane.showInputDialog(test[9], "Ingrese su respuesta"));
                    break;
                case 11:
                    JOptionPane.showMessageDialog(null, Test.mensajeRespuesta(respuestasUser));
                    band = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "ELija una opcion valida (1 - 10)");
            }
        } while (band);
        return respuestasUser;
    }
}
