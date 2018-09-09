/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.osmadeit.rest;

import com.google.gson.Gson;
import com.osmadeit.entities.Stories;
import com.osmadeit.entities.Genres;
import com.osmadeit.bean.MyStoryBean;
import com.osmadeit.bean.GenreBean;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author osmadeit
 */
@Path("/stories")
@Stateless
public class StoriesRest {
        @EJB
    MyStoryBean storyService; 
 
    @GET
    @Path("/all")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Stories> findStories(){
       List<Stories> stories = storyService.getStories();
       System.out.print("All Stories");
       return stories;
    }
  
    @GET
    @Path("/story_id/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Stories findAllStories(@PathParam("id") int id){
       Stories stories = storyService.getStoriesById(id);
       return stories;
    }
    
    @POST
    @Path("/create_story")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Stories saveStories(Stories story){
        Gson gson = new Gson();
        System.out.println("sent object: " + gson.toJson(story));
        storyService.createStories(story);
        return story;
    }
    
    @DELETE
    @Path("/delete_story/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Stories deleteStories(@PathParam("id") int id){
       Stories stories = storyService.deleteStories(id);
       return stories;
    }
}
