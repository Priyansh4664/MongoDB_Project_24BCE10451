package college_management_system.service;

import college_management_system.model.BookM;
import college_management_system.repository.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepo repo;

    public BookM saveBook(BookM book) {
        return repo.save(book);
    }

    public List<BookM> getAllBooks() {
        return repo.findAll();
    }

    public BookM getBookById(String id) {
        return repo.findById(id).orElse(null);
    }

    public BookM updateBook(BookM book) {
        return repo.save(book);
    }

    public void deleteBook(String id) {
        repo.deleteById(id);
    }
}