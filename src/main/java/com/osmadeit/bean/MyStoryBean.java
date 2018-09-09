/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.osmadeit.bean;

import com.osmadeit.entities.Stories;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 *
 * @author osmadeit
 */
@Stateless
public class MyStoryBean {
    @PersistenceContext
    EntityManager em;
    
    // get all stories
    public List<Stories> getStories(){
        TypedQuery<Stories> typedQuery = em.createQuery("SELECT m FROM Stories m", Stories.class);
        List<Stories> stories =  typedQuery.getResultList();
        return stories;
    }
   
    // get story by id
    public Stories getStoriesById(int id){
        Stories story = em.find(Stories.class, id);
        return story;
    }
    
    // save story to db
    public Stories createStories(Stories story){
        em.persist(story);
        em.flush();
        return story;
    }
    
    // delete story from DB
    public Stories deleteStories(int id){
        Stories story = em.find(Stories.class, id);
        em.remove(story);
        return story;
    }
    
}
