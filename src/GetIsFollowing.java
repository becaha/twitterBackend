import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;

public class GetIsFollowing {
    public IsFollowingResponse handleRequest(IsFollowingRequest request, Context context) {
        LambdaLogger logger = context.getLogger();
        logger.log("Entering Get isFollowing with user handle: " + request.userHandle + ", follow handle: " + request.followHandle);

        // get IsFollowing

        // return IsFollowing in response

        IsFollowingResponse response = new IsFollowingResponse("true " + request.userHandle + " is following " + request.followHandle);

        return response;
    }
}
