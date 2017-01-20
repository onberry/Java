package com.example.java;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ParticleField extends JPanel {

    ArrayList<Particle> particlesArray = new ArrayList<Particle>();

    ParticleField(){
        this.setPreferredSize(new Dimension(500, 500));
        for (int i=0; i<1000; i++){
            Particle particle = new Particle();
            particlesArray.add(particle);
        }
    }

    public void paintComponent(Graphics g){
        for (Particle p: particlesArray){
            g.setColor(Color.black);
            g.drawRect(((int) p.getX()), ((int) p.getY()),3,3);

        }
    }
}
