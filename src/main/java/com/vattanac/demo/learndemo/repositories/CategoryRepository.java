package com.vattanac.demo.learndemo.repositories;

import com.vattanac.demo.learndemo.models.Book;
import com.vattanac.demo.learndemo.models.Category;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface CategoryRepository {

    @Select("select * from tb_category")
    List<Category> getAll();

}
