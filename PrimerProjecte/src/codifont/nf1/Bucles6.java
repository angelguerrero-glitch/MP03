/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codifont.nf1;

import java.util.Scanner;

/**
 *
 * @author Roronoa Zoro
 */
public class Bucles6 {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int num = 1, cont5 = 0, cont15 = 0;

        //Demanen números de l'1 al 20
        //i al final direm quants eren <=5 i quants >=15
        while (num >= 1 && num <= 20) {
            System.out.println("Escriu numeros enters de l'1 al 20");
            num = ent.nextInt();
            if (num >= 1 && num <= 5) {
                cont5++;
                continue;
            }
            if (num >= 15 && num <= 20) {
                cont15++;
                continue;
            }
            System.out.println("No has posat un valor entre 1 i 5, ni 15 i 20");
        }
        System.out.println("Has introduit " + cont5 + " numeros entre 1 al 5");
        System.out.println("Has introduit " + cont15 + " numeros entre 15 al 20");
    }
}
