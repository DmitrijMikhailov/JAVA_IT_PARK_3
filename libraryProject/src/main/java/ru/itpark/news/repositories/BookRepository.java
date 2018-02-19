package ru.itpark.news.repositories;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.itpark.news.models.Book;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
    @Override
    List<Book> findAll();
    Book findByAutorBook(String AutorBook);
    List<Book> findBookByOrderById();
    List<Book> findBookByOrderByNameBook();
    Book findOneByStorageName(String fileName);

    @Query("from Book book where book.gerne like ?1 or book.autorBook like ?1 or book.nameBook like ?1")
    List<Book> search(String value);

}
