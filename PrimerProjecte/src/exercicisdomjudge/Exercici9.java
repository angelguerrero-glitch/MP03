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
public class Exercici9 {
public static void main(String[] args) {
        //Declaració de variables
        Scanner ent = new Scanner(System.in);
        int num1,num2,suma=0, producte=1,comptador=0; 
        
        do{
          //System.out.println("Introduix un parell de numeros enters(iguals o algun ha 0 per finalizatr)");
            num1=ent.nextInt();
            num2=ent.nextInt();
            suma=suma+num1+num2;   
            comptador+=3;          
            if (num1==0 && num2==0 && comptador!=2){
                producte*=num1+num2;
            }else{ 
                System.out.println("INDETRMINAT");
            }
        }while(num1!=num2 && num1!=0 && num2!=0);
        System.out.println(suma);
        System.out.println(producte);
        System.out.println( + (((double)suma/comptador)));
    }
}
