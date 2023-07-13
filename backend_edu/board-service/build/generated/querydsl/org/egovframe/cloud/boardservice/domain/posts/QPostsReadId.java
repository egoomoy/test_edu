package org.egovframe.cloud.boardservice.domain.posts;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QPostsReadId is a Querydsl query type for PostsReadId
 */
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QPostsReadId extends BeanPath<PostsReadId> {

    private static final long serialVersionUID = 1055512625L;

    public static final QPostsReadId postsReadId = new QPostsReadId("postsReadId");

    public final NumberPath<Integer> boardNo = createNumber("boardNo", Integer.class);

    public final NumberPath<Integer> postsNo = createNumber("postsNo", Integer.class);

    public final NumberPath<Integer> readNo = createNumber("readNo", Integer.class);

    public QPostsReadId(String variable) {
        super(PostsReadId.class, forVariable(variable));
    }

    public QPostsReadId(Path<? extends PostsReadId> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPostsReadId(PathMetadata metadata) {
        super(PostsReadId.class, metadata);
    }

}

