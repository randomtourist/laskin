/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laskin;

import java.util.Scanner;

/**
 *
 * @author guest-dnrbe7
 */
public class Laskin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lukija = new Scanner(System.in);
        int pituus = 0;
        while (true) {
            System.out.println("Kuinka pitkiä listoja haluat käsitellä?");
            pituus = Integer.parseInt(lukija.nextLine());
            if (pituus > 0) {

                break;
            }

        }

        for (int i = pituus; i > 0; i--) {
            System.out.println(i);
        }
        int valinta = Integer.parseInt(lukija.nextLine());
       System.out.println("jatketaanko laskimen käyttöä");
       String vastaus = lukija.nextLine();
       if (vastaus.equals("joo")||vastaus.equals("kyllä"));
       {
           System.out.println("loistavaa!");
       }
    
    }

}
