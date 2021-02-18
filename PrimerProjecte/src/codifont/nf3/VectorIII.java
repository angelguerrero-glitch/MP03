/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codifont.nf3;

import java.util.Random;

/**
 *
 * @author Roronoa Zoro
 */
public class VectorIII {
    
    public static void main(String[] args) {
        Random r= new Random();
        
        //Generem qualsevol enter aleatoriament ->2^32 posibilitats
        System.out.println(r.nextInt());
        
        // generem numeros aleatoris entre 0 i l'anterieo al que passem com a 
        // parametre --> en este cas del 0 i 11
         for (int i = 0; i < 50; i++)  
             System.out.println(r.nextInt(12));
        
        //Anem a generar numero aleatoris entre el 25 i el 50 
        //el ninim es el 25, i el mazim es el 50 
        // r.nextInt(maxim - minim + 1 ) + minim
        System.out.println(r.nextInt(50-25+1)+25);
        
        //Anem a generar caracters aleatoris entre 'B' i 'j'
        //System.out.println((int)'j'); valor superior 106
        //System.out.println((int)'B');
        
        char c=(char)(r.nextInt('j'- 'B' +1)+ 'B');
        
        
    
    }
}
