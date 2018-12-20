package lv.tsi.javacourses.bookshelf.books.boundary;

import lv.tsi.javacourses.bookshelf.books.model.BookEntity;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;
import java.util.List;

@Named
@SessionScoped
public class BookBean implements Serializable {

    @PersistenceContext
    private EntityManager em;

    public List<BookEntity> getBooks() {
        return em.createQuery("select b from Book b", BookEntity.class).getResultList();
    }

}
