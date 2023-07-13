package org.egovframe.cloud.boardservice.api.posts.dto;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.Generated;

/**
 * org.egovframe.cloud.boardservice.api.posts.dto.QPostsSimpleResponseDto is a Querydsl Projection type for PostsSimpleResponseDto
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QPostsSimpleResponseDto extends ConstructorExpression<PostsSimpleResponseDto> {

    private static final long serialVersionUID = -578106071L;

    public QPostsSimpleResponseDto(com.querydsl.core.types.Expression<Integer> boardNo, com.querydsl.core.types.Expression<Integer> postsNo, com.querydsl.core.types.Expression<String> postsTitle, com.querydsl.core.types.Expression<String> postsContent, com.querydsl.core.types.Expression<java.time.LocalDateTime> createdDate) {
        super(PostsSimpleResponseDto.class, new Class<?>[]{int.class, int.class, String.class, String.class, java.time.LocalDateTime.class}, boardNo, postsNo, postsTitle, postsContent, createdDate);
    }

}

