package com.batchi.io.CustomExceptionWithErrorCode_Batchi.controller;

import com.batchi.io.CustomExceptionWithErrorCode_Batchi.dto.AiEntityRequestDTO;
import com.batchi.io.CustomExceptionWithErrorCode_Batchi.dto.AiEntityResponseDTO;
import com.batchi.io.CustomExceptionWithErrorCode_Batchi.dto.AiTextResponse;
import com.batchi.io.CustomExceptionWithErrorCode_Batchi.model.AiEntity;
import com.batchi.io.CustomExceptionWithErrorCode_Batchi.service.AiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/ai")
public class AiController {

    @Autowired
    private AiService aiService;

    @PostMapping("/message")
    public List<AiEntityResponseDTO> saveMessage(@RequestBody AiEntityRequestDTO message) {
        return aiService.saveAiMessage(message);
    }

    @PostMapping("/get-text")
    public AiTextResponse respondWithText(@RequestBody AiEntityRequestDTO message) {
        return aiService.getText(message);
    }


}
