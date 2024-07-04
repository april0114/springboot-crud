package com.example.curd;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Optional;

@NoArgsConstructor
@AllArgsConstructor
@Getter
//게시판 전체 목록 조회 시 넘겨줄 response
public class BoardListResponseDto {
    private String title;
    private String username;
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;

    public BoardListResponseDto(Board board) {
        this.title = board.getTitle();
        this.createdAt = board.getModifiedAt();
        this.modifiedAt = board.getCreatedAt();
    }
    public BoardListResponseDto(Optional<Board> board){
        this.title = board.get().getTitle();
        this.createdAt = board.get().getModifiedAt();
        this.modifiedAt = board.get().getCreatedAt();
    }
}
