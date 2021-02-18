
package codifont;

import java.util.Scanner;

public class PrimerPrograma {

  
    public static void main(String[] args) {
        //Declarió de variables
        Scanner ent=new Scanner(System.in);
       
        
        
        
        short diaMes=3;
        byte diaSemana=7;
        int mes=9;
        long any=2020L;
        float edatMitjana=25.7F;
        double notaMitjana=9;
        char inicial='A';
        boolean aprovat=true; //false
        boolean b=false;
        String cadena="Hello World!";
        int i; //declario de la varible i
        String c="45";
        
        // Primera instrucció JAVA
         System.out.println( mes );
         String nom ="Angel";
         String cognoms="Guerrero Gonzalez";
         byte edat=50;
         
         //System.out.println(cognoms+ ", "+ nom + ". Edat: " + edat + " anys." );
         /*System.out.println(cognoms+ ", "+ nom + "." );
         System.out.println("Edat: " + edat + " anys." );*/
         
         System.out.println(cognoms+ ", "+ nom + ". \n\nEdat: " + edat + " anys." );
         System.out.println( edat+ (mes + nom));
         System.out.println( "" +edat+ mes + nom);
         
         //anem a provar altres operadors numerics 
         i=0; //iniciem el valor de la variable i
         i+=45;     //i=i+45;
         
         System.out.println("Disme quants anys tens??");
         edat=ent.nextByte();
    }
    
}
