/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.osmadeit.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author osmadeit
 */
@Entity
@Table(name = "stories")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Stories.findAll", query = "SELECT s FROM Stories s")
    , @NamedQuery(name = "Stories.findById", query = "SELECT s FROM Stories s WHERE s.id = :id")
    , @NamedQuery(name = "Stories.findByTitle", query = "SELECT s FROM Stories s WHERE s.title = :title")
    , @NamedQuery(name = "Stories.findByStory", query = "SELECT s FROM Stories s WHERE s.story = :story")
    , @NamedQuery(name = "Stories.findByCreatedAt", query = "SELECT s FROM Stories s WHERE s.createdAt = :createdAt")
    , @NamedQuery(name = "Stories.findByUpdatedAt", query = "SELECT s FROM Stories s WHERE s.updatedAt = :updatedAt")
    , @NamedQuery(name = "Stories.findByDeletedAt", query = "SELECT s FROM Stories s WHERE s.deletedAt = :deletedAt")})
public class Stories implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "title")
    private int title;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4999)
    @Column(name = "story")
    private String story;
    @Column(name = "created_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt;
    @Column(name = "updated_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updatedAt;
    @Column(name = "deleted_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date deletedAt;
    @JoinColumn(name = "genre_id", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Genres genreId;

    public Stories() {
    }

    public Stories(Integer id) {
        this.id = id;
    }

    public Stories(Integer id, int title, String story) {
        this.id = id;
        this.title = title;
        this.story = story;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getTitle() {
        return title;
    }

    public void setTitle(int title) {
        this.title = title;
    }

    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Date getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(Date deletedAt) {
        this.deletedAt = deletedAt;
    }

    public Genres getGenreId() {
        return genreId;
    }

    public void setGenreId(Genres genreId) {
        this.genreId = genreId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Stories)) {
            return false;
        }
        Stories other = (Stories) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.osmadeit.Stories[ id=" + id + " ]";
    }
    
}
