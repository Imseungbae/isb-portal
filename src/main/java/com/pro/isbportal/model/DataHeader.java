package com.pro.isbportal.model;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class DataHeader {

    @NonNull
    private String gramCd;

    @NonNull
    private String companyCd;

}
