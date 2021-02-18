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
public class Pt41 {

    public static void main(String[] args) {
        //Variables
        Scanner ent = new Scanner(System.in);
        Random r = new Random();
        int num = 4;
        String text = ""; 
        String lletres="RGYNWOBM";
        int size=lletres.length();
        //char[] csecret= r.n;
        char[] colors = {'R', 'G', 'Y', 'N', 'W', 'O', 'B', 'M'};
        char[][] tauler = new char[4][10];

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
        
        System.out.println("Caràcters aleatoris:\n");
        for (int i = 0; i < n; i++) {
            
            //Generem un caracter entre la 'A' i la 'Z'aletòriament
            char c=(char)(r.nextInt('R'-'G'-'N'-'W'-'O'-'B'-'M'));
            System.out.print(c);
            
            //Concatenem el caràcter a la cadena de lletres
            lletres=lletres+c;
            
            //Compto que ha sortit la lletra c
            cont[c-'A']=cont[c-'A']+1;
        }
           
        
//        for (int i = 0; i < colors.length; i++) {
//            if (text.charAt(0) == colors[i]) {
//                System.out.println(text);
//            } else {
//                System.out.println("Hi ha caràcters de color incorrectes entre els 4 primers:");
//            }
//        }
    }
}

// Tinc que buscar la forma de que el text introduit comprovi que hagui el colors que estans dins del String
