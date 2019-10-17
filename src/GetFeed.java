import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;

public class GetFeed {
    public FeedResponse handleRequest(UserRequest request, Context context) {
        LambdaLogger logger = context.getLogger();
        logger.log("Entering Get Feed with handle: " + request.handle);

        // get feed

        // return feed in response

        FeedResponse response = new FeedResponse();

        return response;
    }
}
