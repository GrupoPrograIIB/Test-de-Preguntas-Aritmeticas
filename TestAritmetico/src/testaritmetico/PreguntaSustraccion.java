/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testaritmetico;


/**
 *
 * @author Camila Cueva
 */
public class PreguntaSustraccion implements PreguntaEntera {

    private int a, b;
    
     /**
     * @param PreguntaSustraccion() sera nuestro constructor en el cual this.a tendra 
     * un valor entero aleatorioentre ente (Math.random()*50+1).
     * De la misma forma this.b tendra el valor entero aleatorio entre (Math.random()*50)
     */

    public PreguntaSustraccion() {
        this.a = (int) (Math.random() * 50 + 1);
        this.b = (int) (Math.random() * 50);

    }
    
    
    /**
     * @param getPregunta() será el método sobre escrito para la clase PreguntaSustraccion en el cual se hace la pregunta al usuario
     * sobre cuál será el resultado de la sustracción de los valores asignados para a y b.
     */
    @Override
     public String getPregunta(){
        return "Cuanto es:"+a+" - "+b+"?";
    }
    
    /**
     * @param getRespuestaCorrecta() sera el método sobre escrito para la clase PreguntaSustraccion en la que se realizará la suma
     * de los valores asignados para a y b; 
     */
    @Override
    public int getRespuestaCorrecta(){
        return a-b;
    }


}
