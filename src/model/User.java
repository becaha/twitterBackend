package model;

import java.util.List;

public class User {
    private String handle;
    private String password;
    private String name;
    private List<User> followers;
    private List<User> following;
    private Attachment profile;
    private List<Status> story;

    public User (String handle, String password, String name) {
        this.handle = handle;
        this.password = password;
        this.name = name;
    }

    public User (String handle, String password, String name, List<User> followers, List<User> following, Attachment profile) {
        this.handle = handle;
        this.password = password;
        this.name = name;
        this.followers = followers;
        this.following = following;
        this.profile = profile;
    }
}
