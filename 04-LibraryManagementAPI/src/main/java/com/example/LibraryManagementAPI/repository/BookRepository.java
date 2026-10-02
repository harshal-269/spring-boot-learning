package com.example.LibraryManagementAPI.repository;

import com.example.LibraryManagementAPI.entity.Book;
import org.springframework.boot.jackson.autoconfigure.JacksonProperties;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
