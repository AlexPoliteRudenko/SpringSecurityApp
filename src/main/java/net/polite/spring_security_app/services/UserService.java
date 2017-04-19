package net.polite.spring_security_app.services;

import net.polite.spring_security_app.model.User;

/**
 * Implementation of {@link net.polite.spring_security_app.dao.UserDao} interface.
 *
 * @author Oleksii Polite Rudenko
 * @version 1.0
 */

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
