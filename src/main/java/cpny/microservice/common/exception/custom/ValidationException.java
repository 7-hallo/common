package cpny.microservice.common.exception.custom;

import java.util.HashMap;

public class ValidationException extends AbsApplicationException {

    private static final int httpStatus = 402;
    private final HashMap<String, String> validationMessages;

    public ValidationException(HashMap<String, String> validationMessages) {
        super(httpStatus);
        this.validationMessages = validationMessages;
    }

    @Override
    protected Object makeResponseBody() {
        return validationMessages;
    }
}
