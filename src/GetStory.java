import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;

public class GetStory {
    public StoryResponse handleRequest(UserRequest request, Context context) {
        LambdaLogger logger = context.getLogger();
        logger.log("Entering Get Story with handle: " + request.handle);

        // get story

        // return story in response

        StoryResponse response = new StoryResponse();

        return response;
    }
}
