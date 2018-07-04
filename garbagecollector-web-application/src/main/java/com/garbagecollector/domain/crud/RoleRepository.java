package com.garbagecollector.domain.crud;

import org.springframework.data.repository.CrudRepository;

import com.garbagecollector.domain.entity.Role;

public interface RoleRepository extends CrudRepository<Role, Long>{
}
