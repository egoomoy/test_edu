package org.egovframe.cloud.portalservice.domain.menu;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMenu is a Querydsl query type for Menu
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMenu extends EntityPathBase<Menu> {

    private static final long serialVersionUID = -586108842L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QMenu menu = new QMenu("menu");

    public final org.egovframe.cloud.servlet.domain.QBaseEntity _super = new org.egovframe.cloud.servlet.domain.QBaseEntity(this);

    public final ListPath<Menu, QMenu> children = this.<Menu, QMenu>createList("children", Menu.class, QMenu.class, PathInits.DIRECT2);

    public final NumberPath<Integer> connectId = createNumber("connectId", Integer.class);

    //inherited
    public final StringPath createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDate = _super.createdDate;

    public final StringPath description = createString("description");

    public final StringPath icon = createString("icon");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final BooleanPath isBlank = createBoolean("isBlank");

    public final BooleanPath isShow = createBoolean("isShow");

    public final BooleanPath isUse = createBoolean("isUse");

    //inherited
    public final StringPath lastModifiedBy = _super.lastModifiedBy;

    public final NumberPath<Integer> level = createNumber("level", Integer.class);

    public final StringPath menuEngName = createString("menuEngName");

    public final StringPath menuKorName = createString("menuKorName");

    public final ListPath<MenuRole, QMenuRole> menuRoles = this.<MenuRole, QMenuRole>createList("menuRoles", MenuRole.class, QMenuRole.class, PathInits.DIRECT2);

    public final StringPath menuType = createString("menuType");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedDate = _super.modifiedDate;

    public final QMenu parent;

    public final QSite site;

    public final NumberPath<Integer> sortSeq = createNumber("sortSeq", Integer.class);

    public final StringPath subName = createString("subName");

    public final StringPath urlPath = createString("urlPath");

    public QMenu(String variable) {
        this(Menu.class, forVariable(variable), INITS);
    }

    public QMenu(Path<? extends Menu> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QMenu(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QMenu(PathMetadata metadata, PathInits inits) {
        this(Menu.class, metadata, inits);
    }

    public QMenu(Class<? extends Menu> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.parent = inits.isInitialized("parent") ? new QMenu(forProperty("parent"), inits.get("parent")) : null;
        this.site = inits.isInitialized("site") ? new QSite(forProperty("site")) : null;
    }

}

