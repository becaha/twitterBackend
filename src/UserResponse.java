import model.User;

public class UserResponse {
//    public User user;
//
//    public UserResponse(User user) {
//        this.user = user;
//    }
    public String handle;
    public String password;
    public String name;

    public UserResponse(String handle, String password, String name) {
         this.handle = handle;
         this.password = password;
         this.name = name;
    }
}
