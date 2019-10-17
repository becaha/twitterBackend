package model;

import java.util.Set;

public class Message {
    private String text;
    private Set<String> hashtags; // no duplicates
    private Set<String> userMentions;
    private Set<String> urls;
    private String innerHTML;

    public Message(String text) {
        this.text = text;
//        this.setHashtags();
//        this.setUserMentions();
//        this.setInnerHTML();
    }
}
