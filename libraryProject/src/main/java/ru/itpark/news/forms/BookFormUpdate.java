package ru.itpark.news.forms;

import lombok.Data;
import ru.itpark.news.models.Book;

@Data
public class BookFormUpdate {
    private int ageExit;
    private String autorBook;
    private String gerne;
    private String nameBook;
    public void update(Book book){
        book.setAgeExit(this.ageExit);
        book.setAutorBook(this.autorBook);
        book.setGerne(this.gerne);
        book.setNameBook(this.nameBook);
    }
}
