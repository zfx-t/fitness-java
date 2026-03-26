package org.example.fitnessjava.advice;

import me.chanjar.weixin.common.error.WxErrorException;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(IllegalArgumentException.class)
    public String handleException(Exception e) {
        return "系统异常：" + e.getMessage();
    }
    @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
    public String handleMethodNotSupported(Exception e) {
        return "系统异常：" + e.getMessage();
    }
    @ExceptionHandler(HttpMessageNotReadableException.class)
    public String handleJsonError(Exception e) {
        return "系统异常：" + e.getMessage();
    }
    @ExceptionHandler(WxErrorException.class)
    public String handleWXError(Exception e) {
        return "系统异常：" + e.getMessage();
    }
}
