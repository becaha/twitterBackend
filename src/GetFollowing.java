import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;

public class GetFollowing {
    public FollowingResponse handleRequest(UserRequest request, Context context) {
        LambdaLogger logger = context.getLogger();
        logger.log("Entering Get Following of user with handle: " + request.handle);

        // get Following

        // return list of users in response

        FollowingResponse response = new FollowingResponse();

        return response;
    }
}
