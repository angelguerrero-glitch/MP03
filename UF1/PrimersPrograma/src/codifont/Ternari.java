/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codifont;

/**
 *
 * @author Roronoa Zoro
 */
public class Ternari {
    public static void main(String[] args) {
        
        //Declaraico de varibles
        int num=89;
        boolean parell;
        //Exemple en if_else
        if (num % 2 == 0) {
            System.out.println("Ës parell");
        } else {
            System.out.println("Ès imparell");
        }
        //EL mateix utilizant l'operador condicional tenari
        System.out.println( num%2==0 ? "És parell" : "És imaparell");
        
        //Mirem si el número es o no parell
        if (num%2==0) {
            parell=true;
        } else {
            parell=false;
        }
        //EL mateix utilizant l'operador condicional tenari
        parell=num%2==0 ? true : false ;
        
        parell=num%2==0;
    }
}
