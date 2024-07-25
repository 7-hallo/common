package com.sevenhallo.common.exception.custom;

import org.springframework.http.ResponseEntity;

public abstract class AbsApplicationException extends RuntimeException {
    public final int HTTP_STATUS;

    protected AbsApplicationException(int httpStatus) {
        this.HTTP_STATUS = httpStatus;
    }

    protected abstract Object makeResponseBody();

    public ResponseEntity<?> makeResponseData() {
        return ResponseEntity.status(HTTP_STATUS).body(makeResponseBody());
    }
}
