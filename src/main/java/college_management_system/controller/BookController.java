package college_management_system.controller;

import college_management_system.model.BookM;
import college_management_system.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService service;

    @PostMapping
    public BookM createBook(@RequestBody BookM book) {
        return service.saveBook(book);
    }

    @GetMapping
    public List<BookM> getAllBooks() {
        return service.getAllBooks();
    }

    @GetMapping("/{id}")
    public BookM getBookById(@PathVariable String id) {
        return service.getBookById(id);
    }

    @PutMapping("/{id}")
    public BookM updateBook(@PathVariable String id,
                            @RequestBody BookM book) {
        book.setBookId(id);
        return service.updateBook(book);
    }

    @DeleteMapping("/{id}")
    public String deleteBook(@PathVariable String id) {
        service.deleteBook(id);
        return "Book deleted successfully";
    }
}