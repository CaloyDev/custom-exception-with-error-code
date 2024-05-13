package com.batchi.io.CustomExceptionWithErrorCode_Batchi.exception;

public class ConnectionErrorException extends ServiceException{
    public ConnectionErrorException(ErrorCode errorCode, String message) {
        super(errorCode, message);
    }
}
