package org.egovframe.cloud.portalservice.domain.menu;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMenuRole is a Querydsl query type for MenuRole
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMenuRole extends EntityPathBase<MenuRole> {

    private static final long serialVersionUID = -1977906708L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMenuRole menuRole = new QMenuRole("menuRole");

    public final org.egovframe.cloud.servlet.domain.QBaseEntity _super = new org.egovframe.cloud.servlet.domain.QBaseEntity(this);

    //inherited
    public final StringPath createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDate = _super.createdDate;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    //inherited
    public final StringPath lastModifiedBy = _super.lastModifiedBy;

    public final QMenu menu;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedDate = _super.modifiedDate;

    public final StringPath roleId = createString("roleId");

    public QMenuRole(String variable) {
        this(MenuRole.class, forVariable(variable), INITS);
    }

    public QMenuRole(Path<? extends MenuRole> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMenuRole(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMenuRole(PathMetadata metadata, PathInits inits) {
        this(MenuRole.class, metadata, inits);
    }

    public QMenuRole(Class<? extends MenuRole> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.menu = inits.isInitialized("menu") ? new QMenu(forProperty("menu"), inits.get("menu")) : null;
    }

}

