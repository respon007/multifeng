package com.example.web;

import com.example.dao.entity.Book;
import com.example.dao.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class BookController {
    @Autowired
    private BookMapper bookMapper;

    @RequestMapping(value = "/queryAll", method = RequestMethod.GET)
    @ResponseBody
    public List<Book> queryAll() {
        return bookMapper.queryAll();
    }

    @RequestMapping(value = "/queryOne", method = RequestMethod.GET)
    @ResponseBody
    public Book queryBookById(Integer id) {
        return bookMapper.queryBookById(id);
    }

    @RequestMapping(value = "/saveBook", method = RequestMethod.POST)
    @ResponseBody
    public String saveBook(Integer id, String name, String author, Float price) {
        Book book = new Book();
        book.setId(id);
        book.setName(name);
        book.setAuthor(author);
        book.setPrice(price);
        int result = bookMapper.saveBook(book);
        if (result > 0) {
            return "新增成功-id:" + book.getId();
        } else {
            return "新增失败";
        }
    }
}
