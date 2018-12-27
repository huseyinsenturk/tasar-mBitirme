package com.springjpa.service.token;

/**
 * Created by Iurii Miedviediev
 *
 * @author DruidKuma
 * @version 1.0.0
 * @since 2/18/16
 */
public interface TokenService {
    Boolean validateTokenForUser(String userName, String value);
    String generateNewTokenForUser(String userName);
    String getTokenValueForUser(String userName);
}
