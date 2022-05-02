package com.pro.isbportal.test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.pro.isbportal.dto.TestDto;
import com.pro.isbportal.model.DataHeader;
import com.pro.isbportal.model.OpenAPIData;

import java.util.Map;

public class Test {
    public static void main(String[] args) {
        DataHeader header = new DataHeader("0001", "0002");
        String body = "test";

        OpenAPIData oaData = new OpenAPIData(header, body);

        ObjectMapper mapper = new ObjectMapper();

        TestDto testDto = mapper.convertValue(header, TestDto.class);
        System.out.println("testDto: " + testDto);

        Map<?,?> map = mapper.convertValue(oaData, Map.class);

        for(Map.Entry item : map.entrySet()){
            System.out.println(item.getKey() + " : " + item.getValue());
        }
    }
}
