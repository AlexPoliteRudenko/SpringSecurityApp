package net.polite.spring_security_app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import net.polite.spring_security_app.model.User;

public interface UserDao extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
