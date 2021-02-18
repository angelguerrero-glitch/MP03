/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicisclasse.nf3;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Angel J. Guerrero
 */
public class Pt4 {

    public static void main(String[] args) {
        //Variables
        Scanner ent = new Scanner(System.in);
        Random r = new Random();
        int num = 4;
        String text = ""; 
        String lletres="RGYNWOBM";
        int car=lletres.length();
        char[] colors = {'R', 'G', 'Y', 'N', 'W', 'O', 'B', 'M'};
        char[][] tauler = new char[4][10];
        
        //Creem la combinacio secreta
         for (int i = 0; i < 4; i++) {
            System.out.print(lletres.charAt(r.nextInt(car))+ " ");
        }
        for (int i = 0; i < tauler.length; i++) {
            for (int j = 0; j < tauler[i].length; j++) {
                System.out.println(tauler[i][j]);  
            }
        }
        System.out.println("Combinació secreta calculada... Tens 10 intents per endevinar-la.");
        //Demanem al l'usuari una cadena 
        do {
            System.out.println("Introduix una línia de mínim 4 caràcters (RGYNWOBM)");
            text = ent.skip("[\r\n]*").nextLine().toUpperCase();
            if (num != text.length()) {
                System.out.println("Ha de ser de mínim 4 caràcters");
            } else {
                break;
            }
        } while (true);
        
        //Comprovar si han introduit les colors
         for (int i = 0; i < colors.length; i++) {
            if (text.charAt(0) == colors[i]) {
                System.out.println(text);
            } else {
                System.out.println("Hi ha caràcters de color incorrectes entre els 4 primers:");
            }
        }
        //Comprovar si els caracters introduits pel l'usuari es troben dins de la matriu 
    }
}