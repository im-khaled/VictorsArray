package com.company;

public class VictorsArray {
    public static void main(String[]args) {
        String[] VictorsLieblingsObst = {"Birne", "Apfel", "Kiwi"};

        System.out.println(VictorsLieblingsObst[1]);

        int[] VictorsLieblingsZahlen = new int[7];
        VictorsLieblingsZahlen[0] = 7;

        for(int i = 1; i < VictorsLieblingsZahlen.length; i++){
            VictorsLieblingsZahlen[i] = i + 3;
        }

        System.out.printf("%nVictors Lieblingszahlen: ");
        for (int each: VictorsLieblingsZahlen)
            System.out.print(each + " ");

        int[] KohlsLieblingsZahlen = {2 , 5, 58, 4, 3, 444, 25};
        VictorsLieblingsZahlen = KohlsLieblingsZahlen;

        VictorsLieblingsZahlen[1] = 100;

        System.out.printf("%nKohls Lieblingszahlen: ");
        for(int each: KohlsLieblingsZahlen)
            System.out.print(each + " ");
    }
}
/**
 ->Diese Java-App enthält eine Klasse (VictorsArray) & ein Methoad (main)
 ->Es gibt ein String-Array (VictorsLieblingsObst) , das mit den 3 Obst initialisiert wurde.
 Und das Lieblingsobst wird auf dem Bildschrim ausgegeben.
 ->Ein Integer-Array (VictorsLieblingsZahlen)wurde genommen. Erste Feld wird mit Lieblingszahl und dann gazen Array
 mit for-Schleife eingefüllt .
 -> Das Array wird auf dem Bildschirm Ausgegeben.
 -> Noch ein Array (KohlsLieblingsZahlen) wurde genommen und initialisiert.
 Den Zwei Interger-Array wird gleich gesetz.
 ->Zweite Feld des Arrays (VictorsLieblingsZahlen) wird  mit der zahl 100 eingefüllt.
 ->Am Ende wird das Array (KohlsLieblingsZahlen) auf dem Bildschirm ausgegeben.
 */