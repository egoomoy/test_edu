package org.egovframe.cloud.portalservice.api.privacy.dto;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.Generated;

/**
 * org.egovframe.cloud.portalservice.api.privacy.dto.QPrivacyResponseDto is a Querydsl Projection type for PrivacyResponseDto
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QPrivacyResponseDto extends ConstructorExpression<PrivacyResponseDto> {

    private static final long serialVersionUID = 388456721L;

    public QPrivacyResponseDto(com.querydsl.core.types.Expression<Integer> privacyNo, com.querydsl.core.types.Expression<String> privacyTitle, com.querydsl.core.types.Expression<String> privacyContent, com.querydsl.core.types.Expression<Boolean> useAt) {
        super(PrivacyResponseDto.class, new Class<?>[]{int.class, String.class, String.class, boolean.class}, privacyNo, privacyTitle, privacyContent, useAt);
    }

}

