package com.example.dao.mapper;

import com.example.dao.entity.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
public interface BookMapper {
    /**
     * 获取所有书籍
     * @return 书籍集合
     */
    @Select(value = "select * from book")
    List<Book> queryAll();

    /**
     * 根据id查询书籍
     * @param id
     * @return
     */
    Book queryBookById(Integer id);

    /**
     * 新增书籍
     * @param book
     * @return 影响行数
     */
    int saveBook(Book book);

}
