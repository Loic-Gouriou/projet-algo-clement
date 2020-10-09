package com.company;


import java.util.Scanner;

public class Fonction_Matrice {

    public static void matrice() {


        Scanner scanner = new Scanner(System.in);
        String pseudo1;
        String pseudo2;

        //Choix pseudo joueur 1
        System.out.println("Choix du pseudo du joueur R (puis taper sur entrer) :");
        pseudo1 = scanner.next();

        //Boucle pour que le pseudo soit compris entre 2 et 10 characteres
        while (pseudo1.length() > 10 || pseudo1.length() < 2) {
            System.out.println("Choix du pseudo du joueur R (puis taper sur entrer) :");
            pseudo1 = scanner.next();
        }

        //Choix pseudo joueur 2
        System.out.println("Choix du pseudo du joueur B (puis taper sur entrer) :");
        pseudo2 = scanner.next();

        //Boucle pour que le pseudo soit compris entre 2 et 10 characteres
        while (pseudo2.length() > 10 || pseudo2.length() < 2) {
            System.out.println("Choix du pseudo du joueur B (puis taper sur entrer) :");
            pseudo2 = scanner.next();
        }


        System.out.println("Le jeu : ");
        System.out.println();

        String tab[][] = new String[11][12]; // Initialisation du tableau

        int a = 0; // Initialisation des coordonnées du tableau
        int b = 0;

        int xDetruit; // Déclaration des coordonnées des cases détruites
        int yDetruit;

        int xPositionJoueurR = 5; // Initialisation des positions des joueurs au début de la partie
        int yPositionJoueurR = 6;
        int xPositionJoueurB = 6;
        int yPositionJoueurB = 6;

        String direction;

        int nbreDeTours = 0; // Initialisation du nombre de tours pour que les joueurs puissent jouer chacun leur tout
        Scanner tour = new Scanner(System.in);

        for (a = 0; a < 11; a++) {
            for (b = 0; b < 12; b++) {
                tab[a][b] = " *"; // Remplissage du tableau
            }
            b = 0;
        }
        a = 0;
        b = 0;

// Affichage des coordonnées de chaque case autour du plateau de jeu
        tab[0][0] = "  ";
        tab[0][1] = " 1";
        tab[0][2] = " 2";
        tab[0][3] = " 3";
        tab[0][4] = " 4";
        tab[0][5] = " 5";
        tab[0][6] = " 6";
        tab[0][7] = " 7";
        tab[0][8] = " 8";
        tab[0][9] = " 9";
        tab[0][10] = " 10";
        tab[0][11] = "11";
        tab[1][0] = "1 ";
        tab[2][0] = "2 ";
        tab[3][0] = "3 ";
        tab[4][0] = "4 ";
        tab[5][0] = "5 ";
        tab[6][0] = "6 ";
        tab[7][0] = "7 ";
        tab[8][0] = "8 ";
        tab[9][0] = "9 ";
        tab[10][0] = "10";

//Placement des joueurs
        tab[xPositionJoueurR][yPositionJoueurR] = " R";
        tab[xPositionJoueurB][yPositionJoueurB] = " B";


        //boucle pour vérifier si le joueur rouge peut se déplacer
        while (true) {

            for (a = 0; a < 11; a++) { // Affichage du plateau de jeu
                System.out.println(tab[a][0] + " " + tab[a][1] + " " + tab[a][2] + " " + tab[a][3] + " " + tab[a][4] + " " + tab[a][5] + " " + tab[a][6] + " " + tab[a][7] + " " + tab[a][8] + " " + tab[a][9] + " " + tab[a][10] + " " + tab[a][11]);
            }

            if (nbreDeTours % 2 == 0) { // Tour du joueur 1
                System.out.println();
                System.out.println( pseudo1 +" a ton tour. Choisis la direction vers laquelle tu veux te déplacer");
                direction = tour.next(); // Choix de la direction du déplacement
                while (!(direction.equals("z")) && !(direction.equals("s")) && !(direction.equals("d")) && !(direction.equals("q"))) {
                    System.out.println("??? Je n'ai pas compris. Rappelles toi qu'il faut appuyer sur z pour monter, sur s pour descendre, sur q pour aller a gauche et sur d pour aller a droite");
                    direction = tour.next(); // Si l'utilisateur ne tape pas le bon caractère + rappel des caractères a taper
                }
                if (direction.equals("z")) { // Déplacement en haut
                    if (!(tab[xPositionJoueurR - 1][yPositionJoueurR].equals(" *"))) {
                        System.out.println("La case vers laquelle tu veux aller est bloquée. Tu n'as pas pu bouger");
                    }
                    else {
                        xPositionJoueurR--;
                        tab[xPositionJoueurR][yPositionJoueurR] = " R";
                        tab[xPositionJoueurR + 1][yPositionJoueurR] = " *";

                    }
                }
                else if (direction.equals("s")) { // Déplacement en bas
                    if (!(tab[xPositionJoueurR + 1][yPositionJoueurR].equals(" *"))) {
                        System.out.println("La case vers laquelle tu veux aller est bloquée. Tu n'as pas pu bouger");
                    }
                    else {
                        xPositionJoueurR++;
                        tab[xPositionJoueurR][yPositionJoueurR] = " R";
                        tab[xPositionJoueurR - 1][yPositionJoueurR] = " *";
                    }
                }
                else if (direction.equals("q")) { // Déplacement à gauche
                    if (!(tab[xPositionJoueurR][yPositionJoueurR - 1].equals(" *"))) {
                        System.out.println("La case vers laquelle tu veux aller est bloquée. Tu n'as pas pu bouger");
                    }
                    else {
                        yPositionJoueurR--;
                        tab[xPositionJoueurR][yPositionJoueurR] = " R";
                        tab[xPositionJoueurR][yPositionJoueurR + 1] = " *";
                    }
                }
                else if (direction.equals("d")) { // Déplacement à droite
                    if (!(tab[xPositionJoueurR][yPositionJoueurR + 1].equals(" *"))) {
                        System.out.println("La case vers laquelle tu veux aller est bloquée. Tu n'as pas pu bouger");
                    }
                    else {
                        yPositionJoueurR++;
                        tab[xPositionJoueurR][yPositionJoueurR] = " R";
                        tab[xPositionJoueurR][yPositionJoueurR - 1] = " *";
                    }
                }


                //boucle pour vérifier si le joueur bleu peut se déplacer
                for (a = 0; a < 11; a++) { // Affichage du plateau de jeu
                    System.out.println(tab[a][0] + " " + tab[a][1] + " " + tab[a][2] + " " + tab[a][3] + " " + tab[a][4] + " " + tab[a][5] + " " + tab[a][6] + " " + tab[a][7] + " " + tab[a][8] + " " + tab[a][9] + " " + tab[a][10] + " " + tab[a][11]);
                }

                System.out.println("Choisis la case que tu veux détruire");
                System.out.println("Abscisse (axe verticale)");
                yDetruit = tour.nextInt(); // Choix de la case détruite
                System.out.println("Ordonnée (axe horizontale)");
                xDetruit = tour.nextInt();
                if(!(tab[yDetruit][xDetruit].equals(" *"))){
                    System.out.println("La case que tu veux détruire ne peut pas être détruite ou alors elle est déja détruite... tant pis pour toi");
                }
                else {
                    tab[yDetruit][xDetruit] = " X"; // Affichage de la case détruite
                }

            }
            else if (nbreDeTours % 2 == 1) { // Tour du joueur 2
                System.out.println();
                System.out.println(pseudo2 +" a ton tour. Choisis la direction vers laquelle tu veux te déplacer");
                direction = tour.next();
                while (!(direction.equals("z")) && !(direction.equals("s")) && !(direction.equals("d")) && !(direction.equals("q"))) {
                    System.out.println("??? Je n'ai pas compris. Rappelles toi qu'il faut appuyer sur z pour monter, sur s pour descendre, sur q pour aller à gauche et sur d pour aller à droite");
                    direction = tour.next(); // Si l'utilisateur ne tape pas le bon caractère + rappel des caractères à taper
                }
                if (direction.equals("z")) { //Déplacement en haut
                    if (!(tab[xPositionJoueurB - 1][yPositionJoueurB].equals(" *"))) {
                        System.out.println("La case vers laquelle tu veux aller est bloquée. Tu n'as pas pu bouger");

                    }
                    else {
                        xPositionJoueurB--;
                        tab[xPositionJoueurB][yPositionJoueurB] = " B";
                        tab[xPositionJoueurB + 1][yPositionJoueurB] = " *";
                    }
                }
                else if (direction.equals("s")) { // Déplacement en bas
                    if (!(tab[xPositionJoueurB + 1][yPositionJoueurB].equals(" *"))) {
                        System.out.println("La case vers laquelle tu veux aller est bloquée. Tu n'as pas pu bouger");
                    }
                    else {
                        xPositionJoueurB++;
                        tab[xPositionJoueurB][yPositionJoueurB] = " B";
                        tab[xPositionJoueurB - 1][yPositionJoueurB] = " *";
                    }
                }
                else if (direction.equals("q")) { // Déplacement à gauche
                    if (!(tab[xPositionJoueurB][yPositionJoueurB - 1].equals(" *"))) {
                        System.out.println("La case vers laquelle tu veux aller est bloquée. Tu n'as pas pu bouger");
                    }
                    else {
                        yPositionJoueurB--;
                        tab[xPositionJoueurB][yPositionJoueurB] = " B";
                        tab[xPositionJoueurB][yPositionJoueurB + 1] = " *";
                    }
                }
                else if (direction.equals("d")) { // Déplacement à droite
                    if (!(tab[xPositionJoueurB][yPositionJoueurB + 1].equals(" *"))) {
                        System.out.println("La case vers laquelle tu veux aller est bloquée. Tu n'as pas pu bouger");
                    }
                    else {
                        yPositionJoueurB++;
                        tab[xPositionJoueurB][yPositionJoueurB] = " B";
                        tab[xPositionJoueurB][yPositionJoueurB - 1] = " *";
                    }
                }
                for (a = 0; a < 11; a++) { // Affichage du plateau de jeu
                    System.out.println(tab[a][0] + " " + tab[a][1] + " " + tab[a][2] + " " + tab[a][3] + " " + tab[a][4] + " " + tab[a][5] + " " + tab[a][6] + " " + tab[a][7] + " " + tab[a][8] + " " + tab[a][9] + " " + tab[a][10] + " " + tab[a][11]);
                }

                // affichage pour les cases détruites
                System.out.println("Choissis la case que tub veux détruire");
                System.out.println("Abscisse (axe verticale)");
                yDetruit = tour.nextInt();
                System.out.println("Ordonnée (axe horizontale)");
                xDetruit = tour.nextInt();
                if(!(tab[yDetruit][xDetruit].equals(" *"))){
                    System.out.println("La case que tu veux détruire ne peut pas être détruite ou alors elle est déja détruite... tant pis pour toi");
                }
                else {
                    tab[yDetruit][xDetruit] = " X"; // Affichage de la case détruite
                }

            }
            nbreDeTours++; // Tour du prochain joueur

            //condition de fin
            Fonction_cf.fin(tab,xPositionJoueurR,yPositionJoueurR,xPositionJoueurB,yPositionJoueurB, pseudo1, pseudo2);

        }
    }
}




