package org.egovframe.cloud.boardservice.domain.comment;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QComment is a Querydsl query type for Comment
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QComment extends EntityPathBase<Comment> {

    private static final long serialVersionUID = 1478303384L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QComment comment = new QComment("comment");

    public final org.egovframe.cloud.servlet.domain.QBaseEntity _super = new org.egovframe.cloud.servlet.domain.QBaseEntity(this);

    public final StringPath commentContent = createString("commentContent");

    public final QCommentId commentId;

    //inherited
    public final StringPath createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDate = _super.createdDate;

    public final org.egovframe.cloud.boardservice.domain.user.QUser creator;

    public final NumberPath<Integer> deleteAt = createNumber("deleteAt", Integer.class);

    public final NumberPath<Integer> depthSeq = createNumber("depthSeq", Integer.class);

    public final NumberPath<Integer> groupNo = createNumber("groupNo", Integer.class);

    //inherited
    public final StringPath lastModifiedBy = _super.lastModifiedBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedDate = _super.modifiedDate;

    public final NumberPath<Integer> parentCommentNo = createNumber("parentCommentNo", Integer.class);

    public final org.egovframe.cloud.boardservice.domain.posts.QPosts posts;

    public final NumberPath<Integer> sortSeq = createNumber("sortSeq", Integer.class);

    public QComment(String variable) {
        this(Comment.class, forVariable(variable), INITS);
    }

    public QComment(Path<? extends Comment> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QComment(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QComment(PathMetadata metadata, PathInits inits) {
        this(Comment.class, metadata, inits);
    }

    public QComment(Class<? extends Comment> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.commentId = inits.isInitialized("commentId") ? new QCommentId(forProperty("commentId"), inits.get("commentId")) : null;
        this.creator = inits.isInitialized("creator") ? new org.egovframe.cloud.boardservice.domain.user.QUser(forProperty("creator")) : null;
        this.posts = inits.isInitialized("posts") ? new org.egovframe.cloud.boardservice.domain.posts.QPosts(forProperty("posts"), inits.get("posts")) : null;
    }

}

