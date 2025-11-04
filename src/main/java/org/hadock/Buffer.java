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
        queue.add(value);
        notify();
    }





}
