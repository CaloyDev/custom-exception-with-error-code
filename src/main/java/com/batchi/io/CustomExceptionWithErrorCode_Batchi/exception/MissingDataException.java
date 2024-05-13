package com.batchi.io.CustomExceptionWithErrorCode_Batchi.exception;

public class MissingDataException extends ServiceException{
    public MissingDataException(String msg) {
        super(msg);
    }

    public MissingDataException(ErrorCode errorCode, String message) {
        super(errorCode, message);
    }

    public MissingDataException(String message, Throwable cause) {
        super(message, cause);
    }
}
