import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;

public class UpdateProfile {
    public Response handleRequest(UpdateProfileRequest request, Context context) {
        LambdaLogger logger = context.getLogger();
        logger.log("Entering Update Profile of: " + request.handle + " with src: " + request.src);

        Response response = new Response("Profile updated");

        return response;
    }
}
