package com.pro.isbportal.todo;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/todo")
public class TodoController {

    private final TodoService todoService;

    /**
     * todo객체 목록조회
     * @return
     */
    @GetMapping("/list")
    public ResponseEntity<?> getTodoList(){
        List<TodoVO> todoList = todoService.getTodoList();
        log.info("###########[todoList : {}]", todoList);
        return ResponseEntity.ok(todoList);
    }

    /**
     * todo객체 수정
     * @param todoVO
     * @return
     */
    @PostMapping("/{seq_no}")
    public ResponseEntity<?> editTodo(@PathVariable int seq_no, @RequestBody TodoVO todoVO){
        todoVO.setSeq_no(seq_no);
        log.info("###########[todoVO: {}]", todoVO);
        String result = todoService.editTodo(todoVO);
        return ResponseEntity.ok(result);
    }

    /**
     * todo객체 저장
     * @param todoVO
     * @return
     */
    @PostMapping("/")
    public ResponseEntity<?> saveTodo(@RequestBody TodoVO todoVO) {
        log.info("###########[Request Data : {}]", todoVO);
        String result = todoService.saveTodo(todoVO);
        log.info("###########[result : {}]", result);
        return ResponseEntity.ok(result);
    }

    /**
     * todo객체 삭제
     * @param seq_no
     * @return
     */
    @DeleteMapping("/{seq_no}")
    public ResponseEntity<?> removeTodo(@PathVariable int seq_no){
        log.info("###########[seq_no: {}]", seq_no);
        String result = todoService.removeTodo(seq_no);
        return ResponseEntity.ok(result);
    }
}
