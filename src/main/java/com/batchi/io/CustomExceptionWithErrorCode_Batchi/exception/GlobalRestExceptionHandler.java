package com.batchi.io.CustomExceptionWithErrorCode_Batchi.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;

@RestControllerAdvice

public class GlobalRestExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler({ServiceException.class})
    public ResponseEntity<ApiErrorResponse> handleServiceException(ServiceException ex, WebRequest request) {

        ApiErrorResponse response = ApiErrorResponse.builder()
                .errorCode(ex.getErrorCode().getCode())
                .path(request.getDescription(false))
                .message(ex.getMessage())
                .timestamp(LocalDateTime.now())
                .build();

        switch (ex.getErrorCode()) {
            case ERR0R_CONNECTION_ERROR:
                return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
            case ERR0R_MISSING_DATA:
                return new ResponseEntity<>(response, HttpStatus.NO_CONTENT);
            default:
                return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }


    }



}
