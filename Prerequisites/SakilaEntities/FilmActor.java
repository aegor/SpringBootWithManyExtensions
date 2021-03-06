package microtest.domain.model;

//
// This file was generated by the JPA Modeler
//

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "film_actor")
public class FilmActor implements Serializable {

    @ManyToOne(optional = false, targetEntity = Actor.class)
    @JoinColumn(name = "actor_id", insertable = false, updatable = false)
    private Actor actor;

    @Column(name = "actor_id", table = "film_actor", nullable = false)
    @Id
    private Long actorId;

    @Column(name = "film_id", table = "film_actor", nullable = false)
    @Id
    private Long filmId;

    @Column(name = "last_update", table = "film_actor", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @Basic
    private Date lastUpdate;

    @ManyToOne(optional = false, targetEntity = Film.class)
    @JoinColumn(name = "film_id", insertable = false, updatable = false)
    private Film film;

    public FilmActor() {

    }

    public Actor getActor() {
        return this.actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public Long getActorId() {
        return this.actorId;
    }

    public void setActorId(Long actorId) {
        this.actorId = actorId;
    }

    public Long getFilmId() {
        return this.filmId;
    }

    public void setFilmId(Long filmId) {
        this.filmId = filmId;
    }

    public Date getLastUpdate() {
        return this.lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Film getFilm() {
        return this.film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }
}
