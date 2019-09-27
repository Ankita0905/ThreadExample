package com.lambton;

public class HandleMainThread
{
    public static void main(String[] args)
    {
        FirstThread t1=new FirstThread("Ankita");
        FirstThread t2=new FirstThread("Jain");

        System.out.println("------------Start------------");
          t1.start();
          t2.start();

         SecondThread s1=new SecondThread("a");
         Thread t3=new Thread(s1);
         t3.start();
    }
}
