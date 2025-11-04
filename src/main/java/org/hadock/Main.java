package org.hadock;


import org.hadock.Data.Message;
import org.hadock.utils.CustomDate;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Buffer buffer = new Buffer();
        Producer producer = new Producer(buffer);
        Consumer consumer = new Consumer(buffer);


        Thread thread = new Thread(producer);
        Thread thread2 = new Thread(consumer);



        thread.start();
        thread2.start();


        thread.join();
        thread2.join();



    }
}