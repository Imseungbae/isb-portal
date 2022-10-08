package com.pro.isbportal.todo;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface TodoRespository {
    List<TodoVO> getTodoList();
    int saveTodo(TodoVO todoVO);
    int editTodo(TodoVO todoVO);
    int removeTodo(int seq_no);

}
