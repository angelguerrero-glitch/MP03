/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicisclasse.nf1;

import java.util.Scanner;

/**
 *
 * @author Roronoa Zoro
 */
public class Exercici211 {

    public static void main(String[] args) {
        //Declacio de variables
        Scanner ent = new Scanner(System.in);
        int ini, fi;
        //Demanenm el valors als usuaris, forcant-lo a que siguen correctes (ini<=fi)
        do {
            System.out.println("Introduix els valors enters inicial i final: ");
            ini = ent.nextInt();
            fi = ent.nextInt();
            if (ini>fi) {
                 //Este codi se executara quan les dades son incorrectes
                System.out.println("Atencio, el valor inicial ha de ser menor igual que el final!!");
                //cotinue;
            }else{
                //Este codi se executara quan les dades son correctes 
                break;
            }
        } while (true);

        //Ho farem amb un for
        for (int i = ini; i <= fi; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " parell  ");
            } else {
                System.out.println(i + " imparell ");
            }

        }

    }
}
