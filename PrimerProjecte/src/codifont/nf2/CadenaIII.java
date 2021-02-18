/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codifont.nf2;

import java.util.Scanner;

/**
 *
 * @author Roronoa Zoro
 */
public class CadenaIII {
    public static void main(String[] args) {
        
        String s1= new String("Hola");
        String s2= new String("Hola");
        String s3= new String("HolA");
        
        //Mostrem si son o no igual
        if(s1==s2) System.out.println("Son iguals.");
        else System.out.println("Son diferents.");
        
        if(s1.equals(s2))System.out.println("Son iguals.");
        else System.out.println("Son diferents.");
        
        if(s1.equals(s3))System.out.println("Son iguals.");
        else System.out.println("Son diferents.");

        if(s1.equalsIgnoreCase(s3))System.out.println("Son iguals.");
        else System.out.println("Son diferents.");
        
        System.out.println(s1.toUpperCase());
    }
}
