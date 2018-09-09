/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.osmadeit.bean;

import com.osmadeit.entities.Genres;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 *
 * @author osmadeit
 */
public class GenreBean {
        @PersistenceContext
    EntityManager em;
    
    // get all genres
    public List<Genres> getGenres(){
        TypedQuery<Genres> typedQuery = em.createQuery("SELECT m FROM Genres m", Genres.class);
        List<Genres> genres =  typedQuery.getResultList();
        return genres;
    }
   
    // get genre by id
    public Genres getGenresById(int id){
        Genres genre = em.find(Genres.class, id);
        return genre;
    }
    
    // save genre to db
    public Genres createGenres(Genres genre){
        em.persist(genre);
        em.flush();
        return genre;
    }
    
    // delete genre from DB
    public Genres deleteGenres(int id){
        Genres genre = em.find(Genres.class, id);
        em.remove(genre);
        return genre;
    }
}
