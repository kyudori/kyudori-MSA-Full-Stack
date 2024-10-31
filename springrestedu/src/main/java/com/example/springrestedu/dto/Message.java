package com.example.springrestedu.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class Message {
    private String message1;
    private String message2;
    private String message3;
    @Builder
    public Message(String msg1, String msg2, String msg3) {
        this.message1 = msg1;
        this.message2 = msg2;
        this.message3 = msg3;
        System.out.println("@Builder 가 설정된 생성자 호출");
    }
}
