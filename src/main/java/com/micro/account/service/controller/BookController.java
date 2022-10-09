package com.micro.account.service.controller;

import com.micro.account.service.model.Book;
import com.micro.account.service.response.ApiOutput;
import com.micro.account.service.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@Cacheable
@CacheConfig(cacheNames = "book_cache")
@RequestMapping("/api/v1")
public class BookController {
    @Autowired
    BookService service;

    @GetMapping("/books")
    @Cacheable
    public List<Book> findAllBooks() {
        return service.findAllBook();
    }

    @GetMapping("/book/{id}")
    @Cacheable
    public Book findBookByID(@PathVariable("id") Long id) {
        return service.findBookByID(id);
    }

    @DeleteMapping("/book/{id}")
    @Cacheable
    public void deleteBook(@PathVariable("id") Long id) {
        service.deleteBookByID(id);
    }

    @PutMapping("/updateBook")
    @Cacheable
    public ApiOutput updateBook(@RequestBody @Valid Book b) {
        Book book = service.updateBook(b);
        ApiOutput output = new ApiOutput();
        output.setCode(200);
        output.setData(book);
        output.setResponse("Book updated successfully!");
        return output;
    }

    @PostMapping("/saveBook")
    @Cacheable
    public ApiOutput saveBook(@RequestBody @Valid Book b) {
        Book book = service.saveBok(b);
        ApiOutput output = new ApiOutput();
        output.setCode(200);
        output.setData(book);
        output.setResponse("Book saved successfully!");
        return output;
    }

}
