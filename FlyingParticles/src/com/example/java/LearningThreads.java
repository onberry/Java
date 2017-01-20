package com.example.java;

import java.util.concurrent.Semaphore;

public class LearningThreads {
    private Semaphore maySleep = new Semaphore(1, true);
    boolean running = true;

    public LearningThreads(){
        for (int i=0; i<5;i++) {
            new Thread(this.new SleepHead(i)).start();
        }
        System.out.println( "Constructor of LearningThreads is completed");
    }

    @Override
    public void finalize(){
        running = false;
    }

    public class SleepHead implements Runnable {
        private int id;

        SleepHead(int id) {
            this.id = id;
        }

        public void run() {
            while (running) {
                //try to acquire permit from semaphore
                try {
                    maySleep.acquire();
                    //when thread acquired c.then print
                    System.out.println("Thread " + id + " has acquired a permit to sleep");
                    //Put current thread to sleep
                    Thread.sleep(2000);
                    //After 2sec of sleeping print
                    System.out.println("Thread " + id + " has woken up");
                    //release semaphore
                    maySleep.release();
                    running = false;
                }
                catch (InterruptedException e) {
                }
            }
            if (!running) {
                System.out.println("Thread " + id +  " has completed its execution");
            }
        }
    }
}