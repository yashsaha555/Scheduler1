package com.sourav.springbootschdeuler.dao;

import com.sourav.springbootschdeuler.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<User, Integer> {
}
