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
public class UF1NF1Ex16 {
    public static void main(String[] args) {
         //Scanner per demnara per pantalla
        Scanner ent=new Scanner(System.in);
        char ca;
        int num1,num2;
        ca=ent.nextLine().charAt(0);
        num1=ent.nextInt();
        num2=ent.nextInt();
        
        switch (ca) {
            case '+':
                System.out.println(num1+num2);
                break;
            case '-':
                System.out.println(num1-num2);
                break;
            case '*':
                System.out.println(num1*num2);
                break;
            case '/':
                if (num2==0) {
                    System.out.println("ERROR: DIVISIO PER ZERO");
                }else{
                    System.out.println(num1/num2);
                }
                break;
            case '%':
                if (num2==0) {
                    System.out.println("ERROR: DIVISIO PER ZERO");
                }else{
                    System.out.println(num1%num2);
                }
                break;   
            default:
                System.out.println("OPERACIO INCORRECTA");
        }
    }
}
