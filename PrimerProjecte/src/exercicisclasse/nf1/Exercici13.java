/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicisclasse.nf1;

import java.util.Scanner;

/**
 *
 * @author Roronoa Zoro
 */
public class Exercici13 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int num ,contDiversors=0;
        
        //Demanem un numero enter al l'usuari
        System.out.println("Introduix un numero enter qualsevol:");
        num=ent.nextInt();
        
        //si el nnumero es menor que 2 li dem que noes primer 
        if (num<2) System.out.println("NO");
        else{ //Tractem els numeros >=2
            for (int i = 0; i <num && contDiversors<=1; i++) {
                if(num%i==0) contDiversors++;
            }
            if(contDiversors==1)System.out.println("SI");
            else System.out.println("NO");
        }
    }
}
