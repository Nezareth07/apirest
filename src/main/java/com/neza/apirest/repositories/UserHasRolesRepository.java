package com.neza.apirest.repositories;

import com.neza.apirest.models.UserHasRoles;
import com.neza.apirest.models.id.UserRoleId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserHasRolesRepository extends JpaRepository<UserHasRoles, UserRoleId> {
}
