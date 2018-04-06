package com.suraj.jpaEx.jpaexample.service;

import org.springframework.data.jpa.repository.JpaRepository;
import com.suraj.jpaEx.jpaexample.entiry.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
