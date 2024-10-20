package com.srinivas;

public class Printer {
    private int currentThread=1;
    private final int totalThreads=5;

    public synchronized void print(int threadId){
        for(int i=0;i<5;i++){
            while(currentThread!=threadId){
                try {
                    wait();
                }catch (InterruptedException e){
                    Thread.currentThread().interrupt();
                    System.out.println("Interrupted");
                }
            }
            System.out.println("Thread "+threadId+" printing...");

            currentThread = currentThread%totalThreads+1;
            notifyAll();

        }
    }
}
