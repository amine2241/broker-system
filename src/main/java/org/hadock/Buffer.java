package org.hadock;

import org.hadock.Data.Message;

import java.util.ArrayList;
import java.util.List;

public class Buffer {
    private List<Message> queue;
    public void storeMessage (Message message){
        queue = new ArrayList<Message>();
        queue.add(message);
    }

    public Buffer(List<Message> messages) {
        this.queue = messages;
    }
    public Buffer() {
    }

    public void setMessages(List<Message> messages) {
        this.queue = messages;
    }
    public Message returnMessage(){
        return queue.get(0);
    }
}
