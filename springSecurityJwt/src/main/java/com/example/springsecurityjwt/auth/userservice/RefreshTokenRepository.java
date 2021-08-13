package com.example.springsecurityjwt.auth.userservice;

import com.example.springsecurityjwt.auth.userservice.member.RefreshTokenEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RefreshTokenRepository extends JpaRepository<RefreshTokenEntity, Long> {
    Optional<RefreshTokenEntity> findByRefreshKey(String refreshKey);
}
