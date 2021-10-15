package com.ferdev.belajarspringbootbuku.entity;

import javax.persistence.*;

@Entity // jpa
@Table(name = "book")
public class Book {
    @Id // primary key
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "isbn", unique = true, nullable = false)
    private String isbn;

    @Column(name = "judul", nullable = false)
    private String title;

    @Column(name = "penulis", nullable = false)
    private String write;

    @ManyToOne  // jenis relasi
    @JoinColumn // tanda foreign key atau akan membut tabel foreign key
    private BookCategory bookCategory;

    public Book(String title, String write, String isbn) {
        this.isbn = isbn;
        this.title = title;
        this.write = write;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public BookCategory getBookCategory() {
        return bookCategory;
    }

    public void setBookCategory(BookCategory bookCategory) {
        this.bookCategory = bookCategory;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWrite() {
        return write;
    }

    public void setWrite(String write) {
        this.write = write;
    }
}
