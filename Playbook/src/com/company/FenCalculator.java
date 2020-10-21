package com.company;

import javax.swing.*;
import java.awt.*;

public class FenCalculator extends JFrame {
    FenCalculator(){
    this.setTitle("Calculator");
    this.setSize(360,517);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);
    this.setContentPane(new PanCalculator());
    this.setResizable(false);
    this.setVisible(true);

    }
}
