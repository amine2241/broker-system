package org.hadock;

import org.hadock.Data.Message;

import java.util.ArrayList;
import java.util.List;

public class Buffer {
    private List<Message> messages;
    public void storeMessage (Message message){
        messages = new ArrayList<Message>();
        messages.add(message);
    }

    public Buffer(List<Message> messages) {
        this.messages = messages;
    }
    public Buffer() {
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }
    public Message returnMessage(){
        return messages.get(0);
    }
}
