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
public class PreguntaMultiplicacion implements PreguntaEntera{
    private int a,b;
    
    /**
     * @param PreguntaMultiplicacion() sera nuestro constructor en el cual this.a tendra 
     * un valor entero aleatorioentre ente (Math.random()*50+1).
     * De la misma forma this.b tendra el valor entero aleatorio entre (Math.random()*50)
     */
    
    public PreguntaMultiplicacion(){
        this.a = (int) (Math.random() * 50 + 1);
        this.b = (int) (Math.random() * 50);
    }
    
    
    /**
     * @param getPregunta() será el método sobre escrito para la clase PreguntaMultiplicacion en el cual se hace la pregunta al usuario
     * sobre cuál será el resultado de la multiplicación de los valores asignados para a y b. 
     */
    
    @Override
     public String getPregunta(){
        return "Cuanto es:"+a+" * "+b+"?";
    }
    
         
    /**
     * @param getRespuestaCorrecta() sera el método sobre escrito para la clase PreguntaMultiplicacion en la que se realizará la 
     * multiplicación de los valores asignados para a y b;
     */
    
    @Override
    public int getRespuestaCorrecta(){
        return a*b;
    }

    
}
