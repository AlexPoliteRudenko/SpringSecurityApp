package net.polite.spring_security_app.services;

/**
 * Service for Security
 *
 * @author Oleksii Polite Rudenko
 * @version 1.0
 */
public interface SecurityService {
    String findLoggedInUsername();

    void autoLogin(String username, String password);
}
