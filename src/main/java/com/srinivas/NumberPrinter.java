package com.srinivas;

public class NumberPrinter implements Runnable{
 int num;
   public NumberPrinter(int num){
     this.num = num;
   }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" "+num);

    }

    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            Thread t = new Thread(new NumberPrinter(i));
            t.start();
            Thread t1 = new Thread(new NumberPrinter(i));
            t1.start();
        }
    }
}
