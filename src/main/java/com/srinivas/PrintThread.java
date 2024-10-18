package com.srinivas;

public class PrintThread extends Thread{
    public final Printer printer;
    public final int threadId;
    public PrintThread(Printer printer, int threadId){
        this.printer = printer;
        this.threadId = threadId;
    }

    @Override
    public void run(){
        printer.print(threadId);
    }

}
