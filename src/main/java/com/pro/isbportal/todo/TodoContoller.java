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
public class TodoContoller {

    private final TodoService todoService;

    /**
     * todoList를 반환한다.
     * @return
     */
    @GetMapping("/list")
    public ResponseEntity<?> todoList(){
        List<TodoVO> todoList = todoService.getTodoList();
        log.info("##################################");
        log.info("[todoList : {}]", todoList);
        return ResponseEntity.ok(todoList);
    }

    /**
     * todo를 저장한다.
     * @param todoVO
     * @return
     */
    @PostMapping("/")
    public ResponseEntity<?> todo(@RequestBody TodoVO todoVO) {
        log.info("[Request Data : {}]", todoVO);
        String result = todoService.saveTodo(todoVO);
        log.info("[result : {}]", result);
        return ResponseEntity.ok(result);
    }

    @DeleteMapping("/{seq_no}")
    public ResponseEntity<?> todo(@PathVariable int seq_no){
        log.info("seq_no: {}", seq_no);
        String result = todoService.removeTodo(seq_no);
        return ResponseEntity.ok(result);
    }
}
