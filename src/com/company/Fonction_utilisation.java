package com.company;

import java.util.Scanner;

public class Fonction_utilisation {
    public static void utilisation() {

        Scanner scanner = new Scanner(System.in);
        String retourMenuPrincipal;

        //Affichage des conditions d'utilisation
        System.out.println("Les conditions d'utilisation sont simples : ");
        System.out.println("");
        System.out.println("si Clément tu tapes une lettre à la place des coordonnées tu seras considéré comme un tricheur et  ban definitivement du jeu ");
        System.out.println("si Clément tu tapes un chiffre qui n'est pas compris entre 1 et 10 pour les x et 1 et 11 pour les y tu seras considéré comme un tricheur et  ban definitivement du jeu");
        System.out.println("si Clément tu casses notre jeu bah c'est pas cool et tu pourras plus jouer");
        System.out.println("Cordialement la direction");

        //retour menu principal
        System.out.println("Pour aller au menu principal tape R");
        retourMenuPrincipal = scanner.next();

        //condition pour retourner au menu principal
        if (retourMenuPrincipal.equals("R") || retourMenuPrincipal.equals("r")) {
            Fonction_Menu.menu();


        }
    }
}
