package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Test extends JFrame implements ActionListener {

    JButton bPodajDate,bWyjscie;
    JLabel lWyswietlDate;

    public Test() {
        setSize(900, 900);
        setTitle("Moje pierwsze okienko");
        setLayout(null);
         bPodajDate = new JButton("Podaj date:");
        bPodajDate.setBounds(50, 50, 100, 20);
        add(bPodajDate);
        bPodajDate.addActionListener(this);

        bWyjscie = new JButton("Wyjscie");
        bWyjscie.setBounds(150, 50, 100, 20);
        add(bWyjscie);
        bWyjscie.addActionListener(this);

        lWyswietlDate=new JLabel("Data:");
        lWyswietlDate.setBounds(150,100,200,20);
        lWyswietlDate.setForeground(Color.red);
        lWyswietlDate.setFont(new Font("SansSerif",Font.BOLD,10));
        add(lWyswietlDate);
    }

    public static void main(String[] args) {
        Test okienko = new Test();
        okienko.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        okienko.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object zrodlo = e.getSource();
        if (zrodlo == bPodajDate) {
           // System.out.println(new Date());
            lWyswietlDate.setText(new Date().toString());
        }
        else if (zrodlo==bWyjscie)
        {
            dispose();
        }
    }
}
