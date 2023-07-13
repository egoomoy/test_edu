package org.egovframe.cloud.portalservice.api.content.dto;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.Generated;

/**
 * org.egovframe.cloud.portalservice.api.content.dto.QContentListResponseDto is a Querydsl Projection type for ContentListResponseDto
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QContentListResponseDto extends ConstructorExpression<ContentListResponseDto> {

    private static final long serialVersionUID = -73447567L;

    public QContentListResponseDto(com.querydsl.core.types.Expression<Integer> contentNo, com.querydsl.core.types.Expression<String> contentName, com.querydsl.core.types.Expression<String> lastModifiedBy, com.querydsl.core.types.Expression<java.time.LocalDateTime> modifiedDate) {
        super(ContentListResponseDto.class, new Class<?>[]{int.class, String.class, String.class, java.time.LocalDateTime.class}, contentNo, contentName, lastModifiedBy, modifiedDate);
    }

}

