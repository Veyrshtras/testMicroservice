package com.example.paymentsystem.repository;

import com.example.paymentsystem.entity.User;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Optional;

@Repository
public interface UserRepository extends BaseRepository<User> {

    @Transactional(Transactional.TxType.REQUIRES_NEW)
    Optional<User> findByUsername(String username);
}
