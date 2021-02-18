/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicisclasse;

import java.util.Scanner;

/**
 *
 * @author Roronoa Zoro
 */
public class Exercici16 {
    
    public static void main(String[] args) {
        //Scanner per demnara per pantalla
        Scanner ent=new Scanner(System.in);
       
        //variable per llegir caracters 
        char c;
       
        // Demenm a l'usuari que introduisque un caracter en miniscual
        System.out.println("Introduix un caracter en minuscula:");
        c=ent.nextLine().charAt(0);
        
        switch (c) {
            case 'a':
                System.out.println("Es vocal");
                break;
            case 'e':
                System.out.println("Es vocal");
                break;
            case 'i':
                System.out.println("Es vocal");
                break;
            case 'o':
                System.out.println("Es vocal");
                break;
            case 'u':
                System.out.println("Es vocal");
            default:
                System.out.println("No es una vocal");
        }
        
        //Switch de dalt pero mes reduit i mes rapid
        switch (c) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(c + " Es vocal");
                break;
            default:
                System.out.println(c+ " No es una vocal");
        }
    
    }
}
