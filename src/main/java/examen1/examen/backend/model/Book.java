package examen1.examen.backend.model;


import javax.persistence.*;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private long id;

    private String name;

    private int price;

    public int getPrice(){
        return price;
    }

    public void setPrice(){
        this.price=price;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book(){
    }

    public Book(String name,int price){
        this.name= name;
        this.price = price;
    }
}
