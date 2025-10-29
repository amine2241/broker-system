package org.hadock.Data;

import org.hadock.utils.CustomDate;

import java.util.Date;
import java.util.UUID;

public class Message {

    private UUID uuid = UUID.randomUUID();
    private String message;
    private CustomDate date;

    public Message(){

    }

    public Message(UUID uuid, CustomDate date, String message) {
        this.uuid = uuid;
        this.date = date;
        this.message = message;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public CustomDate getDate() {
        return date;
    }

    public void setDate(CustomDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Message{" +
                "uuid=" + uuid +
                ", message='" + message + '\'' +
                ", date=" + date +
                '}';
    }
}
