package com.kafkaExample;

public final class MessageRequest {

    private String message;

    public MessageRequest(String message) {
        this.message = message;
    }

    public MessageRequest() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(Object obj) {
        return obj == this || obj != null && obj.getClass() == this.getClass();
    }

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public String toString() {
        return "MessageRequest[]";
    }

}
