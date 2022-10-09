package com.micro.account.service.response;


import lombok.Data;

import java.io.Serializable;

@Data
public class ApiOutput implements Serializable {
    private Integer code;
    private String response;
    private Object data;
}

