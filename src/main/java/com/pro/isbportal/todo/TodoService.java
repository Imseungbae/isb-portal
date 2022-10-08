package com.pro.isbportal.todo;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TodoService {

    private final TodoRespository todoRespository;

    public List<TodoVO> getTodoList() {
        return todoRespository.getTodoList();
    }

    public String saveTodo(TodoVO todoVO) {
        int result = todoRespository.saveTodo(todoVO);

        if(result<1){
            return "FAIL";
        }
        return "SUCCESS";
    }

    public String editTodo(TodoVO todoVO) {
        int result = todoRespository.editTodo(todoVO);

        if(result<1){
            return "FAIL";
        }
        return "SUCCESS";
    }

    public String removeTodo(int seq_no) {
        int result = todoRespository.removeTodo(seq_no);

        if(result<1){
            return "FAIL";
        }
        return "SUCCESS";
    }
}
