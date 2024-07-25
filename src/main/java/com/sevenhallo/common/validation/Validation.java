package com.sevenhallo.common.validation;

import com.sevenhallo.common.exception.custom.ValidationException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

import java.util.HashMap;
import java.util.List;

public class Validation {

    public static boolean valid(BindingResult rs) {
        if (rs.hasErrors()) {
            HashMap<String, String> validationMessages = new HashMap<>();
            List<FieldError> fieldErrors = rs.getFieldErrors();
            for (FieldError fr : fieldErrors) {
                validationMessages.put(fr.getField(), fr.getDefaultMessage());
            }
            throw new ValidationException(validationMessages);
        }
        return true;
    }
}
