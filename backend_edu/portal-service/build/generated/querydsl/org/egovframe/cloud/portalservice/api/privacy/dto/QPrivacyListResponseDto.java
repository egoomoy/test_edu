package org.egovframe.cloud.portalservice.api.privacy.dto;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.Generated;

/**
 * org.egovframe.cloud.portalservice.api.privacy.dto.QPrivacyListResponseDto is a Querydsl Projection type for PrivacyListResponseDto
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QPrivacyListResponseDto extends ConstructorExpression<PrivacyListResponseDto> {

    private static final long serialVersionUID = -375547885L;

    public QPrivacyListResponseDto(com.querydsl.core.types.Expression<Integer> privacyNo, com.querydsl.core.types.Expression<String> privacyTitle, com.querydsl.core.types.Expression<Boolean> useAt, com.querydsl.core.types.Expression<java.time.LocalDateTime> createdDate) {
        super(PrivacyListResponseDto.class, new Class<?>[]{int.class, String.class, boolean.class, java.time.LocalDateTime.class}, privacyNo, privacyTitle, useAt, createdDate);
    }

}

