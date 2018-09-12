package Proverochnye.Wait__notify;

import java.util.Scanner;

public class Test
{
    public static void main(String[] args) throws InterruptedException
    {
        final WaitAndNotify wn = new WaitAndNotify();
        Thread thread1 = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
               try {
                   wn.method1();
               } catch (InterruptedException e){
                   e.printStackTrace();
               }
            }
        });
        Thread thread2 = new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                try {
                    wn.method2();
                } catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });
        thread1.start();
        thread2.start();
//        thread1.join();
//        thread2.join();
    }
}
   class WaitAndNotify {
     public void method1() throws InterruptedException{
        synchronized (this){
            System.out.println("method thred1 started");
            wait();
            System.out.println("method thred1 resumed");
        }
     }
     public void method2() throws InterruptedException {
        Thread.sleep(2000);
        Scanner sc = new Scanner(System.in);
        synchronized (this){
            System.out.println("waiting for return key pressed");
            sc.nextLine();
            notify();
        }
     }
   }