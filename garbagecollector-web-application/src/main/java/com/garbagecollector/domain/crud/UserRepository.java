package com.garbagecollector.domain.crud;

import org.springframework.data.repository.CrudRepository;

import com.garbagecollector.domain.entity.User;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}
