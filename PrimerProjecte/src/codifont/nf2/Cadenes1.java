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
public class Cadenes1 {
    public static void main(String[] args) {
        //Declaracio de variables
        String nom="Bon dia";
        //Podem consultar la longitud d'una cadena --> length()
        //System.out.println(nom.length());
        
        int logitud="Hola".length();
        nom="Un altra cadena";
        
        //Podem accedir a una posició de la cadena i vore quin caracter conté
//        System.out.println("12345".charAt(0));
//        System.out.println("12345".charAt(1));
//        System.out.println("12345".charAt(2));
//        System.out.println("12345".charAt(3));
//        System.out.println("12345".charAt(4));
        //System.out.println("12345".charAt(5));
        //System.out.println("12345".charAt(-1));
        
        int i=0;
        //anem a recoorer una cadema usant un for,d'esquerra a dreta  
        for (; i < "12345".length(); i++) {
            System.out.println("12345".charAt(i));
        }
        //Obtenir la cdena de dretra a esquerra saltant de 2 en 2
        String saltar="";
        
        i ="12345".length()-1;
        //Anem a recorrer una cadena usant un for, dreta a esquerra.
        for (; i >=0; i++) {
            System.out.println("12345".charAt(i));
        }
    
    
    }
}
