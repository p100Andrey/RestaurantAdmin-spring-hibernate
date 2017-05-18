package myspring.model;

import javax.persistence.*;

@Entity
@Table(name = "book")
public class Book {

    @Id
    @Column(name = "idbook")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idbook;

    @Column(name = "bookname")
    private String bookname;

    @Column(name = "bookautor")
    private String bookautor;

    public int getIdbook() {
        return idbook;
    }

    public void setIdbook(int idbook) {
        this.idbook = idbook;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getBookautor() {
        return bookautor;
    }

    public void setBookautor(String bookautor) {
        this.bookautor = bookautor;
    }
}