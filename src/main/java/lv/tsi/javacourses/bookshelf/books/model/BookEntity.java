package lv.tsi.javacourses.bookshelf.books.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "Book")
@Table(name = "books")
public class BookEntity implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name="title", length = 200, nullable = false)
    private String title;
    @Column(name="isbn", length = 50, nullable = false, unique = true)
    private String isbn;
    @Column(name="author", length = 200, nullable = false)
    private String author;
    @Column(name="year", nullable = false)
    private int year;
    @Column(name="description", length = 1000)
    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
