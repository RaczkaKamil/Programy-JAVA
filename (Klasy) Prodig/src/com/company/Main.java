package com.company;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException  {

        ListaMiernikow l=new ListaMiernikow();
        Scanner in = new Scanner(System.in);
        BufferedReader rb = new BufferedReader(new InputStreamReader(System.in));
        boolean koniec = false;
        do {

            System.out.println("Podaj nazwe miernika:");
            String nazwa_miernika = rb.readLine();


            Miernik m1 = new Miernik(nazwa_miernika);
            l.dodawanie(m1);

            System.out.println("Jesli chcesz zakonczyc nacisnij '1', jesli chcesz dodac kolejny miernik nacisnij '2' jesli chcesz zobaczyc lsite dodanych miernikow nacisnij '3'");
            int a = in.nextInt();

            if (a==1){koniec=true;}
            if (a==2){koniec=false;}
            if (a==3){
            l.pokazListe();
            }
        }while (!koniec==true);

    }
}
