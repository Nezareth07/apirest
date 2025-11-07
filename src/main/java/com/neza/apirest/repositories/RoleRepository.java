package com.neza.apirest.repositories;

import com.neza.apirest.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoleRepository extends JpaRepository<Role, String> {
    boolean existsByName(String name);

    List<Role> findAllByUserHasRoles_User_Id(Long id);
}
