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
public class CadenaII {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        
        String s1="";
        String s2=new String("ABCDE");
        for (int i = 0; i < s2.length(); i++) {
            if(i%2==0){
                //s1=s1+s2.charAt(i); pero al reves pots posar s1+s2.charAt(i)  per que comenci de esquerra a dreta 
                s1=s2.charAt(i)+s1;
            
            }
            //System.out.println(s2.charAt(i));
            
        }
        System.out.println(s1);
    }
}
