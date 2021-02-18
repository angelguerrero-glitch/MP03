/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codifont.nf2;

/**
 *
 * @author Roronoa Zoro
 */
public class CadenesVI {
    public static void main(String[] args) {
        int indexIni=-5,indexFi;
        String s="abcdefghij";
/*        System.out.println("abcdefghij".substring(5)); //Extreure la cadena a partir de la cal caracter situat a la poscio 5
        
        System.out.println("abcdefghij".substring(-5)); //En negatiu no funciona
       
        
        indexIni=s.length();
        System.out.println("Index igual a longitud = "+s.substring(indexIni));
        indexIni=s.length()+1;
*/      indexFi=s.length();
        System.out.println(s.substring(4,9)); // Extreu la cadena del caracter situat a la posicio 4 fins al 8 (9-1
        System.out.println(s.substring(4,indexFi)); // Extreu la cadena del caracter situat a la posicio 4 fins fins al final    
   
        if(s.substring(4,indexFi).equals(s.substring(4))) System.out.println("Son iguals");
        if(s.substring(4).equals(s.substring(4,indexFi))) System.out.println("Son iguals");
        
        indexFi=s.length()+1;
        if (indexFi<=s.length()) System.out.println(s.substring(4,indexFi));
        else System.out.println("Index incorrecte");
        
        indexFi=s.length()+1;
        System.out.println(s.substring(4,4)); //Retorna la cade buida
        //System.out.println(s.substring(4,3)); //Rebem exepcio
        //else System.out.println("Index incorrecte");
        indexFi=4;
        indexFi=indexFi+1;
        if(indexIni<=indexFi) System.out.println(s.substring(indexFi,indexFi));
        else System.out.println("IndexoS incorrectes!!");

        
        
        // De una cadena agafa els n numeros caracters 
        // exemple de retornar els n ultims caracters d'una cadena  anomenada s
        
        int n=7;
        s="Vaiga a extreure els "+n+"ultims caracters de mi mateixa";
        System.out.println(s.substring(s.length()-n));
        
        // exemple de retornar els n ultims caracters d'una cadena  anomenada s PERO NOMES X CARACTERS CONSECUTIUS
        int x=4;
         System.out.println(s.substring(s.length()-n, s.length()-n+x));
        
    }
}
