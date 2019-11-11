package com.secg.vet.repositories;

import com.secg.vet.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {
    @Query(value= "SELECT * FROM USUARIO WHERE username= :username",nativeQuery = true)
    public User userExists(@Param("username") String user);
    public User findByUsername(String username);
}
