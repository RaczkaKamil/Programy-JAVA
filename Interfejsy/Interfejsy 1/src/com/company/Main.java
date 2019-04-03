package com.company;

import java.util.Scanner;


/**
 * Niniejszy program demonstruje spos�b u�ycia interfejsu Comparable.
 *
 * @author Cay Horstmann
 * @version 1.30 2004-02-27
 */
public class Main implements InterfaceTest, Positionable {


    private double x = 0;
    private double y = 0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Poruszaj sie w gore - 1     poruszaj sie w bok - 2");

    }

    @Override
    public void move(double x, double y) {
        this.x += x;
        this.y += y;
    }

    @Override
    public void getPosition() {
        System.out.println("x:" + this.x + "y:" + this.y);

    }
}
