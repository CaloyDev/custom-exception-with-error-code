package com.batchi.io.CustomExceptionWithErrorCode_Batchi.exception;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ApiErrorResponse {

    private String path;
    private String message;
    private int errorCode;
    private LocalDateTime timestamp;

}
