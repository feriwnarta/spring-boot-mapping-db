package com.ferdev.belajarspringbootbuku.repository;

import com.ferdev.belajarspringbootbuku.entity.BookCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookCategoryRepository extends JpaRepository<BookCategory, Long> {
}
