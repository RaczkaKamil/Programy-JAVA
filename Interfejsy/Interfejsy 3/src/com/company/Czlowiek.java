package com.company;

public class Czlowiek implements Organizm{
    boolean przedstaw = false;
    String imie ;
    @Override
    public String name() {

        return imie;
    }

    @Override
    public void jedz() {
        System.out.println("Czlowiek jest nakarmiony!");
    }

    @Override
    public void spij() {
        System.out.println("Czlowiek idzie spac");
    }



    public void setImie(String imie){
        this.imie=imie;
    }
}
