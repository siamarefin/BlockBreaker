package Main;

import javax.swing.*;

import javax.swing.JFrame.*;  

public class Main {
    public static void main(String[] args) {
        JFrame obj = new JFrame();
        Driver gamePlay= new Driver();
        obj.setBounds(10, 10 , 700, 600);
        obj.setTitle("Pong");
        obj.setResizable(false);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.add(gamePlay);
    }
}