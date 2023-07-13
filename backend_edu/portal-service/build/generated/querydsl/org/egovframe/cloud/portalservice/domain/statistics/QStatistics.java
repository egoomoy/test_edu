package org.egovframe.cloud.portalservice.domain.statistics;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QStatistics is a Querydsl query type for Statistics
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QStatistics extends EntityPathBase<Statistics> {

    private static final long serialVersionUID = 1888893590L;

    public static final QStatistics statistics = new QStatistics("statistics");

    public final org.egovframe.cloud.servlet.domain.QBaseTimeEntity _super = new org.egovframe.cloud.servlet.domain.QBaseTimeEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDate = _super.createdDate;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modifiedDate = _super.modifiedDate;

    public final StringPath remoteIp = createString("remoteIp");

    public final NumberPath<Long> siteId = createNumber("siteId", Long.class);

    public final StringPath statisticsId = createString("statisticsId");

    public QStatistics(String variable) {
        super(Statistics.class, forVariable(variable));
    }

    public QStatistics(Path<? extends Statistics> path) {
        super(path.getType(), path.getMetadata());
    }

    public QStatistics(PathMetadata metadata) {
        super(Statistics.class, metadata);
    }

}

