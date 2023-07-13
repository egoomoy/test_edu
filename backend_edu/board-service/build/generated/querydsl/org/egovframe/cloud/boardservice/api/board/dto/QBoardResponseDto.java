package org.egovframe.cloud.boardservice.api.board.dto;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.Generated;

/**
 * org.egovframe.cloud.boardservice.api.board.dto.QBoardResponseDto is a Querydsl Projection type for BoardResponseDto
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QBoardResponseDto extends ConstructorExpression<BoardResponseDto> {

    private static final long serialVersionUID = -1171915307L;

    public QBoardResponseDto(com.querydsl.core.types.Expression<Integer> boardNo, com.querydsl.core.types.Expression<String> boardName, com.querydsl.core.types.Expression<String> skinTypeCode, com.querydsl.core.types.Expression<Integer> titleDisplayLength, com.querydsl.core.types.Expression<Integer> postDisplayCount, com.querydsl.core.types.Expression<Integer> pageDisplayCount, com.querydsl.core.types.Expression<Integer> newDisplayDayCount, com.querydsl.core.types.Expression<Boolean> editorUseAt, com.querydsl.core.types.Expression<Boolean> userWriteAt, com.querydsl.core.types.Expression<Boolean> commentUseAt, com.querydsl.core.types.Expression<Boolean> uploadUseAt, com.querydsl.core.types.Expression<Integer> uploadLimitCount, com.querydsl.core.types.Expression<? extends java.math.BigDecimal> uploadLimitSize) {
        super(BoardResponseDto.class, new Class<?>[]{int.class, String.class, String.class, int.class, int.class, int.class, int.class, boolean.class, boolean.class, boolean.class, boolean.class, int.class, java.math.BigDecimal.class}, boardNo, boardName, skinTypeCode, titleDisplayLength, postDisplayCount, pageDisplayCount, newDisplayDayCount, editorUseAt, userWriteAt, commentUseAt, uploadUseAt, uploadLimitCount, uploadLimitSize);
    }

}

