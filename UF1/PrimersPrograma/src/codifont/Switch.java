/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codifont;

/**
 *
 * @author Roronoa Zoro
 */
public class Switch {
    public static void main(String[] args) {
        
        //Declaració de variables 
        int num=0;
        //Demanenm dades a l'usuari
        //Mostrem el número introduït en lletres 
//        if ( num==00) {
//            System.out.println("Has introduit el zero");
//        }else{
//            if (num==1) {
//                System.out.println("Has introduit l'u");
//            }else{
//                if (num==2) {
//                 System.out.println("Has introduit el doos"); 
//                }else{
//                    if (num==3) {
//                        System.out.println("Has introduit el tres");   
//                    }else{
//                        if (num==4) {
//                            System.out.println("Has introduit el quatre");   
//                        }else{
//                            if (num==5) {
//                                System.out.println("Has introduit el Cinc");   
//                            }else{
//                                System.out.println("NO has introduit cap numero de l'u al 5");
//                            }
//                            
//                        }
//                        
//                    }
//                }
//            }
            num=4;
            //anem a fer el mateix utilitzan la opcio Switch 
            switch (num) {
                case 1:                
                    System.out.println("Has introduit l'u");
                    break;
                case 2:                
                    System.out.println("Has introduit el dos");
                    break;
                case 3:                
                    System.out.println("Has introduit el tres");
                    break;
                case 4:                
                    System.out.println("Has introduit el quatre");
                    break;
                case 5:                
                    System.out.println("Has introduit el cinc");
                    break;
                default:
                    System.out.println("NO has introduit cap numero de l'u al 5");
                    throw new AssertionError();
            }
            
            //Ara mirem si els numeross son parells o imparells 
//            if (num==0 || num==2 || num==4) {
//                System.out.println("ES parell");  
//            }else{
//                if(num==1 || num==3 || num==5){
//                    System.out.println("Es imparell");
//                }
//            }
            //El mateix usant el switch 
            switch (num) {
            case 0:
            case 2:                
            case 4:                
                System.out.println("ES parell");      
                break;
            case 1:                
            case 3:                
            case 5:                
                System.out.println("ES imparell");                                  
        }
     }
        
  }


