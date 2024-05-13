package com.batchi.io.CustomExceptionWithErrorCode_Batchi.controller;

import com.batchi.io.CustomExceptionWithErrorCode_Batchi.service.ErrorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestExceptionController {

    @Autowired
    private ErrorService errorService;

    @GetMapping("/connection-error")
    public void testException() {
        errorService.connectionError();
    }

    @GetMapping("/missing-data")
    public void testMissingData() {
        errorService.missingData();
    }
}
