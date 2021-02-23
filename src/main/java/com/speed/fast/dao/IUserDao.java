package com.speed.fast.dao;

import com.speed.fast.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("userDao")
public interface IUserDao extends JpaRepository<User,Integer> {
}
