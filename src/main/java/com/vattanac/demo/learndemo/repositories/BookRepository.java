package com.vattanac.demo.learndemo.repositories;

import com.vattanac.demo.learndemo.models.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
@Mapper
public interface BookRepository {
    @Select("SELECT * FROM tb_book b INNER JOIN tb_category c on b.cate_id=c.id")
    @Results(
            @Result(column = "name",property = "category.name")
    )
    List<Book> getAll();

}
