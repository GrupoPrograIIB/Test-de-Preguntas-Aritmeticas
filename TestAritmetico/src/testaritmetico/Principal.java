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
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String test[] = new String[11];
        String test2[] = new String[10];
        int respCorrectas[] = new int[10];
        int opc, respuestasUser[] = new int[10];
        boolean band = true;
        
        for (int i = 0; i < 10; i++) {
            int n = (int) (Math.random() * 4 + 1);
            test2[i] = Test.generarPregunta(n, (i + 1));
            test[i] = (i + 1) + " )  " + Test.generarPregunta(n, (i + 1)) + "\n";
            respCorrectas[i] = Test.generarRespuesta(n);
        }
        Test.setLista(test2);
        Test.setRespuesta(respuestasUser);
        test[10] = "11 )  Verficar";
        
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
                    JOptionPane.showMessageDialog(null, Test.calificacion(respuestasUser));
                    
                    band = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "ELija una opcion valida (1 - 10)");
            }
        } while (band);
        
    }
}
