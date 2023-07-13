package org.egovframe.cloud.portalservice.domain.banner;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QBanner is a Querydsl query type for Banner
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QBanner extends EntityPathBase<Banner> {

    private static final long serialVersionUID = -1302866954L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QBanner banner = new QBanner("banner");

    public final org.egovframe.cloud.servlet.domain.QBaseEntity _super = new org.egovframe.cloud.servlet.domain.QBaseEntity(this);

    public final StringPath attachmentCode = createString("attachmentCode");

    public final StringPath bannerContent = createString("bannerContent");

    public final NumberPath<Integer> bannerNo = createNumber("bannerNo", Integer.class);

    public final StringPath bannerTitle = createString("bannerTitle");

    public final StringPath bannerTypeCode = createString("bannerTypeCode");

    //inherited
    public final StringPath createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDate = _super.createdDate;

    //inherited
    public final StringPath lastModifiedBy = _super.lastModifiedBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedDate = _super.modifiedDate;

    public final BooleanPath newWindowAt = createBoolean("newWindowAt");

    public final org.egovframe.cloud.portalservice.domain.menu.QSite site;

    public final NumberPath<Integer> sortSeq = createNumber("sortSeq", Integer.class);

    public final StringPath urlAddr = createString("urlAddr");

    public final BooleanPath useAt = createBoolean("useAt");

    public QBanner(String variable) {
        this(Banner.class, forVariable(variable), INITS);
    }

    public QBanner(Path<? extends Banner> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QBanner(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QBanner(PathMetadata metadata, PathInits inits) {
        this(Banner.class, metadata, inits);
    }

    public QBanner(Class<? extends Banner> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.site = inits.isInitialized("site") ? new org.egovframe.cloud.portalservice.domain.menu.QSite(forProperty("site")) : null;
    }

}

