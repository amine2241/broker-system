package org.hadock;

import org.hadock.Data.Message;

public class Producer {
    public void sendMessage(Message message, Buffer buffer) {
    buffer.storeMessage(message);
    System.out.println("Produced :"+ message);
    }

}
