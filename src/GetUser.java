import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;

public class GetUser {
    public UserResponse handleRequest(UserRequest request, Context context) {
        LambdaLogger logger = context.getLogger();
        logger.log("Entering Get User with handle: " + request.handle);

        // get user

        // return user in response
//        User dummyUser = new User(request.handle, "dummyPassword", "dummyName");

        UserResponse response = new UserResponse(request.handle, "dummyPassword", "dummyName");

        return response;
    }
}
