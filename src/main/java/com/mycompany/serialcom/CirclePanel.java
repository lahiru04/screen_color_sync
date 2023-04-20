/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.serialcom;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author User
 */
public class CirclePanel extends JPanel {
    
    private int radius=0;
    private Color c;

    public CirclePanel(Color c,int radius) {
        setPreferredSize(new Dimension(radius, radius)); // Set panel size
        this.radius =radius;
        this.c=c;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(c); // Set color to red
        int centerX = getWidth() / 2;
        int centerY = getHeight() / 2;
        g.fillOval(centerX - radius, centerY - radius, 2 * radius, 2 * radius); // Draw circle
    }

 
}
