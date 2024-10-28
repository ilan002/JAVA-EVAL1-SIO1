package com.sio;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final String GREEN = "\u001B[32m";
    private static final String RESET = "\u001B[0m";

    public static void main(String[] args) {
        System.out.println(GREEN);
        System.out.println("#############################################");
        System.out.println("            JAVA EVAL 1 SIO 1 ALT            ");
        System.out.println("#############################################");

        while(true){
            System.out.println("#############################################");
            System.out.println("1. Exercice 1");
            System.out.println("2. Exercice 2");
            System.out.println("3. Exercice 3");
            System.out.println("4. Exercice 4");
            System.out.println("0. Quitter le programme");
            System.out.println("#############################################");
            System.out.print("Entrer votre choix: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    System.out.println("---------------------------------------------");
                    System.out.println("Exercice 1");
                    System.out.println("---------------------------------------------");
                    //Exercice 1 : Entrer votre code ici
                     {
                        {
                            Scanner sc = new Scanner(System.in);
                            System.out.println("Entrer votre choix: ");
                            int choix = sc.nextInt();
                            System.out.println("Entrez un nombre: ");
                            int nombre = sc.nextInt();

                            int puissance;
                            do {
                                System.out.println("Entrez la puissance (doit être supérieure ou égale à 0): ");
                                puissance = sc.nextInt();
                                if (puissance < 0) {
                                    System.out.println("La puissance doit être supérieure ou égale à 0.");
                                }
                            } while (puissance < 0);

                            double resultat = Math.pow(nombre, puissance);
                            System.out.println("Le résultat de " + nombre + " puissance " + puissance + " est: " + resultat);

                        }
                    }




                    System.out.println("---------------------------------------------");
                    break;
                case 2:
                    System.out.println("---------------------------------------------");
                    System.out.println("Exercice 2");
                    System.out.println("---------------------------------------------");
                    //Exercice 2 : Entrer votre code ici
                    System.out.println("Entrer le nombre de kilomètres parcourus par le client : ");
                    int km = scanner.nextInt();
                    while (km <= 0) {
                        System.out.println("Le nombre de kilomètres doit être supérieur ou égal à 0");
                        System.out.println("Entrer le nombre de kilomètres parcourus par le client : ");
                        km = scanner.nextInt();
                    }
                    if (km <= 100) {
                        System.out.println("Le montant à payer par le client est : " + km * 0.2 + "€");
                    }
                    else if (km > 100 && km < 500) {
                        System.out.println("Le montant à payer par le client est : " + km * 0.5 + "€");
                    }
                    else if (km > 500) {
                        System.out.println("Le montant à payer par le client est : " + km * 0.8 + "€");
                    }






                    System.out.println("---------------------------------------------");
                    break;
                case 3:
                    System.out.println("---------------------------------------------");
                    System.out.println("Exercice 3");
                    System.out.println("---------------------------------------------");
                    //Exercice 3 : Entrer votre code ici
                    System.out.println("Entrer la largeur du rectangle : ");
                    double largeur = scanner.nextDouble();
                    while (largeur <= 0) {
                        System.out.println("La largeur doit être superieur à 0");
                        System.out.println("Entrer la largeur du rectangle : ");
                        largeur = scanner.nextDouble();
                    }
                    System.out.println("Entrer la hauteur du rectangle : ");
                    double hauteur = scanner.nextDouble();
                    while (hauteur <= 0) {
                        System.out.println("La hauteur doit être superieur à 0");
                        System.out.println("Entrer la hauteur du rectangle : ");
                        hauteur = scanner.nextDouble();
                    }
                    for (int a = 0; a < hauteur; a++) {
                        for (int b = 0; b < largeur; b++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }




                    System.out.println("---------------------------------------------");

                    break;
                case 4:
                    System.out.println("---------------------------------------------");
                    System.out.println("Exercice 4");
                    System.out.println("---------------------------------------------");
                    //Exercice 4 : Entrer votre code ici
                    System.out.println("Entrer un nombre : ");
                    int nb = scanner.nextInt();
                    while (nb <= 0) {
                        System.out.println("Le nombre doit être superieur à 0");
                        System.out.println("Entrer un nombre : ");
                        nb = scanner.nextInt();
                    }
                    long factorial=1;
                    for (int a = nb; a > 0; a--) {
                        factorial *= a;
                    }
                    System.out.println("Le factoriel de " + nb + " est : " +  factorial);






                    System.out.println("---------------------------------------------");
                    break;
                case 0:
                    System.out.println(RESET);
                    System.exit(0);
                    break;
            }
        }
    }
}