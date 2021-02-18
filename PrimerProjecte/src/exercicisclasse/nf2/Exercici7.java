/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicisclasse.nf2;

import java.util.Scanner;

/**
 *
 * @author profe
 */
public class Exercici7 {
    
    public static void main(String[] args) {
        //Declaració de variables
        Scanner ent = new Scanner(System.in);
        String text="",linia="", resultat="";
        
        //Demanem a l'usuari que escrigue un text acabat en punt
        System.out.println("Introduix un linies de text (acabat en punt per finalitzar'.'):");
        do {            
            linia=ent.skip("[\r\n]*").nextLine().trim();
            //Concatem la linia al text
            text+=linia;   
            //Mirem si es o no la ultima linia del text
            if(linia.endsWith(".")) break;
            else text+="\n"; //si no es la ultima afegeixo un salt de linia
        } while (true);
        //Tractarem el text canbiant majuscules per miniscueles i viceversa 
        for (int i = 0; i < text.length(); i++) {
            //Llegim el caracter actual del text 
            char c=text.charAt(i);
            if(Character.isUpperCase(c)) resultat+=Character.toLowerCase(c);
            else resultat+=Character.toUpperCase(c);
        }
        System.out.format("%nEl text transformat es: %n%n%s%n%n",resultat);
    }
}
