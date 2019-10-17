package model;

import java.util.Date;

public class Status {
    private Message message;
    private Attachment attachment;
    private User owner;
    private Date date;
    private String id;

    public Status(Message message, User owner) {
        this.message = message;
        this.owner = owner;
        // date is when it is constructed
        this.date = new Date();
//        this.setId();
    }

    public Status(Message message, User owner, Attachment attachment) {
        this.message = message;
        this.owner = owner;
        this.attachment = attachment;
        // date is when it is constructed
        this.date = new Date();
//        this.setId();
    }

}
