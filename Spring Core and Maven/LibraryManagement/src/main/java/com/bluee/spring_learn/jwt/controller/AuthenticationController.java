package com.bluee.spring_learn.jwt.controller;

import com.bluee.spring_learn.jwt.model.AuthenticationResponse;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Date;

@RestController
public class AuthenticationController {

    private static final String SECRET =
            "thisisaverylongsecretkeyforjwthandson123";


    @GetMapping("/authenticate")
    public AuthenticationResponse authenticate() {

        Key key = Keys.hmacShaKeyFor(
                SECRET.getBytes(StandardCharsets.UTF_8)
        );


        String token = Jwts.builder()
                .subject("user")
                .issuedAt(new Date())
                .expiration(
                        new Date(System.currentTimeMillis() + 3600000)
                )
                .signWith(key)
                .compact();


        return new AuthenticationResponse(token);
    }
}
