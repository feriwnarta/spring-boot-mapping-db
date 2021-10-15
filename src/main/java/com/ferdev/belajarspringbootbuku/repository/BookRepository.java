package com.ferdev.belajarspringbootbuku.repository;

import com.ferdev.belajarspringbootbuku.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
    // nama method cari harus sama dengan nama column di entity
    //             |
    //            dibawah ini
    @Override
    List<Book> findAll();
    List<Book> findAllByWrite(String penulis);
    Book findByIsbn(String isbn);
    Book findByTitle(String title);

    // native query jika tidak ada di jparepository
    @Query (
            nativeQuery = true,
            value = "select * from book"
    )
    List<Book> findAllNativeQuery();

    @Query (
            nativeQuery = true,
            value = "select * from book where penulis = ?"
    )
    List<Book> findALlByWriterNativeQuery(String writer);





}
