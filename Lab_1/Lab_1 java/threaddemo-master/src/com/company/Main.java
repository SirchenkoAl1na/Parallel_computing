package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Coll thread:"); 
        int collThread =Integer.parseInt(scanner.nextLine());
        int[] timeBreakThread = new int[collThread]; 
        int[] steps = new  int[collThread]; 
        System.out.println("Print time(ms) and step"); 
        for (int i=0;i<collThread;i++) 
        {
            System.out.println("Thread "+(i)+":"); 
            String[] line = scanner.nextLine().split(" "); 
            timeBreakThread[i]=Integer.parseInt( line[0]); 
            steps[i]=Integer.parseInt( line[1]);  
        }
        for (int i=0; i<collThread;i++){ 
            BreakThread breakThread = new BreakThread(); 
            breakThread.setTime(timeBreakThread[i]); 
            new MainThread(i, breakThread,steps[i]).start(); 
            new Thread(breakThread).start(); 
        }
        scanner.close();
    }
}
