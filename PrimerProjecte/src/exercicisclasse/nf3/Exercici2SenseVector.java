/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicisclasse.nf3;

import java.util.Scanner;

/**
 * Fes un programa en Java que demane a l'usuari la introducció de 3 valors
 * enters corresponents al dia, mes i any d'una data, i digue si és o no
 * correcta, tenint en compte el següent: • són vàlids tots els anys, tant
 * negatius com positius, • s'ha de tenir en compte si l'any és bixest o no, 
 * • mesos de 31 dies: 1, 3, 5, 7, 8, 10 i 12. 
 * • mesos de 30 dies: 4, 6, 9 i 11. 
 * • mesos de 28 o 29 dies: 2  
 * @author profe
 */
public class Exercici2SenseVector {
    
    public static void main(String[] args) {
        //Declaració de variables
        Scanner ent = new Scanner(System.in);
        int dia, mes, any;
        boolean bixest;
        
        //Demanar dia
        do {         
            System.out.println("Introduix un dia del mes (1-31):");
            dia=ent.nextInt();
            if(dia<1 || dia>31) System.out.println("Ha de ser un número enter entre 1 i 31!!");
            else break;
        } while (true);
        
        //Demanar mes
        do {         
            System.out.println("Introduix un mes de l'any (1-12):");
            mes=ent.nextInt();
            if(mes<1 || mes>12) System.out.println("Ha de ser un número enter entre 1 i 12!!");
            else break;
        } while (true);
        
        //Demanar any i mirem si és bixest
        System.out.println("Introduix un any:");
        any=ent.nextInt();
        bixest=((any % 400 == 0 || any % 4 == 0 && any % 100 != 0) && any>1582);
        
        //Mirem si la data és correcta --> dia està entre 1 i 31
        if(dia<29) System.out.println("CORRECTA");
        else{   //Aquí dia val 29, 30 o 31
            if(dia==29 && ( mes!=2 || bixest  )  ) System.out.println("CORRECTA");
            else{
                if(dia==30 && mes!=2) System.out.println("CORRECTA");
                else{   //Segur que dia == 31
                    if(mes!=2 && mes!=4 && mes!=6 && mes !=9 && mes !=11) System.out.println("CORRECTA");
                    else System.out.println("INCORRECTA");
                }
            }
        }
    }

}
