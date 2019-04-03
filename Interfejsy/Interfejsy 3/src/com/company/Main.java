package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Czesc!");
        Organizm czlowiek = new Czlowiek();
        Organizm kot = new Kot();
        Organizm pies = new Pies();
        Lista lista = new Lista();
        int opcja;
        String imie;
do {
    System.out.println(" Kogo chcesz przedstawic? 1 - Człowiek, 2- Kot, 3 - Pies ||| 4 - zakonczc i podaj liste");
    opcja = in.nextInt();
    if (opcja == 1) {
        Czlowiek czlek = new Czlowiek();
        System.out.println("Podaj imie Czlowieka");
        imie = in.next();
        czlek.setImie(imie);
        lista.dodaj("Czlowiek: "+ imie);
    }
    if (opcja == 2)
    {
        Kot kotek = new Kot();
        System.out.println("Podaj imie kota");
        imie=in.next();
        kotek.setImie(imie);
        lista.dodaj("Kot: "+imie);
    }
    if(opcja ==3)
    {
        Pies piesek = new Pies();
        System.out.println("Podaj imie psa");
        imie = in.next();
        piesek.setImie(imie);
        lista.dodaj("Pies: "+ imie);
    }

}while ( opcja !=4);
        lista.wyswietl();

    }
}
