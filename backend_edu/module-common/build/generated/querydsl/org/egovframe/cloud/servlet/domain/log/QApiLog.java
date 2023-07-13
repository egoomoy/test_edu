package org.egovframe.cloud.servlet.domain.log;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QApiLog is a Querydsl query type for ApiLog
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QApiLog extends EntityPathBase<ApiLog> {

    private static final long serialVersionUID = -194508056L;

    public static final QApiLog apiLog = new QApiLog("apiLog");

    public final org.egovframe.cloud.servlet.domain.QBaseTimeEntity _super = new org.egovframe.cloud.servlet.domain.QBaseTimeEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDate = _super.createdDate;

    public final StringPath httpMethod = createString("httpMethod");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedDate = _super.modifiedDate;

    public final StringPath remoteIp = createString("remoteIp");

    public final StringPath requestUrl = createString("requestUrl");

    public final NumberPath<Long> siteId = createNumber("siteId", Long.class);

    public final StringPath userId = createString("userId");

    public QApiLog(String variable) {
        super(ApiLog.class, forVariable(variable));
    }

    public QApiLog(Path<? extends ApiLog> path) {
        super(path.getType(), path.getMetadata());
    }

    public QApiLog(PathMetadata metadata) {
        super(ApiLog.class, metadata);
    }

}

