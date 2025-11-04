package org.hadock;

import org.hadock.Data.Message;

import java.util.ArrayList;
import java.util.List;

public class Buffer {

    private List<Integer> queue = new ArrayList<>();


    public synchronized void produce(int value){
        while(queue.size() == 5){
            try{
                wait();
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
        System.out.println("produced: " + value);
        queue.add(value);
        notify();

    }


    public synchronized int consume(){
        while(queue.isEmpty()){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        int value = queue.remove(0);
        System.out.println("Consumed: " + value);
        notify();
        return value;
    }






}
