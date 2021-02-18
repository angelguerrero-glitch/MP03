/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicisclasse.nf2;

import java.util.Scanner;

/**
 *
 * @author Roronoa Zoro
 */
public class Exercici14 {
    public static void main(String[] args) {
        
    Scanner ent = new Scanner(System.in);
    String resultat=" ";
    int num;
    
        System.out.println("Introduix un numero enter (>0):");
        do{
            num=ent.nextInt();
            if(num<1) System.out.println("Ha de ser mes gran que 0!!");
            else break;
        }while(true);
        
        //Demanem a l'usuari que escrigue linies fins trobaar un que conte un punt
        System.out.println("Introduix un text (que coningue el '.' per acabar):");
        do{
            String linia=ent.skip("[\r\n]*").nextLine().trim();
         /* if(num>linia.length())resultat+=linia.substring(0,linia.length())+" ";
            else resultat+=linia.substring(0,num)+" ";
         */  
            resultat+=linia.substring(0,(num>linia.length()? linia.length():num))+" "; 
            if(linia.contains(".")) break;
        }while (true);
        System.out.println("\nEl text resultat es ");
        System.out.println(resultat);
    }   
}
