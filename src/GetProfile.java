import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;

public class GetProfile {
    public ProfileResponse handleRequest(UserRequest request, Context context) {
        LambdaLogger logger = context.getLogger();
        logger.log("Entering Get Profile with user handle: " + request.handle);

        // get Profile

        // return Profile in response

        ProfileResponse response = new ProfileResponse("dummySrc");

        return response;
    }
}
