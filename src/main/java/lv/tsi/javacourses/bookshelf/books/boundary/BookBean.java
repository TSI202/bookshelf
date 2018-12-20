package lv.tsi.javacourses.bookshelf.books.boundary;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.awt.print.Book;
import java.io.Serializable;
import java.util.List;

@Named
@SessionScoped
public class BookBean implements Serializable {

    @PersistenceContext
    private EntityManager em;

    public List<Book> getBooks() {
        return em.createQuery("select b from Book b", Book.class).getResultList();
    }

}
