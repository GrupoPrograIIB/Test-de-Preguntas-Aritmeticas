/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testaritmetico;

import javax.swing.JOptionPane;

/**
 *
 * @author Paredes
 */
public class Principal {

    /**
     * Método Principal, es nuestra clase ejecutable en la que se presentara un menú que contendrá las opciones que serán presentadas
     * al usuario. Las opciónes mostradas en el switch serán: Resolver test, ver respuesta, calificar y finalmente salir que se 
     * presentarán dentro de un bucle "do while".   
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
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "ELija una opcion valida (1 - 4)");
            }

        } while (op != 4);
    }
    
    
    
    /**
     * Método resolverTest, en el se ha creado un arreglo tipo entero en el que se almacenaran las respuestas dadas por el
     * usuario.Las opciónes mostradas en el switch estarán entre (0-11) que serán equivalentes a las dies respuestas del encuestado 
     * más la opcion 11  la cual expondra un mensaje en el que se le presentará sus respuestas en un listado. 
     */

    public static int[] resolverTest(String []test) {
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
