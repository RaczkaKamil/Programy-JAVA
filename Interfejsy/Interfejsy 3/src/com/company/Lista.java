package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Lista {
    ArrayList<String> s= new ArrayList();

    public void dodaj(String imie)
    {
        s.add(imie);
    }


    public void wyswietl()
    {
        for(int i=0;i<s.size();i++) {
            System.out.println(s.get(i));
        }
        System.out.println("===========================sort======================");
        Collections.sort(s);
        for(int i=0;i<s.size();i++) {
            System.out.println(s.get(i));
        }
    }
}
