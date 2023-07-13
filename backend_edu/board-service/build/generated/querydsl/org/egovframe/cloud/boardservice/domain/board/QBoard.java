package org.egovframe.cloud.boardservice.domain.board;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QBoard is a Querydsl query type for Board
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QBoard extends EntityPathBase<Board> {

    private static final long serialVersionUID = -1542409562L;

    public static final QBoard board = new QBoard("board");

    public final org.egovframe.cloud.servlet.domain.QBaseEntity _super = new org.egovframe.cloud.servlet.domain.QBaseEntity(this);

    public final StringPath boardName = createString("boardName");

    public final NumberPath<Integer> boardNo = createNumber("boardNo", Integer.class);

    public final BooleanPath commentUseAt = createBoolean("commentUseAt");

    //inherited
    public final StringPath createdBy = _super.createdBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDate = _super.createdDate;

    public final BooleanPath editorUseAt = createBoolean("editorUseAt");

    //inherited
    public final StringPath lastModifiedBy = _super.lastModifiedBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedDate = _super.modifiedDate;

    public final NumberPath<Integer> newDisplayDayCount = createNumber("newDisplayDayCount", Integer.class);

    public final NumberPath<Integer> pageDisplayCount = createNumber("pageDisplayCount", Integer.class);

    public final NumberPath<Integer> postDisplayCount = createNumber("postDisplayCount", Integer.class);

    public final ListPath<org.egovframe.cloud.boardservice.domain.posts.Posts, org.egovframe.cloud.boardservice.domain.posts.QPosts> posts = this.<org.egovframe.cloud.boardservice.domain.posts.Posts, org.egovframe.cloud.boardservice.domain.posts.QPosts>createList("posts", org.egovframe.cloud.boardservice.domain.posts.Posts.class, org.egovframe.cloud.boardservice.domain.posts.QPosts.class, PathInits.DIRECT2);

    public final StringPath skinTypeCode = createString("skinTypeCode");

    public final NumberPath<Integer> titleDisplayLength = createNumber("titleDisplayLength", Integer.class);

    public final NumberPath<Integer> uploadLimitCount = createNumber("uploadLimitCount", Integer.class);

    public final NumberPath<java.math.BigDecimal> uploadLimitSize = createNumber("uploadLimitSize", java.math.BigDecimal.class);

    public final BooleanPath uploadUseAt = createBoolean("uploadUseAt");

    public final BooleanPath userWriteAt = createBoolean("userWriteAt");

    public QBoard(String variable) {
        super(Board.class, forVariable(variable));
    }

    public QBoard(Path<? extends Board> path) {
        super(path.getType(), path.getMetadata());
    }

    public QBoard(PathMetadata metadata) {
        super(Board.class, metadata);
    }

}

