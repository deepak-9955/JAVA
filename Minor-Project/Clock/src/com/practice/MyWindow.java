package com.practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyWindow extends JFrame {

    private JLabel heading;
    private JLabel clockLable;
    private Font fon = new Font("",Font.BOLD,35);
    MyWindow(){
        setTitle("Simple Clock");
        setSize(300,200);
        setLocation(50,50);
        this.createGUI();
        this.startClock();
        setVisible(true);
    }

    public void createGUI(){
        heading = new JLabel("My clock");

        clockLable = new JLabel("clock");
        heading.setFont(fon);
        clockLable.setFont(fon);
        this.setLayout(new GridLayout(2,1));
        this.add(heading);
        this.add(clockLable);
    }

    public void startClock(){
        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              //  String dateTime = new Date().toString();
               // String dateTime = new Date().toLocaleString();

                Date d =new Date();

                SimpleDateFormat sfd = new SimpleDateFormat("hh : mm : ss a");
                String dateTime = sfd.format(d);

                clockLable.setText(dateTime);
            }
        });
        timer.start();
    }
}
