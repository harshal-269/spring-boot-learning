package com.example.LibraryManagementAPI.controller;

import com.example.LibraryManagementAPI.dto.BookRequestDTO;
import com.example.LibraryManagementAPI.dto.BookResponseDTO;
import com.example.LibraryManagementAPI.service.BookService;

import jakarta.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    // CREATE
    @PostMapping
    public ResponseEntity<BookResponseDTO> createBook(
            @Valid @RequestBody BookRequestDTO dto) {

        BookResponseDTO response = bookService.createBook(dto);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(response);
    }

    // GET ALL
    @GetMapping
    public ResponseEntity<List<BookResponseDTO>> getAllBooks() {

        List<BookResponseDTO> books = bookService.getAllBooks();

        return ResponseEntity.ok(books);
    }

    // GET BY ID
    @GetMapping("/{id}")
    public ResponseEntity<BookResponseDTO> getBookById(
            @PathVariable Long id) {

        BookResponseDTO book = bookService.getBookById(id);

        return ResponseEntity.ok(book);
    }

    // UPDATE
    @PutMapping("/{id}")
    public ResponseEntity<BookResponseDTO> updateBook(
            @PathVariable Long id,
            @Valid @RequestBody BookRequestDTO dto) {

        BookResponseDTO updatedBook =
                bookService.updateBook(id, dto);

        return ResponseEntity.ok(updatedBook);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBook(
            @PathVariable Long id) {

        bookService.deleteBook(id);

        return ResponseEntity.noContent().build();
    }
}