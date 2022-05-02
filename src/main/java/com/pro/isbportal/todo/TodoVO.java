package com.pro.isbportal.todo;

import lombok.Data;
import org.apache.ibatis.type.Alias;

@Data
public class TodoVO {

    private int seq_no;
    private String content;
    private String created_at;
    private String updated_at;
    private String author;

}
