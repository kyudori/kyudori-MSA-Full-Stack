package com.example.springlab.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class TeamMemberVO {
    private String name;
    private String nickName;
    private String food;
}
