package com.hbl.sBoot.dao;

import com.hbl.sBoot.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User,Integer> {
}
