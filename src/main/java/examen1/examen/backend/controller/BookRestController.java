package examen1.examen.backend.controller;


import examen1.examen.backend.Service.BookService;
import examen1.examen.backend.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookRestController {

    @Autowired
    private BookService bookService;
    //GetBooks

    @GetMapping("/api/books")
    public ResponseEntity<List<Book>> findBooks(@RequestParam String name){
           List<Book> books = bookService.findBooksByName(name);
           if(books.size()!=0) {
               return new ResponseEntity<>(books, HttpStatus.OK);
           }
           return new ResponseEntity<>(HttpStatus.NOT_FOUND);

    }

}
