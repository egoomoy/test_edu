package org.egovframe.cloud.boardservice.api.posts.dto;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.Generated;

/**
 * org.egovframe.cloud.boardservice.api.posts.dto.QPostsListResponseDto is a Querydsl Projection type for PostsListResponseDto
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QPostsListResponseDto extends ConstructorExpression<PostsListResponseDto> {

    private static final long serialVersionUID = 1530230269L;

    public QPostsListResponseDto(com.querydsl.core.types.Expression<Integer> boardNo, com.querydsl.core.types.Expression<Integer> postsNo, com.querydsl.core.types.Expression<String> postsTitle, com.querydsl.core.types.Expression<String> postsContent, com.querydsl.core.types.Expression<String> postsAnswerContent, com.querydsl.core.types.Expression<Integer> readCount, com.querydsl.core.types.Expression<Boolean> noticeAt, com.querydsl.core.types.Expression<Integer> deleteAt, com.querydsl.core.types.Expression<String> createdBy, com.querydsl.core.types.Expression<String> createdName, com.querydsl.core.types.Expression<java.time.LocalDateTime> createdDate, com.querydsl.core.types.Expression<Integer> newDisplayDayCount, com.querydsl.core.types.Expression<Long> commentCount) {
        super(PostsListResponseDto.class, new Class<?>[]{int.class, int.class, String.class, String.class, String.class, int.class, boolean.class, int.class, String.class, String.class, java.time.LocalDateTime.class, int.class, long.class}, boardNo, postsNo, postsTitle, postsContent, postsAnswerContent, readCount, noticeAt, deleteAt, createdBy, createdName, createdDate, newDisplayDayCount, commentCount);
    }

}

