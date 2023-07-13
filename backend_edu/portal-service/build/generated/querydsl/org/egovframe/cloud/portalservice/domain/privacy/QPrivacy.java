package org.egovframe.cloud.portalservice.domain.privacy;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QPrivacy is a Querydsl query type for Privacy
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPrivacy extends EntityPathBase<Privacy> {

    private static final long serialVersionUID = 743049386L;

    public static final QPrivacy privacy = new QPrivacy("privacy");

    public final org.egovframe.cloud.servlet.domain.QBaseEntity _super = new org.egovframe.cloud.servlet.domain.QBaseEntity(this);

    //inherited
    public final StringPath createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDate = _super.createdDate;

    //inherited
    public final StringPath lastModifiedBy = _super.lastModifiedBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedDate = _super.modifiedDate;

    public final StringPath privacyContent = createString("privacyContent");

    public final NumberPath<Integer> privacyNo = createNumber("privacyNo", Integer.class);

    public final StringPath privacyTitle = createString("privacyTitle");

    public final BooleanPath useAt = createBoolean("useAt");

    public QPrivacy(String variable) {
        super(Privacy.class, forVariable(variable));
    }

    public QPrivacy(Path<? extends Privacy> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPrivacy(PathMetadata metadata) {
        super(Privacy.class, metadata);
    }

}

