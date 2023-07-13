package org.egovframe.cloud.portalservice.domain.menu;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QSite is a Querydsl query type for Site
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QSite extends EntityPathBase<Site> {

    private static final long serialVersionUID = -585926082L;

    public static final QSite site = new QSite("site");

    public final org.egovframe.cloud.servlet.domain.QBaseEntity _super = new org.egovframe.cloud.servlet.domain.QBaseEntity(this);

    //inherited
    public final StringPath createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDate = _super.createdDate;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final BooleanPath isUse = createBoolean("isUse");

    //inherited
    public final StringPath lastModifiedBy = _super.lastModifiedBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedDate = _super.modifiedDate;

    public final StringPath name = createString("name");

    public final NumberPath<Integer> sortSeq = createNumber("sortSeq", Integer.class);

    public QSite(String variable) {
        super(Site.class, forVariable(variable));
    }

    public QSite(Path<? extends Site> path) {
        super(path.getType(), path.getMetadata());
    }

    public QSite(PathMetadata metadata) {
        super(Site.class, metadata);
    }

}

