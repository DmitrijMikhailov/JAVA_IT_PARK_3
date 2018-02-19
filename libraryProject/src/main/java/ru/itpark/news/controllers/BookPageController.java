package ru.itpark.news.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import ru.itpark.news.forms.BookFormUpdate;
import ru.itpark.news.models.Book;
import ru.itpark.news.services.AddBookService;

@Controller
public class BookPageController {

    @Autowired
    private AddBookService service;

    @GetMapping("/book/{book-id}")
    public String getBookPage(@ModelAttribute("model") ModelMap model,
                              @PathVariable("book-id") Long bookId) {
        Book book = service.getBook(bookId);
        model.addAttribute("book", book);
        return "book_page";
    }

    @PostMapping("/book/{book-id}")
    @ResponseBody
    public ResponseEntity<Object> updateBook(@PathVariable("book-id") Long bookId,
                                             BookFormUpdate form) {
        service.update(bookId, form);
        return ResponseEntity.accepted().build();
    }


}
