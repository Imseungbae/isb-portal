package com.pro.isbportal.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
public class TestDto {
    private String gramCd;
    private String companyCd;

    public TestDto(){}

    public TestDto(String gramCd, String companyCd) {
        this.gramCd = gramCd;
        this.companyCd = companyCd;
    }
}
