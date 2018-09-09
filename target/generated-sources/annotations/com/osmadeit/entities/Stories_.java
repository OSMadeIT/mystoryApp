package com.osmadeit.entities;

import com.osmadeit.entities.Genres;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-09T22:35:54")
@StaticMetamodel(Stories.class)
public class Stories_ { 

    public static volatile SingularAttribute<Stories, Genres> genreId;
    public static volatile SingularAttribute<Stories, Date> createdAt;
    public static volatile SingularAttribute<Stories, Date> deletedAt;
    public static volatile SingularAttribute<Stories, Integer> id;
    public static volatile SingularAttribute<Stories, Integer> title;
    public static volatile SingularAttribute<Stories, String> story;
    public static volatile SingularAttribute<Stories, Date> updatedAt;

}