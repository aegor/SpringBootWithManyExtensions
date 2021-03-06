package microtest.domain.model;

//
// This file was generated by the JPA Modeler
//

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "film")
public class Film implements Serializable {

    @Column(name = "rental_rate", table = "film", nullable = false, scale = 2, precision = 4)
    @Basic
    private BigDecimal rentalRate;

    @Column(name = "rental_duration", table = "film", nullable = false)
    @Basic
    private Long rentalDuration;

    @OneToMany(targetEntity = Inventory.class, mappedBy = "filmId")
    private List<Inventory> inventoryCollection;

    @Column(name = "length", table = "film")
    @Basic
    private Long length;

    @Column(name = "rating", table = "film", length = 5)
    @Basic
    private String rating;

    @ManyToOne(optional = false, targetEntity = Language.class)
    @JoinColumn(name = "language_id")
    private Language languageId;

    @Column(name = "description", table = "film", length = 65535)
    @Lob
    @Basic
    private String description;

    @Column(name = "replacement_cost", table = "film", nullable = false, scale = 2, precision = 5)
    @Basic
    private BigDecimal replacementCost;

    @Column(name = "title", table = "film", nullable = false)
    @Basic
    private String title;

    @Column(name = "special_features", table = "film", length = 54)
    @Basic
    private String specialFeatures;

    @OneToMany(targetEntity = FilmActor.class, mappedBy = "film")
    private List<FilmActor> filmActorCollection;

    @OneToMany(targetEntity = FilmCategory.class, mappedBy = "film")
    private List<FilmCategory> filmCategoryCollection;

    @Column(name = "film_id", table = "film", nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long filmId;

    @Column(name = "last_update", table = "film", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @Basic
    private Date lastUpdate;

    @ManyToOne(targetEntity = Language.class)
    @JoinColumn(name = "original_language_id")
    private Language originalLanguageId;

    @Column(name = "release_year", table = "film")
    @Temporal(TemporalType.DATE)
    @Basic
    private Date releaseYear;

    public Film() {

    }

    public BigDecimal getRentalRate() {
        return this.rentalRate;
    }

    public void setRentalRate(BigDecimal rentalRate) {
        this.rentalRate = rentalRate;
    }

    public Long getRentalDuration() {
        return this.rentalDuration;
    }

    public void setRentalDuration(Long rentalDuration) {
        this.rentalDuration = rentalDuration;
    }

    public List<Inventory> getInventoryCollection() {
        return this.inventoryCollection;
    }

    public void setInventoryCollection(List<Inventory> inventoryCollection) {
        this.inventoryCollection = inventoryCollection;
    }

    public Long getLength() {
        return this.length;
    }

    public void setLength(Long length) {
        this.length = length;
    }

    public String getRating() {
        return this.rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public Language getLanguageId() {
        return this.languageId;
    }

    public void setLanguageId(Language languageId) {
        this.languageId = languageId;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getReplacementCost() {
        return this.replacementCost;
    }

    public void setReplacementCost(BigDecimal replacementCost) {
        this.replacementCost = replacementCost;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSpecialFeatures() {
        return this.specialFeatures;
    }

    public void setSpecialFeatures(String specialFeatures) {
        this.specialFeatures = specialFeatures;
    }

    public List<FilmActor> getFilmActorCollection() {
        return this.filmActorCollection;
    }

    public void setFilmActorCollection(List<FilmActor> filmActorCollection) {
        this.filmActorCollection = filmActorCollection;
    }

    public List<FilmCategory> getFilmCategoryCollection() {
        return this.filmCategoryCollection;
    }

    public void setFilmCategoryCollection(List<FilmCategory> filmCategoryCollection) {
        this.filmCategoryCollection = filmCategoryCollection;
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

    public Language getOriginalLanguageId() {
        return this.originalLanguageId;
    }

    public void setOriginalLanguageId(Language originalLanguageId) {
        this.originalLanguageId = originalLanguageId;
    }

    public Date getReleaseYear() {
        return this.releaseYear;
    }

    public void setReleaseYear(Date releaseYear) {
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString() {
        return "Film{" +
                "rentalRate=" + rentalRate +
                ", rentalDuration=" + rentalDuration +
                ", inventoryCollection=" + inventoryCollection +
                ", length=" + length +
                ", rating='" + rating + '\'' +
                ", languageId=" + languageId +
                ", description='" + description + '\'' +
                ", replacementCost=" + replacementCost +
                ", title='" + title + '\'' +
                ", specialFeatures='" + specialFeatures + '\'' +
                ", filmActorCollection=" + filmActorCollection +
                ", filmCategoryCollection=" + filmCategoryCollection +
                ", filmId=" + filmId +
                ", lastUpdate=" + lastUpdate +
                ", originalLanguageId=" + originalLanguageId +
                ", releaseYear=" + releaseYear +
                '}';
    }
}
