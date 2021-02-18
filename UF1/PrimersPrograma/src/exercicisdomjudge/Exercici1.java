/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicisdomjudge;

import java.util.Scanner;

/**
 *
 * @author Roronoa Zoro
 */
public class Exercici1 {
    public static void main(String[] args) {
        //varibles
        // "/n" per fer un salt de linea 
        int num1;
        int num2;
        Scanner ent=new Scanner(System.in);
        num1=ent.nextInt();
        num2=ent.nextInt();
        if (num1>num2) {
            System.out.println(num1);
            System.out.println(num2);
        }else{
            System.out.println(num2);
            System.out.println(num1);
        }
    }
}
