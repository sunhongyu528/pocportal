package com.changhongit.entity;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;

import java.util.HashMap;

public class TestJwt {
    public static void main(String[] args) {

        HashMap<String,Object> map=new HashMap<>();


        String tocken=JWT.create()
                .withHeader(map)
                .withClaim("userid",21)
                .sign(Algorithm.HMAC256("!Q@W3e4r"));


        System.out.println(tocken);


        JWTVerifier jwtVerifier= JWT.require(Algorithm.HMAC256("!Q@W3e4r")).build();

       DecodedJWT verify= jwtVerifier.verify("eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VyaWQiOjIxfQ.y2BZfTRujvbUgqHIPPwrP2rXocmrMWhM1xwejm_EmUg\n");

        System.out.println(verify.getClaim("userid").toString());
    }
}
