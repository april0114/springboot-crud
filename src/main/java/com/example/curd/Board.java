package com.example.curd;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.annotation.processing.Generated;
import java.time.LocalDateTime;

@Setter
@Getter
// 기본 생성자 생성
@NoArgsConstructor
//DB테이블 생성 역할
@Entity(name = "users")
public class Board extends Timestamped{
    //기본키를 자동으로 생성할때 @id와 @GeneratedValue가 함께 사용되어야 함
    //데이터마다 고유 ID를 자동으로 생성해주는 것
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private long id;

    //글 제목
    @Column(nullable = false)
    private String title;

    //글  내용
    @Column(nullable = false)
    private String content;

    //비밀번호
    @Column(nullable = false)
    private String password;

    //data transfer object 데이터 전달
    public Board(BoardRequestDto requestDto){
        this.title = requestDto.getTitle();
        this.content = requestDto.getContent();
        this.password = requestDto.getPassword();
    }

    //업데이트 메소드
    public void update(BoardRequestDto requestDto){
        this.title = requestDto.getTitle();
        this.content = requestDto.getContent();
        this.password = requestDto.getPassword();
    }


}
