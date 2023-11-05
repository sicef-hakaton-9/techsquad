package app.development.domain.role.service;

import app.development.domain.role.entity.Role;

import java.util.Optional;

public interface RoleService {

    Role getRoleById(Long id);

    Optional<Role> findRoleById(Long id);

    Role findRoleByName(String name);

}
