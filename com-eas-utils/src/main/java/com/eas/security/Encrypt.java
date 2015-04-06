package com.eas.security;

public interface Encrypt {

    byte[] encryptBytes(byte[] buffer);

    byte[] encryptBefaultBytes(byte[] buffer);
    
}