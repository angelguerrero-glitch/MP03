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
public class Exercici3 {
    
    public static void main(String[] args) {
        //Declaració de variables
        Scanner ent = new Scanner(System.in);
        String text="",linia;
        int cont=0;
        
        //Demanem a l'usuari que escrigue un text acabat en punt
        System.out.println("Introduix un linies de text (acabat en punt per finalitzar'.'):");
        do {            
            linia=ent.skip("[\r\n]*").nextLine().trim();
            //Mirem si la linea no es buida per incrementar el comptador
            if (!linia.isEmpty()) cont++;
            //Concatem la linia al text
            text+=linia;   
            //Mirem si es o no la ultima linia del text
            if(linia.endsWith(".")) break;
            else text+="\n"; //si no es la ultima afegeixo un salt de linia
        } while (true);
        System.out.format("%n El text: %n%n\"%s\"%n%nté %d"+(cont==1?"linia":"linies")+".%n",text, cont);
    }
    
}
