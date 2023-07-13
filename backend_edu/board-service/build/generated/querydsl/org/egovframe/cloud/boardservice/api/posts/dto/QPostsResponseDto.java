package org.egovframe.cloud.boardservice.api.posts.dto;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.Generated;

/**
 * org.egovframe.cloud.boardservice.api.posts.dto.QPostsResponseDto is a Querydsl Projection type for PostsResponseDto
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QPostsResponseDto extends ConstructorExpression<PostsResponseDto> {

    private static final long serialVersionUID = -1973500933L;

    public QPostsResponseDto(com.querydsl.core.types.Expression<Integer> boardNo, com.querydsl.core.types.Expression<Integer> postsNo, com.querydsl.core.types.Expression<String> postsTitle, com.querydsl.core.types.Expression<String> postsContent, com.querydsl.core.types.Expression<String> postsAnswerContent, com.querydsl.core.types.Expression<String> attachmentCode, com.querydsl.core.types.Expression<Integer> readCount, com.querydsl.core.types.Expression<Boolean> noticeAt, com.querydsl.core.types.Expression<Integer> deleteAt, com.querydsl.core.types.Expression<String> createdBy, com.querydsl.core.types.Expression<String> createdName, com.querydsl.core.types.Expression<java.time.LocalDateTime> createdDate, com.querydsl.core.types.Expression<? extends org.egovframe.cloud.boardservice.api.board.dto.BoardResponseDto> board, com.querydsl.core.types.Expression<Long> userPostsReadCount) {
        super(PostsResponseDto.class, new Class<?>[]{int.class, int.class, String.class, String.class, String.class, String.class, int.class, boolean.class, int.class, String.class, String.class, java.time.LocalDateTime.class, org.egovframe.cloud.boardservice.api.board.dto.BoardResponseDto.class, long.class}, boardNo, postsNo, postsTitle, postsContent, postsAnswerContent, attachmentCode, readCount, noticeAt, deleteAt, createdBy, createdName, createdDate, board, userPostsReadCount);
    }

}

