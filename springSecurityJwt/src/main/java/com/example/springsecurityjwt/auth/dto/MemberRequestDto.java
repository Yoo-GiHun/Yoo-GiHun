package com.example.springsecurityjwt.auth.dto;

import com.example.springsecurityjwt.auth.Authority;
import com.example.springsecurityjwt.auth.userservice.member.MemberEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MemberRequestDto {
    private String email;
    private String password;

    public MemberEntity toMember(PasswordEncoder passwordEncoder) {
        return MemberEntity.builder()
                .email(email)
                .password(passwordEncoder.encode(password))
                .authority(Authority.ROLE_USER)
                .build();
    }

    public UsernamePasswordAuthenticationToken toAuthentication() {
        return new UsernamePasswordAuthenticationToken(email, password);
    }
}
