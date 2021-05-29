package com.changhongit.utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTCreator;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

public class JWTutils {

    private static final String sign="!Q@W3e4r";

    public static String getToken(Map<String,String> map){


    Calendar instance =Calendar.getInstance();
    instance.add(Calendar.DATE,7);  //过期时间为7天


        JWTCreator.Builder builder=JWT.create();

        map.forEach((k,v)->{
            builder.withClaim(k,v);
        });




    String tocken= builder.withExpiresAt(instance.getTime())
            .sign(Algorithm.HMAC256(sign));


        System.out.println(tocken);
        return tocken;
    }
//验证合法行
    public static void verify(String tocken){
        JWT.require(Algorithm.HMAC256(sign)).build().verify(tocken);
    }
//获取token信息
    public static DecodedJWT getTockenInfo(String tocken){
        return  JWT.require(Algorithm.HMAC256(sign)).build().verify(tocken);
    }
}
