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
public class PreguntaDivision implements PreguntaEntera {

    private int a, b;

    public PreguntaDivision() {

        this.a = (int) (Math.random() * 50 + 1);
        this.b = (int) (Math.random() * 50);

    }

    @Override
    public String getPregunta() {
        return "Cuanto es:" + a + " / " + b + "?";
    }

    @Override
    public int getRespuestaCorrecta() {
        return a / b;
    }


}
