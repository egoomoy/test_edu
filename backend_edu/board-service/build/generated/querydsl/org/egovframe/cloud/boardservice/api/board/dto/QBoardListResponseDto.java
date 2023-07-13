package org.egovframe.cloud.boardservice.api.board.dto;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.Generated;

/**
 * org.egovframe.cloud.boardservice.api.board.dto.QBoardListResponseDto is a Querydsl Projection type for BoardListResponseDto
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QBoardListResponseDto extends ConstructorExpression<BoardListResponseDto> {

    private static final long serialVersionUID = 2126000855L;

    public QBoardListResponseDto(com.querydsl.core.types.Expression<Integer> boardNo, com.querydsl.core.types.Expression<String> boardName, com.querydsl.core.types.Expression<String> skinTypeCode, com.querydsl.core.types.Expression<Boolean> isPosts) {
        super(BoardListResponseDto.class, new Class<?>[]{int.class, String.class, String.class, boolean.class}, boardNo, boardName, skinTypeCode, isPosts);
    }

    public QBoardListResponseDto(com.querydsl.core.types.Expression<Integer> boardNo, com.querydsl.core.types.Expression<String> boardName, com.querydsl.core.types.Expression<String> skinTypeCode, com.querydsl.core.types.Expression<String> skinTypeCodeName, com.querydsl.core.types.Expression<java.time.LocalDateTime> createdDate, com.querydsl.core.types.Expression<Boolean> isPosts) {
        super(BoardListResponseDto.class, new Class<?>[]{int.class, String.class, String.class, String.class, java.time.LocalDateTime.class, boolean.class}, boardNo, boardName, skinTypeCode, skinTypeCodeName, createdDate, isPosts);
    }

}

