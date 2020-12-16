package org.pyrih.santas;

public class Pair<S, R> {
    private S sender;
    private R receiver;

    public Pair(S sender, R receiver) {
        this.sender = sender;
        this.receiver = receiver;
    }

    public S getSender() {
        return sender;
    }

    public void setSender(S sender) {
        this.sender = sender;
    }

    public R getReceiver() {
        return receiver;
    }

    public void setReceiver(R receiver) {
        this.receiver = receiver;
    }


}
