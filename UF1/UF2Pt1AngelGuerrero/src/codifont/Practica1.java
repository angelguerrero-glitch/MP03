/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codifont;

/**
 *
 * @author Angel Guerrero
 */
public class Practica1 {

    public static void main(String[] args) {
        
    }

    public static int[] operaVector(int[] vector, int num, boolean comprovacio) {
        int[] resultat;
        if (comprovacio == true) {
            return null;
        } else {
            if (vector != null) {
                resultat = new int[vector.length];
                for (int i = 0; i < resultat.length; i++) {
                    resultat[i] = vector[i] + num;

                }
                return resultat;
            }
            return null;
        }
    }
}
