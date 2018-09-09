package com.osmadeit.entities;

import com.osmadeit.entities.Stories;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-09-09T22:35:54")
@StaticMetamodel(Genres.class)
public class Genres_ { 

    public static volatile SingularAttribute<Genres, Date> createdAt;
    public static volatile SingularAttribute<Genres, Date> deletedAt;
    public static volatile CollectionAttribute<Genres, Stories> storiesCollection;
    public static volatile SingularAttribute<Genres, String> name;
    public static volatile SingularAttribute<Genres, Integer> id;
    public static volatile SingularAttribute<Genres, Date> updatedAt;

}