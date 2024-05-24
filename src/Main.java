import entities.Audio;
import entities.ElementoMultimediale;
import entities.Immagine;
import entities.Video;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        ElementoMultimediale[] elementiMulti = new ElementoMultimediale[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Inserisci il tipo di elemento (1: Immagine, 2: Audio, 3: Video):");
            
            int tipo = Integer.parseInt(scnr.nextLine());
            scnr.nextLine();

            System.out.println("Inserisci il titolo: ");
            System.out.println("-----------------------------");
            String titolo = scnr.nextLine();

            switch (tipo) {
                case 1:
                    System.out.println("Inserisci la luminosità da 1 a 10: ");
                    System.out.println("-----------------------------");
                    int luminositaIm = Integer.parseInt(scnr.nextLine());
                    elementiMulti[i] = new Immagine(titolo, luminositaIm);
                    break;

                case 2:
                    System.out.println("Inserisci la durata: ");
                    System.out.println("-----------------------------");
                    int durataA = Integer.parseInt(scnr.nextLine());
                    System.out.println("Inserisci il volume da 1 a 10: ");
                    System.out.println("-----------------------------");
                    int volumeA = Integer.parseInt(scnr.nextLine());
                    elementiMulti[i] = new Audio(titolo, durataA, volumeA);
                    break;

                case 3:
                    System.out.println("Inserisci la durata: ");
                    System.out.println("-----------------------------");
                    int durataV = Integer.parseInt(scnr.nextLine());
                    System.out.println("Inserisci il volume da 1 a 10: ");
                    System.out.println("-----------------------------");
                    int volumeV = Integer.parseInt(scnr.nextLine());
                    System.out.println("Inserisci la luminosità da 1 a 10: ");
                    System.out.println("-----------------------------");
                    int luminositaV = Integer.parseInt(scnr.nextLine());
                    elementiMulti[i] = new Video(titolo, durataV, volumeV, luminositaV);
                    break;

                default:
                    System.out.println("Tipo non valido ");
                    i--;
                    break;
            }
        }

        int scelta;
        do {
            System.out.println("Scegli un elemento da 1 a 5, o 0 per terminare: ");
            System.out.println("-----------------------------");
            scelta = Integer.parseInt(scnr.nextLine());

            if (scelta > 0 && scelta <= 5) {
                elementiMulti[scelta - 1].stampa();
            } else if (scelta != 0) {
                System.out.println("Scelta non valida");
            }
        } while (scelta != 0);

        scnr.close();
    }
}