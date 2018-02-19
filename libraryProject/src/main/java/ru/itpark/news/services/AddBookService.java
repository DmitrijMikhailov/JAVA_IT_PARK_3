package ru.itpark.news.services;

import org.springframework.core.io.Resource;
import org.springframework.security.core.Authentication;
import org.springframework.web.multipart.MultipartFile;
import ru.itpark.news.forms.AddBookForm;
import ru.itpark.news.forms.BookFormUpdate;
import ru.itpark.news.forms.NamesForm;
import ru.itpark.news.models.Book;

import javax.servlet.http.HttpServletResponse;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

public interface AddBookService {
    Long addBook(AddBookForm form);
    List<Book> getBooks();

    Book getBook(Long bookId);

    void update(Long bookId, BookFormUpdate form);

    Long save( MultipartFile multipartFile, AddBookForm form);
    void writeFileTOResponse(String fileName, HttpServletResponse response);

    List<Book> search(String value);
}
