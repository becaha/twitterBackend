import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;

public class Follow {
    public Response handleRequest(FollowRequest request, Context context) {
        LambdaLogger logger = context.getLogger();
        logger.log("Entering Follow with user handle: " + request.userHandle + ", follow handle: " + request.followHandle);

        Response response = new Response(request.userHandle + " followed " + request.followHandle);

        return response;
    }
}
