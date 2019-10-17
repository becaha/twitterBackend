import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;

public class GetFollowers {
    public FollowersResponse handleRequest(UserRequest request, Context context) {
        LambdaLogger logger = context.getLogger();
        logger.log("Entering Get Followers of user with handle: " + request.handle);

        // get Followers

        // return list of users in response

        FollowersResponse response = new FollowersResponse();

        return response;
    }
}
