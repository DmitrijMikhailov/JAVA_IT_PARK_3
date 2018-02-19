package ru.itpark.news.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import ru.itpark.news.forms.AddBookForm;
import ru.itpark.news.models.Book;
import ru.itpark.news.services.AddBookService;

import javax.servlet.http.HttpServletResponse;
import java.util.List;


@Controller
public class AddBookController {
    @Autowired
    private AddBookService service;

    @GetMapping("/addBook")
    public String getAddBookPage(){
        return "add_book_page";
    }

    @GetMapping(value = "/allBook")
    public String getBook(@ModelAttribute ("model") ModelMap model
                                                ){
        List<Book> books = service.getBooks();
        model.addAttribute("books", books);
        return "allBook";
    }

    @PostMapping(value = "/files")
    @ResponseStatus(value = HttpStatus.ACCEPTED)
    @ResponseBody
    public  Long handleFileUpload(@RequestParam("file") MultipartFile multipartFile,
                                  AddBookForm form) {
        return service.save(multipartFile,form);
    }
    @GetMapping("/files/{file-name:.+}")
    public void getFile(@PathVariable("file-name") String fileName,
                        HttpServletResponse response) {
        service.writeFileTOResponse(fileName, response);
    }
    @GetMapping("/search")
    public String search(@RequestParam("value") String value, @ModelAttribute("model") ModelMap model){
        List<Book> books = service.search(value);
        model.addAttribute("books", books);
        return "allBook";
    }
}
