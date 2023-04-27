package com.company;



public class BreakThread implements Runnable{
    private boolean canBreak = false;
    private int time;

    public int getTime() { 
        return time; 
    }
    public  void setTime(int value){ 
        time=value;
    }
    @Override
    public void run() {
        try {
            Thread.sleep(time); 
        } catch (InterruptedException e) { 
            e.printStackTrace();
        }
        canBreak = true; 
    }

    synchronized public boolean isCanBreak() { 
        return canBreak;
    }
}