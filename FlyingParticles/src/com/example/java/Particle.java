package com.example.java;

import javax.swing.*;
import java.util.Random;

public class Particle {
    private double x;
    private double y;
    //0 to 500
    static Random rng = new Random();
    private Random rng1 = new Random();
    private Random rng2 = new Random();
    private int rmin = 0;
    private int rmax = 500;


    JFrame frame = new JFrame();
    JPanel panel = new JPanel();

    Particle(){
        this.x = rmin + (rmax - rmin) * rng1.nextDouble();
        this.y = rmin + (rmax - rmin) * rng2.nextDouble();
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }


    public void move(){
        x = x + rng.nextGaussian();
        y = y + rng.nextGaussian();
    }
}
