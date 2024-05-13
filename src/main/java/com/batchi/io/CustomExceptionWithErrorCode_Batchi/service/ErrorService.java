package com.batchi.io.CustomExceptionWithErrorCode_Batchi.service;

import com.batchi.io.CustomExceptionWithErrorCode_Batchi.exception.ConnectionErrorException;
import com.batchi.io.CustomExceptionWithErrorCode_Batchi.exception.ErrorCode;
import com.batchi.io.CustomExceptionWithErrorCode_Batchi.exception.MissingDataException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ErrorService {

    @Value("${error.connection.msg}")
    private String errorConnectionMsg;

    @Value("${error.missingdata.msg}")
    private String errorMissingDataMsg;

    public void connectionError() {
        throw new ConnectionErrorException(ErrorCode.ERR0R_CONNECTION_ERROR, errorConnectionMsg );
    }

    public void missingData() throws MissingDataException, ConnectionErrorException {
        boolean connectionStatus = true;

        if (!connectionStatus) {
            throw new ConnectionErrorException(ErrorCode.ERR0R_CONNECTION_ERROR, errorConnectionMsg );
        }

        throw new MissingDataException(ErrorCode.ERR0R_MISSING_DATA, errorMissingDataMsg );
    }


}
