package examen1.examen.backend.Service;

import examen1.examen.backend.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import examen1.examen.backend.model.Book;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> findBooksByName(String name){
        List<Book> allBooks = bookRepository.findAll();
        List<Book> auxBooks = new ArrayList<>();
        if(allBooks.size()!=0){
            for(Book book: allBooks){
                if(book.getName().contains(name)){
                    auxBooks.add(book);
                }
            }
        }


        return auxBooks;
    }

}
