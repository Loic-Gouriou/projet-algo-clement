package com.company;

import java.util.Scanner;

public class Fonction_rejouer {
    public static void rejouer(){

        // création scanner
        Scanner scanner = new Scanner(System.in);
        String choixRejouer;

        // affichage de la demande
        System.out.println();
        System.out.println("Voulez-vous Rejouez si oui tapez oui sinon tapez non");
        choixRejouer=scanner.next();

        //condition pour rejouer
        if (choixRejouer.equals("oui")){
            Fonction_Matrice.matrice();
        }

        //condition pour quitter le jeu
        else if (choixRejouer.equals("non")){
            Fonction_Menu.menu();
        }
    }
}
