package microtest.domain.model;

//
// This file was generated by the JPA Modeler
//

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "category")
public class Category implements Serializable {

    @OneToMany(targetEntity = FilmCategory.class, mappedBy = "category")
    private List<FilmCategory> filmCategoryCollection;

    @Column(name = "last_update", table = "category", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @Basic
    private Date lastUpdate;

    @Column(name = "name", table = "category", nullable = false, length = 25)
    @Basic
    private String name;

    @Column(name = "category_id", table = "category", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long categoryId;

    public Category() {

    }

    public List<FilmCategory> getFilmCategoryCollection() {
        return this.filmCategoryCollection;
    }

    public void setFilmCategoryCollection(List<FilmCategory> filmCategoryCollection) {
        this.filmCategoryCollection = filmCategoryCollection;
    }

    public Date getLastUpdate() {
        return this.lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCategoryId() {
        return this.categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }
}
