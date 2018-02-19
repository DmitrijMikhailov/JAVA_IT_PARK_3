package ru.itpark.news.forms;


import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class AddBookForm {

    private String nameBook;
    private String autorBook;
    private String gerne;
    private int ageExit;
    private String descriptionBook;
}
