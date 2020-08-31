package com.application.MBBusBaseSpring.dao;

import com.application.MBBusBaseSpring.entity.Driver;
import com.application.MBBusBaseSpring.entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository <User, Integer> {
    Optional<User> findByLogin(String login);

    boolean existsByLogin(String login);

    @Query("SELECT p FROM User p WHERE p.bus.id = :busId")
    Optional<User> findByBusId(@Param("busId") int busId);
}
