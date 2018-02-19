package ru.itpark.news.services;

import lombok.SneakyThrows;
import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import ru.itpark.news.forms.AddBookForm;
import ru.itpark.news.forms.BookFormUpdate;
import ru.itpark.news.models.Book;
import ru.itpark.news.repositories.BookRepository;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.UUID;

@Service
public class AddBookServiceImpl implements AddBookService {


    @Autowired
    private BookRepository bookRepository;

    @Override
    public Long addBook(AddBookForm form) {


        Book newBook =  Book.builder()
                .autorBook(form.getAutorBook())
                .nameBook(form.getNameBook())
                .ageExit(form.getAgeExit())
                .gerne(form.getGerne())
                .build();

        bookRepository.save(newBook);

        return newBook.getId();
    }

    @Override
    public List<Book> getBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Book getBook(Long bookId) {
        return bookRepository.findOne(bookId);
    }

    @Override
    public void update(Long bookId, BookFormUpdate form) {
            Book book = bookRepository.findOne(bookId);
            form.update(book);
            bookRepository.save(book);
    }
    @Value(value = "${storage.path}")
    private String storagePath;
    @SneakyThrows
    public Long save(MultipartFile multipartFile, AddBookForm form) {
       Book book = Book.builder()
                .autorBook(form.getAutorBook())
                .nameBook(form.getNameBook())
                .ageExit(form.getAgeExit())
                .gerne(form.getGerne())
               .descriptionBook(form.getDescriptionBook())
                .originalName(multipartFile.getOriginalFilename())
                .size(multipartFile.getSize())
                .type(multipartFile.getContentType())
                .build();
        String newName = UUID.randomUUID().toString().replace("-","");
        String extension = multipartFile.getOriginalFilename()
                .substring(multipartFile.getOriginalFilename().lastIndexOf("."),
                        multipartFile.getOriginalFilename().length());
        book.setStorageName(newName + extension);
        book.setUrl(storagePath + "\\" + book.getStorageName());
        Files.copy(multipartFile.getInputStream(),
                Paths.get(storagePath, book.getStorageName()));
        bookRepository.save(book);

        return book.getId();
    }


    @SneakyThrows
    public void writeFileTOResponse(String fileName, HttpServletResponse response) {
        Book book = bookRepository.findOneByStorageName(fileName);
        response.setContentType(book.getType());
        InputStream inputStream = new FileInputStream(
                new File(book.getUrl()));
        IOUtils.copy(inputStream, response.getOutputStream());
        response.flushBuffer();
    }
    public List<Book> search(String q){
        return bookRepository.search(q);
    }



}
