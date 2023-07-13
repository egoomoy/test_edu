package org.egovframe.cloud.boardservice.domain.comment;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCommentId is a Querydsl query type for CommentId
 */
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QCommentId extends BeanPath<CommentId> {

    private static final long serialVersionUID = -984620589L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QCommentId commentId = new QCommentId("commentId");

    public final NumberPath<Integer> commentNo = createNumber("commentNo", Integer.class);

    public final org.egovframe.cloud.boardservice.domain.posts.QPostsId postsId;

    public QCommentId(String variable) {
        this(CommentId.class, forVariable(variable), INITS);
    }

    public QCommentId(Path<? extends CommentId> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QCommentId(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QCommentId(PathMetadata metadata, PathInits inits) {
        this(CommentId.class, metadata, inits);
    }

    public QCommentId(Class<? extends CommentId> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.postsId = inits.isInitialized("postsId") ? new org.egovframe.cloud.boardservice.domain.posts.QPostsId(forProperty("postsId")) : null;
    }

}

