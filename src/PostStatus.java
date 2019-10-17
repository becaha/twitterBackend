import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;

public class PostStatus {
    public Response handleRequest(PostStatusRequest request, Context context) {
        LambdaLogger logger = context.getLogger();
        logger.log("Entering Post Status with message: " + request.message);

        Response response = new Response("Status posted with " + request.message);

        return response;
    }
}
