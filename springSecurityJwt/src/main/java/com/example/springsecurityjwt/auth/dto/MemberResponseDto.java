package com.example.springsecurityjwt.auth.dto;

import com.example.springsecurityjwt.auth.userservice.member.MemberEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class MemberResponseDto {
    private String email;

    public static MemberResponseDto of(MemberEntity memberEntity) {
        return new MemberResponseDto(memberEntity.getEmail());
    }
}
