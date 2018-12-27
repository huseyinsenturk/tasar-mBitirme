/*
package com.springjpa.web.api;
import com.springjpa.exception.AuthorizationExeption;
import com.springjpa.service.token.TokenService;
import com.google.common.base.Strings;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;

*/
/**
 * Created by
 *//*

public abstract class RestApi {

  //  private static final Logger logger = LogManager.getLogger(RestApi.class);
    private static final String AUTH_HEADER = "DK-Auth";

    @Autowired
    private TokenService tokenService;

    public void validateCredentials(HttpServletRequest request) throws  {
        String headerValue = request.getHeader(AUTH_HEADER);
        if (Strings.isNullOrEmpty(headerValue)) {
            String message = "Required Header DK-Auth is missing";
            logger.error(message);
            throw new AuthorizationExeption(message);
        }
        String[] nameAndToken = headerValue.split(":");
        if (nameAndToken.length < 2) {
            String message = "Invalid format of authorization token";
            logger.error(message);
            throw new AuthorizationExeption(message);
        }
        if (!tokenService.validateTokenForUser(nameAndToken[0], nameAndToken[1])) {
            String message = "The authorization token is incorrect";
            logger.error(message);
            throw new AuthorizationExeption(message);
        }
    }

}*/
