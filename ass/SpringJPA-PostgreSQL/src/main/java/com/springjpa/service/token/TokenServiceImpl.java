/*
package com.springjpa.service.token;

import com.springjpa.service.token.*;
import com.delti.label.entity.user.User;
import com.delti.label.repository.token.TokenRepository;
import com.delti.label.repository.user.UserRepository;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.security.SecureRandom;

*/
/**
 * Created by Iurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 2/18/16
 *//*

@Service
public class TokenServiceImpl implements TokenService {

    @Autowired
    private TokenRepository tokenRepository;
    @Autowired
    private UserRepository userRepository;

    @Override
    public Boolean validateTokenForUser(String userName, String value) {
    	Boolean result ;
    	Token token = tokenRepository.findByUserLoginNameAndValue( userName, value);
    	result = token != null;
    	if( result ) {
    		User user = token.getUser();
    		Authentication auth = 
    				  new UsernamePasswordAuthenticationToken(user.getLoginName(), null, user.getAuthorities());
    		SecurityContextHolder.getContext().setAuthentication(auth);
    	}
        return result;
    }

    @Override
    public String generateNewTokenForUser(String userName) {
        //remove old token
        Token possibleExistingToken = tokenRepository.findByUserLoginName(userName);
        if(possibleExistingToken != null) tokenRepository.delete(possibleExistingToken);

        //create new token
        Token token = new Token();
        token.setUser(userRepository.findByLoginName(userName));
        String tokenValue = new BigInteger(130, new SecureRandom()).toString(32);
        token.setValue(tokenValue);
        token.setGenerationDate(DateTime.now());
        tokenRepository.saveAndFlush(token);

        return tokenValue;
    }

    @Override
    public String getTokenValueForUser(String userName) {
        Token token = tokenRepository.findByUserLoginName(userName);
        return token != null ? token.getValue() : null;
    }
}
*/
