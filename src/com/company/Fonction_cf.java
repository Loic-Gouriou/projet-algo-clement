package com.company;

public class Fonction_cf {
    public static void fin(String[][] tab, int joueurRX, int joueurRY, int joueurBX, int joueurBY, String joueurB, String joueurR) {

        int a;
        String vainqueur;


        // vérification si le joueur R peut bouger
        if (!(tab[joueurRX - 1][joueurRY].equals(" *")) && !(tab[joueurRX + 1][joueurRY].equals(" *")) && !(tab[joueurRX][joueurRY - 1].equals(" *")) && !(tab[joueurRX][joueurRY + 1].equals(" *"))){
            for (a = 0; a < 11; a++) { // Affichage du plateau de jeu
                System.out.println(tab[a][0] + " " + tab[a][1] + " " + tab[a][2] + " " + tab[a][3] + " " + tab[a][4] + " " + tab[a][5] + " " + tab[a][6] + " " + tab[a][7] + " " + tab[a][8] + " " + tab[a][9] + " " + tab[a][10] + " " + tab[a][11]);
            }
            vainqueur = joueurR;
            System.out.println();
            System.out.println(joueurB +" vous avez perdu. Bravo " + vainqueur + " vous avez gagné");
            Fonction_rejouer.rejouer();
        }

        //verification si le joueur B peut bouger
        else if (!(tab[joueurBX - 1][joueurBY].equals(" *")) && !(tab[joueurBX + 1][joueurBY].equals(" *")) && !(tab[joueurBX][joueurBY - 1].equals(" *")) && !(tab[joueurBX][joueurBY + 1].equals(" *"))){
            for (a = 0; a < 11; a++) { // Affichage du plateau de jeu
                System.out.println(tab[a][0] + " " + tab[a][1] + " " + tab[a][2] + " " + tab[a][3] + " " + tab[a][4] + " " + tab[a][5] + " " + tab[a][6] + " " + tab[a][7] + " " + tab[a][8] + " " + tab[a][9] + " " + tab[a][10] + " " + tab[a][11]);
            }
            vainqueur = joueurB;
            System.out.println();
            System.out.println(joueurR+ " vous avez perdu. Bravo " + vainqueur + " vous avez gagné");
            Fonction_rejouer.rejouer();
        }


    }
}
