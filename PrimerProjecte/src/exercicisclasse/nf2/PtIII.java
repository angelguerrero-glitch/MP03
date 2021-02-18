/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicisclasse.nf2;

import java.util.Scanner;

/**
 *
 * @author Roronoa Zoro
 */
public class PtIII {

    public static void main(String[] args) {
        //Declarem les variables 
        Scanner ent = new Scanner(System.in);
        int num, car, num2, opcio, Fi;
        boolean tornar = false;
        String estrofa = "", estrofa2 = "",linia="";
        char a;
        //Demanem a l'usuari que ens introdusqui el numnero de rimes que vol 
        System.out.println("Benvingut al programa \"Tipos de rima\"!!");
        System.out.println("Per favor, indica quantes estrofes vols tractar (>=0):");
        do {
            num = ent.nextInt();
            if (num > 0) {
                System.out.format("Perfecte, has triat d'introduir %s estrofes.%n", num);
            } else if (num == 0) {
                System.out.println("Adeu");
                break;
            } else {
                System.out.println("Ha de ser major o igual que 0!!");
            }  break;
        } while (true);
        
        //Demanem el caracter que vol comprovar
        System.out.println("Estrofa nº1:");
        System.out.println("Per favor, indica a partir de quina lletra vols comprovar la rima (>=1):");

        do {
            car = ent.nextInt();
            if (car >= 1) {
                System.out.format("Perfecte, has triat d'introduir %n estrofes./%n", car);
                if (car == car) {
                    System.out.println("Per favor, introduix el tipo de rima a comprovar, d'entre els següents:");
                    System.out.println("1 (AAAA)");
                    System.out.println("2.(AABB)");
                    System.out.println("3.(AABB)");
                    System.out.println("4.(ABAB)");
                    System.out.println("Tipo de rima (1-4):");
                    num2 = ent.nextInt();
                    if (num2 >= 1 && num2 >= 4) {
                        System.out.println(num2);
                        switch (num2) {
                            case 1:
                                System.out.println("Perfecte, has triat la rima AAAA, anomenada continua!!");
                                System.out.println("Per favor, introduix els 4 versos de l'estrofa: ");
                                linia = ent.skip("[\r\n]*").nextLine().trim();
                                estrofa+=linia;
                                if(estrofa.endsWith(".")) break;
                                if(estrofa.substring(car).equals(estrofa.substring(car)))System.out.println("SI");
                                else System.out.println("No");
                                break;
                            case 2:
                                System.out.println("Perfecte, has triat la rima AABB, anomenada bessona!!");
                                System.out.println("Per favor, introduix els 4 versos de l'estrofa: ");
                                linia = ent.skip("[\r\n]*").nextLine().trim();
                                estrofa+=linia;
                                if(estrofa.endsWith(".")) break;
                                if(estrofa.substring(car).equals(estrofa.substring(car)))System.out.println("SI");
                                else System.out.println("NO");
                                break;
                            case 3:
                                System.out.println("Perfecte, has triat la rima AABB, anomenada abraçada!!");
                                System.out.println("Per favor, introduix els 4 versos de l'estrofa: ");
                                linia = ent.skip("[\r\n]*").nextLine().trim();
                                estrofa+=linia;
                                if(estrofa.endsWith(".")) break;
                                if(estrofa.substring(car).equals(estrofa.substring(car)))System.out.println("SI");
                                else System.out.println("NO");
                                break;
                            case 4:
                                System.out.println("Perfecte, has triat la rima AABB, anomenada creuada!!");
                                System.out.println("Per favor, introduix els 4 versos de l'estrofa: ");
                                linia = ent.skip("[\r\n]*").nextLine().trim();
                                estrofa+=linia;
                                if(estrofa.endsWith(".")) break;
                                if(estrofa.substring(car).equals(estrofa.substring(car)))System.out.println("SI");
                                else System.out.println("No");
                                break;
                            default:
                                System.out.println("Per favor tria una opcio!!");
                        }
                    }while (true);
                }
            }else {
                System.out.println("Ha de ser major que 0!!");
            }
        }while (false);
        
        do {
            car = ent.nextInt();
            if (car >= 1) {
                System.out.format("Perfecte, has triat d'introduir %n estrofes./%n", car);
                if (car == car) {
                    System.out.println("Per favor, introduix el tipo de rima a comprovar, d'entre els següents:");
                    System.out.println("1 (AAAA)");
                    System.out.println("2.(AABB)");
                    System.out.println("3.(AABB)");
                    System.out.println("4.(ABAB)");
                    System.out.println("Tipo de rima (1-4):");
                    num2 = ent.nextInt();
                    if (num2 >= 1 && num2 >= 4) {
                        System.out.println(num2);
                        switch (num2) {
                            case 1:
                                System.out.println("Perfecte, has triat la rima AAAA, anomenada continua!!");
                                System.out.println("Per favor, introduix els 4 versos de l'estrofa: ");
                                linia = ent.skip("[\r\n]*").nextLine().trim();
                                estrofa2+=linia;
                                if(estrofa2.endsWith(".")) break;
                                if(estrofa2.substring(car).equals(estrofa2.substring(car)))System.out.println("SI");
                                else System.out.println("No");
                                break;
                            case 2:
                                System.out.println("Perfecte, has triat la rima AABB, anomenada bessona!!");
                                System.out.println("Per favor, introduix els 4 versos de l'estrofa: ");
                                linia = ent.skip("[\r\n]*").nextLine().trim();
                                estrofa2+=linia;
                                if(estrofa2.endsWith(".")) break;
                                if(estrofa2.substring(car).equals(estrofa2.substring(car)))System.out.println("SI");
                                else System.out.println("NO");
                                break;
                            case 3:
                                System.out.println("Perfecte, has triat la rima AABB, anomenada abraçada!!");
                                System.out.println("Per favor, introduix els 4 versos de l'estrofa: ");
                                linia = ent.skip("[\r\n]*").nextLine().trim();
                                estrofa2+=linia;
                                if(estrofa2.endsWith(".")) break;
                                if(estrofa2.substring(car).equals(estrofa2.substring(car)))System.out.println("SI");
                                else System.out.println("NO");
                                break;
                            case 4:
                                System.out.println("Perfecte, has triat la rima AABB, anomenada creuada!!");
                                System.out.println("Per favor, introduix els 4 versos de l'estrofa: ");
                                linia = ent.skip("[\r\n]*").nextLine().trim();
                                estrofa2+=linia;
                                if(estrofa2.endsWith(".")) break;
                                if(estrofa2.substring(car).equals(estrofa2.substring(car)))System.out.println("SI");
                                else System.out.println("No");
                                break;
                            default:
                                System.out.println("Per favor tria una opcio!!");
                        }
                    }while (true);
                }
            }else {
                System.out.println("Ha de ser major que 0!!");
            }
        }while (true);
    }   
}
//        do {
//             if(estrofa.substring(car).equals(estrofa2.substring(car)));
//             System.out.format("Un total de %n estrofes han seguit la rima indicada, la qual cosa suposa un  50,0% del total d'estrofes introduïdes.");
//        } while (true);
//        
//    }   
//}





//        do{
//        System.out.println("Per favor, introduix el tipo de rima a comprovar, d'entre els següents:");
//       
//        System.out.println("1 (AAAA)");
//        System.out.println("2.(AABB)");
//        System.out.println("3.(AABB)");
//        System.out.println("4.(ABAB)");
//
//        opcio = ent.nextInt();
//
//        switch (opcio) {
//            case 1:
//                System.out.println("Perfecte, has triat la rima AAAA, anomenada continua!!");
//                System.out.println("Per favor, introduix els 4 versos de l'estrofa: ");
//                estrofa=ent.skip("[\r\n]*").nextLine().trim();
//                break;
//            case 2:
//                System.out.println("Perfecte, has triat la rima AABB, anomenada bessona!!");
//                System.out.println("Per favor, introduix els 4 versos de l'estrofa: ");
//                estrofa=ent.skip("[\r\n]*").nextLine().trim();
//                break;
//            case 3:
//                System.out.println("Perfecte, has triat la rima AABB, anomenada abraçada!!");
//                System.out.println("Per favor, introduix els 4 versos de l'estrofa: ");
//                estrofa=ent.skip("[\r\n]*").nextLine().trim();
//                break;
//            case 4:
//                System.out.println("Perfecte, has triat la rima AABB, anomenada creuada!!");
//                System.out.println("Per favor, introduix els 4 versos de l'estrofa: ");
//                estrofa=ent.skip("[\r\n]*").nextLine().trim();
//                break;
//            default:
//                System.out.println("Per favor tria una opcio!!");  
//        }
//      } while(false);
//    }
