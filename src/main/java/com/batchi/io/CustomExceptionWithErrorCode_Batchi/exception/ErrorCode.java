package com.batchi.io.CustomExceptionWithErrorCode_Batchi.exception;

public enum ErrorCode {

    ERR0R_CONNECTION_ERROR(506),

    ERROR_WRONG_PASSWORD(401),

    ERR0R_MISSING_DATA(409);

    private final int code;

    ErrorCode(int code) {
        this.code = code;
    }

    public int getCode() {
        return this.code;
    }

}
