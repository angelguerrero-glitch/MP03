/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicisclasse;

import java.util.Scanner;

/**
 *
 * @author Roronoa Zoro
 */
public interface Exercici19 {
    public static void main(String[] args) {
    //Scanner per demnara per pantalla
        Scanner ent=new Scanner(System.in);
        int any,a ,b ,c,d,e,n;
        any=ent.nextInt();
       
       //formules de l'enunciat 
       a=any % 19;
       b=any % 4;
       c=any % 7;
       d=(19*a+24) %30;
       e=(2*b +4*c + 6*d+5) % 7;
       n=(22+ d+ e);
       
       //Mirem com és la n per dir si cau en març o abril
        if (n<=31) {
            System.out.println("El diumenge de Pasqua sera el "+n+" de març.");
        }else{
            System.out.println("El diumenge de pasqua sera el "+(n-31)+ " d'abril.");
        }
       
    
    }
}
