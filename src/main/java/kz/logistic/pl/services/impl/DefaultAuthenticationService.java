package kz.logistic.pl.services.impl;

import io.jsonwebtoken.*;
import io.jsonwebtoken.security.SignatureException;
import kz.logistic.pl.models.entities.LoginEntity;
import kz.logistic.pl.repositories.LoginRepository;
import kz.logistic.pl.services.AuthenticationService;


import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.Key;

@Service
public class DefaultAuthenticationService implements AuthenticationService {

    @Autowired
    private LoginRepository loginRepository;
    private Key key = Keys.secretKeyFor(SignatureAlgorithm.HS256);

    @Override
    public boolean isCorrect(String username, String password) {
        LoginEntity loginEntity = this.loginRepository.findByUsernameAndPassword(username, password);
        return loginEntity != null;
    }

    @Override
    public String generateToken(String username) {
        String jwt = Jwts.builder()
                .setSubject(username)
                .signWith(key).compact();
        return jwt;
    }

    @Override
    public String validateToken(String token) {
        try{
            Jwts
                    .parser()
                    .setSigningKey(key)
                    .parseClaimsJws(token);
        }
        catch (ExpiredJwtException e){
            return "expired";
        }
        catch (MalformedJwtException e){
            return "invalid token";
        }
        catch (SignatureException e){
            return "invalid token";
        }
        return "OK";
    }
}