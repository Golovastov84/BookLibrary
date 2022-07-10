package main;


import main.response.Book;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

//    private final BookRepository bookRepository;

    // Рекомендуемый вариант внедрения зависимости:
    // внедрение зависимости в класс через конструктор
//    public BookController(BookRepository bookRepository) {
//        this.bookRepository = bookRepository;
//    }

    //@GetMapping("/books/")
@RequestMapping(value = "/books/", method = RequestMethod.GET)
    public List<Book> list() {
        return Storage.getAllBooks();
        /*Iterable<Book> bookIterable = bookRepository.findAll();

        List<Book> books = new ArrayList<>();
        for (Book book : bookIterable) {
            books.add(book);
        }
        return books;*/
    }

    //@PostMapping("/books/")
@RequestMapping(value = "/books/", method = RequestMethod.POST)
    public int add(Book book) {
//        Book newBook = bookRepository.save(book);
        return Storage.addBook(book);
    }

    /*@GetMapping("/books/{id}")
    public ResponseEntity<?> get(@PathVariable int id) {
        Optional<Book> optionalBook = bookRepository.findById(id);

        if (!optionalBook.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }

        return new ResponseEntity<>(optionalBook.get(), HttpStatus.OK);
    }*/
}
