package org.egovframe.cloud.portalservice.domain.attachment;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QAttachmentId is a Querydsl query type for AttachmentId
 */
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QAttachmentId extends BeanPath<AttachmentId> {

    private static final long serialVersionUID = -1099368879L;

    public static final QAttachmentId attachmentId = new QAttachmentId("attachmentId");

    public final StringPath code = createString("code");

    public final NumberPath<Long> seq = createNumber("seq", Long.class);

    public QAttachmentId(String variable) {
        super(AttachmentId.class, forVariable(variable));
    }

    public QAttachmentId(Path<? extends AttachmentId> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAttachmentId(PathMetadata metadata) {
        super(AttachmentId.class, metadata);
    }

}

