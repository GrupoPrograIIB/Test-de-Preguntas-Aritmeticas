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
    
    PreguntaAdicion a = new PreguntaAdicion();
    PreguntaSustraccion s = new PreguntaSustraccion();
    PreguntaMultiplicacion m = new PreguntaMultiplicacion();
    String []lista = new String[10];// Array para guardar las preguntas
    int []respuesta = new int[10];// Array para guardar las respuestas

    // En el meto "generarPregunta" el parametro "int n" debe recibir valores de (Math.random() * 3 + 1) y "int numPregunta" recibe el numero de pregunta
    public String generarPregunta(int n, int numPregunta) {
        String out = "";
        if (n == 1) {
            out = a.getPregunta();
        } else if (n == 2) {
            out = s.getPregunta();
        } else if (n == 3) {
            out = m.getPregunta();
        }
        numPregunta--;
        lista[numPregunta] = out;
        
        return out;
    }
    
    // El metodo "verificarRespuesta" guarda la repuesta en un array para despues presentarlo en las respuestas:
    // Falta verificar si la respuesta es correcta en esta clase
    public void verificarRespuesta(int respuesta, int numPregunta){
        numPregunta--;
        this.respuesta[numPregunta] = respuesta;
    }

    public void listaRespuesta(){
        String out = "";
        for (int i = 0; i < 10; i++) {
            out += "PREGUNTA " +(i+1)+ "\n" +lista[i] + "\n\t Su respuesta: " + respuesta[i] + "\n";
        }
        System.out.println(out);
    }
}
