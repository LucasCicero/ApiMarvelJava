package com.lucas.apimarvel.controller;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Md5 {

    public static String md5Converter(String toBeHash)  {
        MessageDigest m;
        try {
             m = MessageDigest.getInstance("MD5");
            m.update(toBeHash.getBytes(), 0, toBeHash.length());
        }
        catch(NoSuchAlgorithmException e){
           throw new RuntimeException(e);
        }
        String resp = new BigInteger(1,m.digest()).toString(16);
        return resp;
    }

}
