package org.egovframe.cloud.portalservice.api.banner.dto;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.ConstructorExpression;
import javax.annotation.Generated;

/**
 * org.egovframe.cloud.portalservice.api.banner.dto.QBannerImageResponseDto is a Querydsl Projection type for BannerImageResponseDto
 */
@Generated("com.querydsl.codegen.DefaultProjectionSerializer")
public class QBannerImageResponseDto extends ConstructorExpression<BannerImageResponseDto> {

    private static final long serialVersionUID = 1670218234L;

    public QBannerImageResponseDto(com.querydsl.core.types.Expression<Integer> bannerNo, com.querydsl.core.types.Expression<String> bannerTypeCode, com.querydsl.core.types.Expression<String> bannerTitle, com.querydsl.core.types.Expression<String> attachmentCode, com.querydsl.core.types.Expression<String> uniqueId, com.querydsl.core.types.Expression<String> urlAddr, com.querydsl.core.types.Expression<Boolean> newWindowAt, com.querydsl.core.types.Expression<String> bannerContent) {
        super(BannerImageResponseDto.class, new Class<?>[]{int.class, String.class, String.class, String.class, String.class, String.class, boolean.class, String.class}, bannerNo, bannerTypeCode, bannerTitle, attachmentCode, uniqueId, urlAddr, newWindowAt, bannerContent);
    }

}

