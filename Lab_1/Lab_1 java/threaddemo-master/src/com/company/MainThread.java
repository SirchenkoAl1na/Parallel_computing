package com.company;

public class MainThread extends Thread {
    private final int id;
    private final BreakThread breakThread;
    private final int step;

    public MainThread(int id, BreakThread breakThread, int step) { 
        this.id = id; 
        this.breakThread = breakThread; 
        this.step = step; 
    }

    @Override
    public void run() {
        long col = 0; 
        long sum = 0; 
        boolean isStop = false;
        do {
            col = col + 1; 
            sum = step + sum; 
            isStop = breakThread.isCanBreak();
        } while (!isStop); 
        System.out.println(id + " sum - " + sum + " col - " + col); 
    }
}
