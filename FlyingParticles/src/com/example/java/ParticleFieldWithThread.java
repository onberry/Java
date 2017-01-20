package com.example.java;


public class ParticleFieldWithThread extends ParticleField {
    Thread t;
    boolean running = true;

    ParticleFieldWithThread() {
        Thread t= new Thread(r1);
        t.start();
        System.out.println("thread");
    }
    Runnable r1 = new Runnable()
    {
        @Override
        public void run() {
            while (running) {
                try {
                    Thread.sleep(40);
                    for (Particle p : particlesArray) {
                        p.move();
                    }
                    repaint();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    };

    public void finalize(){

        running = false;
        System.out.println("Teminated");

    }

}