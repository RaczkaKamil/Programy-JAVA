package com.company;

public class Pies implements Organizm {
    boolean przedstaw = false;
    String imie;
    @Override
    public String name() {
        return imie;
    }

    @Override
    public void jedz() {
        System.out.println("Piesek je");
    }

    @Override
    public void spij() {
        System.out.println("Piesek śpi");

    }



    public void setImie(String imie){
        this.imie=imie;
    }
}
