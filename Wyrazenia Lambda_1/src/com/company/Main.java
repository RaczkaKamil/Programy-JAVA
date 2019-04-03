package com.company;

public class Main {

    public static void main(String[] args) {
	int i = 2;
	int j = 5;


            potegowanie pot = new potegowanie() {
                @Override
                public int calculation(int a, int b) {
                    return a+b;
                }
            };


            System.out.println( pot.calculation(i,j));
           int calculation = (i,j)->{i+j};

    }


    @FunctionalInterface
    interface potegowanie {

        int calculation(int i, int j);
    }


}

