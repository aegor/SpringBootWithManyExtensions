package microtest.domain.model;

//
// This file was generated by the JPA Modeler
//

import java.io.Serializable;

public class FilmCategoryPK implements Serializable {

    private Long filmId;

    private Long categoryId;

    public FilmCategoryPK() {

    }

    public Long getFilmId() {
        return this.filmId;
    }

    public void setFilmId(Long filmId) {
        this.filmId = filmId;
    }

    public Long getCategoryId() {
        return this.categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + this.filmId.intValue();
        hash = 59 * hash + this.categoryId.intValue();
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final FilmCategoryPK other = (FilmCategoryPK) obj;
        if (this.filmId != other.filmId) {
            return false;
        }
        if (this.categoryId != other.categoryId) {
            return false;
        }
        return true;
    }

}