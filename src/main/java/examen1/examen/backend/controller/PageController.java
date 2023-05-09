package examen1.examen.backend.controller;

import examen1.examen.backend.Service.BookService;
import examen1.examen.backend.model.Book;
import examen1.examen.backend.repository.BookRepository;
import examen1.examen.backend.Service.DbInitialization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class PageController {

    @Autowired
    private BookRepository bookRepository;


    @Autowired
    private BookService bookService;

    @GetMapping("/")
    public String setMainPage(Model model){

        return "formBookSearch";
    }

    @PostMapping("/findBooks")
    public String findBooks(Model model, @RequestParam String name){
        List<Book> books= bookService.findBooksByName(name);
        boolean finded= false;
        if(books.size()==0){
            finded=true;
        }
        model.addAttribute("books",books);
        model.addAttribute("notFinded",finded);
        return "books";
    }





}
