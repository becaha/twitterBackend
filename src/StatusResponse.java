public class StatusResponse {
    // status object
    public String message;
    public String attachmentSrc;
    public String ownerHandle;
    public String date;
    public String id;

    public StatusResponse(String message, String attachmentSrc, String ownerHandle, String date, String id) {
        this.message = message;
        this.attachmentSrc = attachmentSrc;
        this.ownerHandle = ownerHandle;
        this.date = date;
        this.id = id;
    }
}
