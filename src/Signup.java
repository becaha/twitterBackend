import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;

public class Signup {
    public Response handleRequest(SignupRequest request, Context context) {
        LambdaLogger logger = context.getLogger();
        logger.log("Entering Signup with handle: " + request.handle + ", password: " + request.password + ", name: " + request.name);

        Response response = new Response("User signed up");

        return response;
    }
}
