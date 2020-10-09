package com.company;

import java.util.Scanner;

public class Fonction {



    public static void regles() {

        Scanner scanner = new Scanner(System.in);
        String retourMenuPrincipal;


        //Affichage des règles
        System.out.println("Les règles sont simples : ");
        System.out.println("");
        System.out.println("Pendant son tour un joueur peut déplacer son pion (verticalement ou horizontalement), puis il détruit une case du plateau.");
        System.out.println("");
        System.out.println("Le dernier joueur pouvant encore se déplacer gagne !");
        System.out.println("");
        System.out.println("Mais tout ca serait trop simple hahah ! Voici quelques contraintes : ");
        System.out.println("- Un joueur ne peut pas détruire une case occupées ni déjà détruite. Dans le cas échéant son tour est passé.");
        System.out.println("- Un joueur ne peut pas occcuper une case détruite ou déja occupée. Si il essaye de se déplacer sur celles-ci sont our est passé.");
        System.out.println("- Un joueur bloqué pendant un tour est déclaré perdant ");
        System.out.println("");
        System.out.println("Pour détruire une case il faut inscrire ces coordonnées, d'abord le numéro sur l'axe verticale puis ensuite sur l'axe horizontale");
        System.out.println();
        System.out.println("Vous pouvez maintenant jouer !");

        System.out.println("Pour aller au menu principal tapez R");
        retourMenuPrincipal = scanner.next();

        //condition pour retourner au menu principal
        if(retourMenuPrincipal.equals("R") || retourMenuPrincipal.equals("r")) {
            Fonction_Menu.menu();

        }

    }
}
