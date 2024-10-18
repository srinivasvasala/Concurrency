package com.srinivas;

public class ThreadExample {
    public static void main(String[] args) {
        Printer printer = new Printer();
        for(int i=1;i<=5;i++){
            Thread t = new PrintThread(printer,i);
            t.start();
        }
    }
}
