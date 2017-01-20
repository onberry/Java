package com.example.java;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main {

    public static void main(String[] args) {

        LearningThreads lt = new LearningThreads();
        /*Particles*/
        JFrame frame = new JFrame("Particles");
       // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       // ParticleFieldWithTimer particleFieldWithTimer  = new ParticleFieldWithTimer();
       // frame.getContentPane().add(particleFieldWithTimer);
        ParticleFieldWithThread particleFieldWithThread  = new ParticleFieldWithThread();
        frame.getContentPane().add(BorderLayout.CENTER, particleFieldWithThread);
        frame.pack();
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
               // particleFieldWithTimer.finalize();
                particleFieldWithThread.finalize();
                frame.dispose();
            }
        });

    }
}
