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
public class Menu1 {

    public static void main(String[] args) {
        //Delcarió de varibles
        Scanner ent = new Scanner(System.in);
        int opcio;
        boolean permaneixer=true;
        do {
            System.out.println("Menu del programa");
            System.out.println("1. Mostrar hola");
            System.out.println("2. Mostarr hi");
            System.out.println("3. Sortir del programa");
            System.out.println("Tria una opció;");

            opcio = ent.nextInt();

            switch (opcio) {
                case 1:
                    System.out.println("Hola");
                    break;
                case 2:
                    System.out.println("Hi");
                    break;
                case 3:
                    System.out.println("Adeu");
                    permaneixer=false;
                    break;
                default:
                    System.out.println("Incorrect Option!!");
            }
        } while (permaneixer);
    }

}
