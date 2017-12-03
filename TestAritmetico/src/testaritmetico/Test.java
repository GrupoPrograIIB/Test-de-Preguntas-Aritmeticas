/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testaritmetico;

/**
 *
 * @author JonnathanE
 */
public class Test {

    private static PreguntaAdicion a = new PreguntaAdicion();
    private static PreguntaSustraccion s = new PreguntaSustraccion();
    private static PreguntaMultiplicacion m = new PreguntaMultiplicacion();
    private static PreguntaDivision d = new PreguntaDivision();
    private static String[] lista = new String[10];// Array para guardar las preguntas
    private static int[] respuesta = new int[10];// Array para guardar las respuestas
    private static int n = 0;

    // En el meto "generarPregunta" el parametro "int n" debe recibir valores de (Math.random() * 3 + 1) y "int numPregunta" recibe el numero de pregunta
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
        lista[numPregunta] = out;

        return out;
    }

    private void generarRespuesta(int numPregunta) {
        numPregunta--;
        if (n == 1) {
            this.respuesta[numPregunta] = a.getRespuestaCorrecta();
        } else if (n == 2) {
            this.respuesta[numPregunta] = s.getRespuestaCorrecta();
        } else if (n == 3) {
            this.respuesta[numPregunta] = m.getRespuestaCorrecta();
        } else if (n == 4) {
            this.respuesta[numPregunta] = d.getRespuestaCorrecta();
        }

    }

    // El metodo "verificarRespuesta" guarda la repuesta en un array para despues presentarlo en las respuestas:
    // Falta verificar si la respuesta es correcta en esta clase
    public void verificarRespuesta(int respuesta, int numPregunta) {
        
        this.generarRespuesta(numPregunta);
        numPregunta--;
        if (this.respuesta[numPregunta] == respuesta) {
            System.out.printf("La respuesta es correcta");
        } else {
            System.out.printf("RESPUEDTA INCORRECTA:\n la respuesta correcta a la pregunta " + lista[numPregunta] + " es: " + this.respuesta[numPregunta]);

        }
    }

    public void listaRespuesta() {
        String out = "";
        for (int i = 0; i < 10; i++) {
            out += "PREGUNTA " + (i + 1) + "\n" + lista[i] + "\n\t Su respuesta: " + respuesta[i] + "\n";
        }
        System.out.println(out);
    }
}
