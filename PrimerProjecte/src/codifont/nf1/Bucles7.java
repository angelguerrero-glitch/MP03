/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codifont.nf1;

/**
 *
 * @author Roronoa Zoro
 */
public class Bucles7 {

    public static void main(String[] args) {

        //for
        for (int i = 0, k = 45; i < 10 && k != 51; i++,k=k+2) {
            System.out.println(i);
        }

        //Faig un while equivalent al for de dalt , pero usant la variable j enlloc de la i
        {
            int j = 0;
            int k = 45;
            while (j < 10 && k != 51) {
                System.out.println(j);

                j++;
                k=k+2;
            }

        }

    }
}
