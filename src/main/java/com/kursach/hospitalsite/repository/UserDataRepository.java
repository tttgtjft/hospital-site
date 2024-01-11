package com.kursach.hospitalsite.repository;

import com.kursach.hospitalsite.entities.UserData;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface UserDataRepository extends JpaRepository<UserData, Integer> {

    UserData findByLogin(String login);

}
