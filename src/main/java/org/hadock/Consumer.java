package org.hadock;

public class Consumer {
    public void consumeMessage(Buffer buffer){
        System.out.println("Consumed : "+ buffer.returnMessage());
    }
    public Consumer(){

    }
}
