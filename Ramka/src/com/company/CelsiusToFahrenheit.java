package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CelsiusToFahrenheit extends JFrame implements ActionListener {
    JLabel lCelsius,lFahrenheit;
    JTextField tCelsius, tFahrenheit;
    JButton bKonwertuj;
    double tempCelsius, tempFahrenheit;

    public CelsiusToFahrenheit()
    {


        setSize(400,200);
        setTitle("Przeliczenie stopni ");
        setLayout(null);

        lCelsius = new JLabel("Stopnie Celsiusza");
        lCelsius.setBounds(20,20,150,20);
        add(lCelsius);
        tCelsius=new JTextField("");
        tCelsius.setBounds(170,20,150,20);
        add(tCelsius);

        lFahrenheit = new JLabel("Stopnie Fahrenheita:");
        lFahrenheit.setBounds(20,70,150,20);
        add(lFahrenheit);

        tFahrenheit=new JTextField("");
        tFahrenheit.setBounds(170,70,150,20);
        add(tFahrenheit);

        bKonwertuj = new JButton("Konwertuj");
        bKonwertuj.setBounds(100,100,150,20);
        add(bKonwertuj);
        bKonwertuj.addActionListener(this);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        tempCelsius = Double.parseDouble(tCelsius.getText()) ;
        tempFahrenheit = 32.0+(9.0/5)*tempCelsius;
        tFahrenheit.setText(String.valueOf(tempFahrenheit));

    }

    public static void main(String[]args)
    {
        CelsiusToFahrenheit aplikacja=new CelsiusToFahrenheit();
        aplikacja.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplikacja.setVisible(true);
    }
}
