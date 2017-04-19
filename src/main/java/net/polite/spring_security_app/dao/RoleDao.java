package net.polite.spring_security_app.dao;

import net.polite.spring_security_app.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleDao extends JpaRepository<Role,Long> {
}
