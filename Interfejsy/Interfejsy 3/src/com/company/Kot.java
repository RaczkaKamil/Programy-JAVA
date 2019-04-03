package com.company;

public class Kot implements Organizm {
    boolean przedstaw=false;
    String imie;
    @Override
    public String name() {
        return imie;
    }

    @Override
    public void jedz() {
        System.out.println("Kotek je");

    }

    @Override
    public void spij() {
        System.out.println("Kotek śpi");
    }



    public void setImie(String imie){
        this.imie=imie;
    }
}
