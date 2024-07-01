package com.example.curd;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
//board 데이터를 넣을 때의 입력 요청 값
public class BoardRequestDto {
    private String title;
    private String content;
    private String password;
}
