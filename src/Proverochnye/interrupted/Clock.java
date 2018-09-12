package Proverochnye.interrupted;

public class Clock implements Runnable
{
    public void run()
    {
        Thread current = Thread.currentThread();

        while (!current.isInterrupted())
        {
            try{
                Thread.sleep(1000);

            } catch (InterruptedException e){
                current.interrupt();
            }
            System.out.println("Tik");

        }
    }

    public static void main(String[] args)
    {
        Clock clock = new Clock();
        Thread clockThread = new Thread(clock);
        clockThread.start();
        try
        {
            Thread.sleep(10000);
        } catch (InterruptedException e ){

        }

        clockThread.interrupt();
    }
}
