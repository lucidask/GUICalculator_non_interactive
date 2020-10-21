package com.company;

import javax.swing.*;
import java.awt.*;

public class PanCalculator extends JPanel
{
    PanCalculator()
    {
        Dimension dimbutt= new Dimension(76, 50);
        Dimension dimamoled= new Dimension(290,115);
        Dimension dimbuttm= new Dimension(49,20);
        Font police= new Font("Arial", Font.PLAIN, 50);
        Font policebutton2= new Font("Arial", Font.BOLD, 9);
        Font policebutton1= new Font("Arial", Font.BOLD, 16);
        Color buttcolor1= new Color(0,0,0);
        Color buttcolor2= new Color(30,30,30);
        Color colorbackground= new Color(30,30,30);
        Color buttcolortext1= new Color(255,255,255);
        JLabel Amoled=new JLabel("0");
        this.setBackground(colorbackground);
        Amoled.setForeground(Color.white);
        this.add(Amoled);
        Amoled.setFont(police);
        Amoled.setHorizontalAlignment(JLabel.RIGHT);
        Amoled.setVerticalAlignment(JLabel.BOTTOM);
        Amoled.setPreferredSize(dimamoled);
        String[] elements = {"%", "CE", "C", "⌫", "1/x", "x²", "√x", "÷",
                "7", "8", "9", "×", "4", "5", "6", "−", "1", "2", "3",
                "+", "+/-", "0", ",", "="};
        String[] elements2 = {"MC", "MR", "M+", "M-", "MS", "M\'"};
        JButton[] buttontab1 = new JButton[elements.length];
        JButton[] buttontab2 = new JButton[elements2.length];

        for (int j=0; j<=elements2.length-1;j++)
        {
            this.add(buttontab2[j] = new JButton(elements2[j]));
            buttontab2[j].setPreferredSize(dimbuttm);
            buttontab2[j].setFont(policebutton2);
            buttontab2[j].setBackground(buttcolor2);
            buttontab2[j].setForeground(buttcolortext1);
            buttontab2[j].setBorder(null);


        }
        for (int i=0; i<=elements.length-1;i++)
        {
            this.add(buttontab1[i] = new JButton(elements[i]));
            buttontab1[i].setPreferredSize(dimbutt);
            buttontab1[i].setBackground(buttcolor1);
            buttontab1[i].setForeground(buttcolortext1);
            buttontab1[i].setFont(policebutton1);
            buttontab1[i].setBorder(null);



        }
    }
}
