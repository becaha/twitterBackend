package model;

public class Attachment {
    private String src;
    private String type; // image or video
    private String videoType;

    public Attachment(String src, String type) {
        this.src = src;
        this.type = type;
    }

    public Attachment(String src, String type, String videoType) {
        this.src = src;
        this.type = type;
        this.videoType = videoType;
    }
}
