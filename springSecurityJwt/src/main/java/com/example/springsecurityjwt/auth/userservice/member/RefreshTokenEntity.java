package com.example.springsecurityjwt.auth.userservice.member;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@NoArgsConstructor
@Table(name = "refresh_token")
@Entity
public class RefreshTokenEntity {
    @Id
    private String refreshKey;
    private String value;

    public RefreshTokenEntity updateValue(String token) {
        this.value = token;
        return this;
    }

    @Builder
    public RefreshTokenEntity(String refreshKey, String value) {
        this.refreshKey = refreshKey;
        this.value = value;
    }
}
