import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;

public class GetStatus {
    public StatusResponse handleRequest(StatusRequest request, Context context) {
        LambdaLogger logger = context.getLogger();
        logger.log("Entering Get Status with id: " + request.id);

        // get status

        // return status in response

        StatusResponse response = new StatusResponse("dummyMessage", "dummySrc", "dummyOwnerHandle", "dummyDate", request.id);

        return response;
    }
}
