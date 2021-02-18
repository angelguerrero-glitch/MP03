/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicisclasse.nf1;

import java.util.Scanner;

/**
 *9. Fes un programa en Java que demane a l'usuari la introducció de parelles de 
 * números enters fins que siguen iguals o un de ells sigui zero. Al final ha 
 * d'imprimir la suma i la mitjana dels números introduïts. Afegit: al final que 
 * mostre també el producte dels números diferents de zero.

 * @author profe
 */
public class Exercici9 {
    public static void main(String[] args) {
        //Declaració de variables
        Scanner ent = new Scanner(System.in);
        int num1,      // guardem el primner bnumero de la parella introduïda
            num2,      // guardem el segon numero de la parella introduida
            suma=0,      // guardem la suma acumulada dels valors introduits 
            producte=1,  // guardem el producte dels valors introduïts i diferents de zero
            comptador=0; // guardar la quantitat de numeros introduïts 
        
        //bucle que llig i tracta les parelles de numeros 
        do{
            System.out.println("Escriu un parell de numeros enters(iguals o algun ha 0 per finalizatr)");
            num1=ent.nextInt();
            num2=ent.nextInt();
            suma=suma+num1+num2;   //suma+=num1+num2;
            comptador+=2;          //comptador=comptaddor+2;
            //El producte el farem evitant els zeros
            if (num1!=0)producte*=num1;
            if (num2!=0)producte*=num2;
            
         //condicio per sortir del bucle : que sigui iguals o un de ells sigui zero
        //}while(num1!=num2 && num1!=0 && num2!=0);
        //condicio per permaneixer dins del bucle : !(que sigui iguals o un de ells sigui zero)
        }while(!(num1==num2 || num1==0 || num2==0));
        
        //Anem a mostrar el resultat 
        System.out.println("La suma es "+ suma);
        System.out.println("El producte es "+ producte);
        System.out.println("La mitjana es " + (((double)suma/comptador))); // manera de pssar a altre valor sigui enter decimal etc
        System.out.println("La mitjana es " + (suma*1.0/comptador));       // manera de pssar a altre valor sigui enter decimal etc
    }
    
}
