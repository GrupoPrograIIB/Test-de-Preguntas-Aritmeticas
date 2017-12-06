/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testaritmetico;
    
import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 *
 * @author JonnathanE
 */
public class Test {

    private static PreguntaAdicion a = new PreguntaAdicion();
    private static PreguntaSustraccion s = new PreguntaSustraccion();
    private static PreguntaMultiplicacion m = new PreguntaMultiplicacion();
    private static PreguntaDivision d = new PreguntaDivision();
    private static String[] test = new String[10];// Array para guardar las preguntas
    private static int[] respuesta = new int[10];// Array para guardar las respuestas
    private static int n = 0;
    private static int calificacion = 0;
    
    /**
     * Método generarPregunta, aquí el parametro "int n" debe recibir valores de (Math.random() * 3 + 1) y "int numPregunta" 
     *recibe el numero de pregunta
     * @param n int, representa la operacion a realizar
     * @param numPregunta int, es el numero de pregunta
     */
    
    public static String generarPregunta(int n, int numPregunta) {
        String out = "";
        if (n == 1) {
            out = a.getPregunta();
            Test.n = 1;
        } else if (n == 2) {
            out = s.getPregunta();
            Test.n = 2;
        } else if (n == 3) {
            out = m.getPregunta();
            Test.n = 3;
        } else if (n == 4) {
            out = d.getPregunta();
            Test.n = 4;
        }
        numPregunta--;
        test[numPregunta] = out;

        return out;
    }
    
     /**
     * Método generarRespuesta, retornará una respuesta correcta a partir del cumplimiento de los condicionales.
     * 
     */

    public static int generarRespuesta() {
        
        if (n == 1) {
            return a.getRespuestaCorrecta();
        } else if (n == 2) {
            return s.getRespuestaCorrecta();
        } else if (n == 3) {
            return m.getRespuestaCorrecta();
        } else {
            return d.getRespuestaCorrecta();
        }
    }
    
    /**
     * Método calificacion , guardará la nota obtenida por cada pregunta correcta para luego presentar  la calificación 
     * global que el usuario obtuvo. 
     */

    public static String calificacion(int[] respuestasUser) {
        for (int i = 0; i < 10; i++) {
            if (respuestasUser[i] == respuesta[i] && respuestasUser[i] != 0) {
                Test.calificacion += 10;
            }
        }
        String cali = "Su calificacion es: " + calificacion;
        return cali;
    }
    
    /**
     * Método mensajeRespuesta , guardará la repuesta en un array para despues presentarlo en las respuestas:
     * 
     * @param respuestasUser int, es la respuesta del usuario
     * 
     */
    
    public static String mensajeRespuesta(int[] respuestasUser) {
        String out = "";
        for (int i = 0; i < 10; i++) {
            out += "        PREGUNTA " + (i + 1) + "\n" + test[i] + "\n";
            if (respuestasUser[i] == 0) {
                out += "Pregunta no contestada\n";

            } else if (respuestasUser[i] != respuesta[i]) {
                out += "Su respuesta: " + respuestasUser[i] + "\n" + "Incorrecta: \nLa repuesta correcta es:" + respuesta[i] + "\n" + "Calificacion: " + 0 + "\n";
            } else {
                if (respuestasUser[i] == respuesta[i]) {
                    out += "Su respuesta: " + respuesta[i] + "\n" + "Respuesta Correcta\n" + "Calificacion: " + 10 + "\n";
                }

            }
        }
        return out;
    }

    /**
     * Método escribe un archivo del test resuelto y calificado
     * @param test 
     */
    public static void escribirTest(String test){
        try (BufferedWriter out = new BufferedWriter(new FileWriter("Test.txt"))){
            out.write(test);
            out.close();
        } catch (Exception e) {
            System.out.println("Error al escribir el archivo" + e);
        }
        
    }
    
    public static String[] getLista() {
        return test;
    }

    public static void setLista(String[] test) {
        Test.test = test;
    }

    public static int[] getRespuesta() {
        return respuesta;
    }

    public static void setRespuesta(int[] respuesta) {
        Test.respuesta = respuesta;
    }
}
