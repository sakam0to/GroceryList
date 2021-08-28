package com.jacky.grocerylist.dict;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DefaultServiceResult<T> {

    private Integer code = 200;

    private T data;
    private String message = "OK";

    private String requestID;

    private String status = "success";

    public DefaultServiceResult() {

    }

    public DefaultServiceResult(T data) {
        this(data, null);
    }

    public DefaultServiceResult(T data, String requestID) {
        this.requestID = requestID;


        this.data = data;
    }

    public DefaultServiceResult(String requestID) {
        this.requestID = requestID;
    }


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getRequestID() {
        return requestID;
    }

    public void setRequestID(String requestID) {
        this.requestID = requestID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return this.getCode() + this.getMessage() + this.getData() + this.getStatus();
    }
}
