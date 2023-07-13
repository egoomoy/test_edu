package org.egovframe.cloud.boardservice.api.comment.dto;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.Generated;

/**
 * org.egovframe.cloud.boardservice.api.comment.dto.QCommentListResponseDto is a Querydsl Projection type for CommentListResponseDto
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QCommentListResponseDto extends ConstructorExpression<CommentListResponseDto> {

    private static final long serialVersionUID = 550163045L;

    public QCommentListResponseDto(com.querydsl.core.types.Expression<Integer> boardNo, com.querydsl.core.types.Expression<Integer> postsNo, com.querydsl.core.types.Expression<Integer> commentNo, com.querydsl.core.types.Expression<String> commentContent, com.querydsl.core.types.Expression<Integer> groupNo, com.querydsl.core.types.Expression<Integer> parentCommentNo, com.querydsl.core.types.Expression<Integer> depthSeq, com.querydsl.core.types.Expression<Integer> sortSeq, com.querydsl.core.types.Expression<Integer> deleteAt, com.querydsl.core.types.Expression<String> createdBy, com.querydsl.core.types.Expression<String> createdName, com.querydsl.core.types.Expression<java.time.LocalDateTime> createdDate) {
        super(CommentListResponseDto.class, new Class<?>[]{int.class, int.class, int.class, String.class, int.class, int.class, int.class, int.class, int.class, String.class, String.class, java.time.LocalDateTime.class}, boardNo, postsNo, commentNo, commentContent, groupNo, parentCommentNo, depthSeq, sortSeq, deleteAt, createdBy, createdName, createdDate);
    }

}

