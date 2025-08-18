package com.muashrafalii.webapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    public boolean authenticate(String username, String password) {
        boolean validUsername = username.equalsIgnoreCase("mido");
        boolean validPassword = password.equalsIgnoreCase("dummy");

        return validUsername && validPassword;
    }

}
