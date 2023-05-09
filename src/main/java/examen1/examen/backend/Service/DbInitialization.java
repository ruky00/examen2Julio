package examen1.examen.backend.Service;

import examen1.examen.backend.model.Book;
import examen1.examen.backend.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class DbInitialization {

    @Autowired
    private BookRepository bookRepository;

    @PostConstruct
    public void addBooks(){
        bookRepository.save(new Book("Java EE ",53));
        bookRepository.save(new Book("DAW examen ",34));
        bookRepository.save(new Book("El circo del sol ",93));
        bookRepository.save(new Book("El juego de Ender ",123));

    }

}
