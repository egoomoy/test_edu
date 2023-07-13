package org.egovframe.cloud.portalservice.api.banner.dto;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.Generated;

/**
 * org.egovframe.cloud.portalservice.api.banner.dto.QBannerListResponseDto is a Querydsl Projection type for BannerListResponseDto
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QBannerListResponseDto extends ConstructorExpression<BannerListResponseDto> {

    private static final long serialVersionUID = -1227436279L;

    public QBannerListResponseDto(com.querydsl.core.types.Expression<Integer> bannerNo, com.querydsl.core.types.Expression<String> bannerTypeCode, com.querydsl.core.types.Expression<String> bannerTypeCodeName, com.querydsl.core.types.Expression<String> bannerTitle, com.querydsl.core.types.Expression<Boolean> useAt, com.querydsl.core.types.Expression<java.time.LocalDateTime> createdDate, com.querydsl.core.types.Expression<String> siteName) {
        super(BannerListResponseDto.class, new Class<?>[]{int.class, String.class, String.class, String.class, boolean.class, java.time.LocalDateTime.class, String.class}, bannerNo, bannerTypeCode, bannerTypeCodeName, bannerTitle, useAt, createdDate, siteName);
    }

}

