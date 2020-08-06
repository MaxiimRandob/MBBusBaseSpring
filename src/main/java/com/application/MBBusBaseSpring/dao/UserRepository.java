package com.application.MBBusBaseSpring.dao;

import com.application.MBBusBaseSpring.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository <User, Integer> {
    Optional<User> findByUsername(String username);

    boolean existsByLogin(String login);


}
