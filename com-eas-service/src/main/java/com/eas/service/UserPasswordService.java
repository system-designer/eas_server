package com.eas.service;

/**
 * Created by RayLew on 2014/11/10.
 */
public  interface UserPasswordService {

    String passwordEncode(String password, String salt);

    String createSalt();
}
