package com.sevenhallo.common.exception;

import com.sevenhallo.common.exception.custom.AbsApplicationException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandle {

    @ExceptionHandler(AbsApplicationException.class)
    public ResponseEntity<?> applicationExceptionHandle(AbsApplicationException e) {
        return e.makeResponseData();
    }
}
