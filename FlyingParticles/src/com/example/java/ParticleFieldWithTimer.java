package com.example.java;

import java.awt.*;
import java.awt.event.*;
import javax.swing.Timer;

public class ParticleFieldWithTimer extends ParticleField {
    int delay = 40; //milliseconds
    Timer t;
    ParticleFieldWithTimer(){
        //start swing timer that ticks 25 times a second
        ActionListener taskPerformer = new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                for(Particle p: particlesArray) {
                    p.move();
                }
                repaint();
            }
        };
        t = new Timer(delay, taskPerformer);
        t.start();

    }

    public void finalize(){
        System.out.println("Timer terminated");
        t.stop();
    }

}
