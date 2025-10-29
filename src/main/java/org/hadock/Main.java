package org.hadock;


import org.hadock.Data.Message;
import org.hadock.utils.CustomDate;

public class Main {
    public static void main(String[] args) {
        CustomDate date = new CustomDate(2001,12,18);
        Message msg = new Message();
        msg.setDate(date);
        msg.setMessage("Hello Consumer");
        Buffer buffer = new Buffer();
        Producer producer = new Producer();
        producer.sendMessage(msg, buffer);
        Consumer consumer = new Consumer();
        consumer.consumeMessage(buffer);



    }
}