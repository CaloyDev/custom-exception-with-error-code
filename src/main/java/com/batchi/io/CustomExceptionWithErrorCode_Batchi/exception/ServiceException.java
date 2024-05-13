package com.batchi.io.CustomExceptionWithErrorCode_Batchi.exception;

public class ServiceException extends RuntimeException{

    private ErrorCode errorCode;

    private static final long serialVersionUID = -7034897190745766939L;

    public ServiceException(String msg) {
        super(msg);
    }

    public ServiceException(ErrorCode errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }

    public ServiceException(String message, Throwable cause) {
        super(message, cause);
    }

    public ErrorCode getErrorCode() {
        return errorCode;
    }

}
