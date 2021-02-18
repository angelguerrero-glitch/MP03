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
public class Exercici8 {
    
    public static void main(String[] args) {
        //Declaració de variables
        Scanner ent = new Scanner(System.in);
        String text="",linia="", resultat="";
        
        //Demanem a l'usuari que escrigue un text acabat en punt
        System.out.println("Introduix un linies de text (acabat en punt per finalitzar'.'):");
        do {            
            linia=ent.skip("[\r\n]*").nextLine().trim();
            //Tractem la linia actual --> donem-li la volta
            for (int i = 0; i < linia.length(); i++) {
                //conactenar el caracter per l'esquerra per a que suttigue al reves 
                resultat=linia.charAt(i)+ resultat;
            }
            //Concatenem la linia  
            text=text+linia;
            
            //Mirem si es o no la ultima linia del text
            if(linia.endsWith(".")) break;
            else{ 
                text+="\n"; //si no es la ultima afegeixo un salt de linia
                resultat="\n"+resultat; //si no es la ultima afegeixo un salt de linia
                
            }
         } while (true);
        System.out.format("%nEl text al reves es: %n%n%s%n%n",resultat);
    }
}
