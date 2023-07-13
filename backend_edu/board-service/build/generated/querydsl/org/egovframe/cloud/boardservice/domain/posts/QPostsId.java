package org.egovframe.cloud.boardservice.domain.posts;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QPostsId is a Querydsl query type for PostsId
 */
@Generated("com.querydsl.codegen.DefaultEmbeddableSerializer")
public class QPostsId extends BeanPath<PostsId> {

    private static final long serialVersionUID = -468123653L;

    public static final QPostsId postsId = new QPostsId("postsId");

    public final NumberPath<Integer> boardNo = createNumber("boardNo", Integer.class);

    public final NumberPath<Integer> postsNo = createNumber("postsNo", Integer.class);

    public QPostsId(String variable) {
        super(PostsId.class, forVariable(variable));
    }

    public QPostsId(Path<? extends PostsId> path) {
        super(path.getType(), path.getMetadata());
    }

    public QPostsId(PathMetadata metadata) {
        super(PostsId.class, metadata);
    }

}

