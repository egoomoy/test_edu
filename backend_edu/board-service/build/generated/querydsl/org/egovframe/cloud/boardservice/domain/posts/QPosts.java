package org.egovframe.cloud.boardservice.domain.posts;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPosts is a Querydsl query type for Posts
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPosts extends EntityPathBase<Posts> {

    private static final long serialVersionUID = 526886592L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPosts posts = new QPosts("posts");

    public final org.egovframe.cloud.servlet.domain.QBaseEntity _super = new org.egovframe.cloud.servlet.domain.QBaseEntity(this);

    public final StringPath attachmentCode = createString("attachmentCode");

    public final org.egovframe.cloud.boardservice.domain.board.QBoard board;

    public final ListPath<org.egovframe.cloud.boardservice.domain.comment.Comment, org.egovframe.cloud.boardservice.domain.comment.QComment> comments = this.<org.egovframe.cloud.boardservice.domain.comment.Comment, org.egovframe.cloud.boardservice.domain.comment.QComment>createList("comments", org.egovframe.cloud.boardservice.domain.comment.Comment.class, org.egovframe.cloud.boardservice.domain.comment.QComment.class, PathInits.DIRECT2);

    //inherited
    public final StringPath createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDate = _super.createdDate;

    public final org.egovframe.cloud.boardservice.domain.user.QUser creator;

    public final NumberPath<Integer> deleteAt = createNumber("deleteAt", Integer.class);

    //inherited
    public final StringPath lastModifiedBy = _super.lastModifiedBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedDate = _super.modifiedDate;

    public final BooleanPath noticeAt = createBoolean("noticeAt");

    public final StringPath postsAnswerContent = createString("postsAnswerContent");

    public final StringPath postsContent = createString("postsContent");

    public final QPostsId postsId;

    public final StringPath postsTitle = createString("postsTitle");

    public final NumberPath<Integer> readCount = createNumber("readCount", Integer.class);

    public QPosts(String variable) {
        this(Posts.class, forVariable(variable), INITS);
    }

    public QPosts(Path<? extends Posts> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QPosts(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QPosts(PathMetadata metadata, PathInits inits) {
        this(Posts.class, metadata, inits);
    }

    public QPosts(Class<? extends Posts> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.board = inits.isInitialized("board") ? new org.egovframe.cloud.boardservice.domain.board.QBoard(forProperty("board")) : null;
        this.creator = inits.isInitialized("creator") ? new org.egovframe.cloud.boardservice.domain.user.QUser(forProperty("creator")) : null;
        this.postsId = inits.isInitialized("postsId") ? new QPostsId(forProperty("postsId")) : null;
    }

}

