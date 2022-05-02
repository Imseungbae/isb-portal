package com.pro.isbportal.model;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class OpenAPIData {
    @NonNull
    private DataHeader dataHeader;

    @NonNull
    private Object dataBody;
}
