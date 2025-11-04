package org.hadock;

import org.hadock.Data.Message;

public class Producer implements Runnable{


    private Buffer buffer;
    private final int max = 20;
    private final int min = 10;


    public Producer(Buffer buffer){
        this.buffer = buffer;
    }

    @Override
    public void run() {
        while(true){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            buffer.produce((int)(Math.random() * max - min + 1) + min);
        }
    }
}
