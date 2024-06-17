package com.example.Lab05.validator.annotation;

import com.example.Lab05.validator.*;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = ValidUserIdValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidUserId {
    String message() default "Invalid User ID";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}