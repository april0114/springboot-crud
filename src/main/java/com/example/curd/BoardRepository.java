package com.example.curd;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.curd.Board;
import com.example.curd.BoardListResponseDto;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface BoardRepository extends JpaRepository<Board, Long> {
    List<BoardListResponseDto> findAllByOrderByModifiedAtDesc();
}
