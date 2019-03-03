package com.company;
import java.util.ArrayList;
import java.util.List;

public class ListaMiernikow {
    private List<Miernik> lista;
    public ListaMiernikow()
    {
        lista= new ArrayList<>();
        lista.add(new Miernik("1"));
        lista.add(new Miernik("1+"));
        lista.add(new Miernik("1s"));
        lista.add(new Miernik("2"));
        lista.add(new Miernik("2+"));
        lista.add(new Miernik("2s"));
        lista.add(new Miernik("3"));
        lista.add(new Miernik("3s"));
        lista.add(new Miernik("6"));
        lista.add(new Miernik("6+"));
        lista.add(new Miernik("6s"));
        lista.add(new Miernik("7"));
        lista.add(new Miernik("7s"));
        lista.add(new Miernik("8"));
        lista.add(new Miernik("8s"));
        lista.add(new Miernik("Pro 2 F"));
        lista.add(new Miernik("Pro 2 FA"));
        lista.add(new Miernik("Pro 2 FAZ"));
        lista.add(new Miernik("Pro 6 F"));
        lista.add(new Miernik("Pro 6 FA"));
        lista.add(new Miernik("Pro 6 FAZ"));
        lista.add(new Miernik("mini"));

    }


    public void dodawanie(Miernik miernik) {
        if (!lista.contains(miernik))
        {
            lista.add(miernik);
                    }

    }

    public void pokazListe()
    {
        System.out.println(lista);
    }
}
