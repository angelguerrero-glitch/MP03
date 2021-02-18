/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicisdomjudge;

import java.util.Scanner;

/**
 *
 * @author Roronoa Zoro
 */
public class Nf2ex1 {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int dni;
        dni = ent.nextInt();
        String lletra = "TRWAGMYFPDXBNJZSQVHLCKE";

        if (dni >= 0) {
            dni = dni % 23;
            System.out.println(lletra.charAt(dni));
        } else {
            System.out.print("INCORRECTE");
        }
    }
}
