package com.springjpa.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by Hüseyin ŞENTÜRK on 12/12/2018.
 */
@ResponseStatus(value = HttpStatus.UNAUTHORIZED)
public class AuthorizationExeption extends RuntimeException {
    public AuthorizationExeption(String message) {
        super(message);
    }
}