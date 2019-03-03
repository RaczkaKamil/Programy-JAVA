package com.company;

public class Miernik {
    private String numer;
    private int id;
    public Miernik (String numer)
    {
        this.numer=numer;
        id++;
        this.id=id;
    }

    @Override
    public String toString() {
        return "GL - "+ numer+" id:"+id+"\n ";

    }
}
