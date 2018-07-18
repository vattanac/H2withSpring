package com.vattanac.demo.learndemo.repositories;

import com.vattanac.demo.learndemo.models.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
@Mapper
public interface BookRepository {

    @Select("SELECT * FROM tb_book")
    List<Book> getAll();
}
