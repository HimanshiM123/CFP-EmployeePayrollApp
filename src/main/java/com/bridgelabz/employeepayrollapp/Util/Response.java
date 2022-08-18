package com.bridgelabz.employeepayrollapp.Util;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Response {
    private String message;
    private int errorCode;
    private Object token;


    public Response() {

    }

}
