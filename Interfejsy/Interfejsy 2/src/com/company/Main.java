package com.company;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Computation computation;

        if (main.shouldMultiply()) {
            computation = new Multiplication(); // zaimplementuj brakującą klasę
        }
        else {
            computation= new Addition(); // zaimplementuj brakującą klasę
        }

        double argument1 = main.getArgument();
        double argument2 = main.getArgument();

        double result = computation.compute(argument1, argument2);
        System.out.println("Wynik: " + result);
    }

    private boolean shouldMultiply() {
        boolean mld = true;
        Scanner in = new Scanner(System.in);
        System.out.println("Jestli chcesz wykonac mnozenie wpisz 1, jesli dodawanie wpisz 2");
        int a = in.nextInt();
        if ( a == 2) mld = false;
        return mld;
    }

    private double getArgument() {
        System.out.println( "Wpisz liczbe:");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        return a;
    }
}
