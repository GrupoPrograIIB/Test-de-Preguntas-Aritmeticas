/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestAritmético;

/**
 *
 * @author Camila Cueva
 */
public class PreguntaMultiplicacion implements PreguntaEntera{
    private int a,b;
    
    public PreguntaMultiplicacion(){
        a = (int) (Math.random() * 50 + 1);
        b = (int) (Math.random() * 50);
    }
    
    @Override
     public String getPregunta(){
        return "Cuanto es:"+a+" * "+b+"?";
    }
    @Override
    public int getRespuestaCorrecta(){
        return a*b;
    }
    
    
    
}
