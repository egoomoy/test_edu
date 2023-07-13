package org.egovframe.cloud.boardservice.domain.posts;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QPostsRead is a Querydsl query type for PostsRead
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QPostsRead extends EntityPathBase<PostsRead> {

    private static final long serialVersionUID = 1105007734L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QPostsRead postsRead = new QPostsRead("postsRead");

    public final DateTimePath<java.time.LocalDateTime> createdDate = createDateTime("createdDate", java.time.LocalDateTime.class);

    public final StringPath ipAddr = createString("ipAddr");

    public final QPostsReadId postsReadId;

    public final StringPath userId = createString("userId");

    public QPostsRead(String variable) {
        this(PostsRead.class, forVariable(variable), INITS);
    }

    public QPostsRead(Path<? extends PostsRead> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QPostsRead(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QPostsRead(PathMetadata metadata, PathInits inits) {
        this(PostsRead.class, metadata, inits);
    }

    public QPostsRead(Class<? extends PostsRead> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.postsReadId = inits.isInitialized("postsReadId") ? new QPostsReadId(forProperty("postsReadId")) : null;
    }

}

