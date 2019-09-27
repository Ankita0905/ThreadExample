package com.lambton;

public class HandleMainThread
{
    public static void main(String[] args)
    {
        FirstThread t1=new FirstThread("Ankita");
        FirstThread t2=new FirstThread("Jain");

        t1.start();
        t2.start();
    }
}
