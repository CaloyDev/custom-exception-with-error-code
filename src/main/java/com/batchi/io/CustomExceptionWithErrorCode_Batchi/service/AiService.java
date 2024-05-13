package com.batchi.io.CustomExceptionWithErrorCode_Batchi.service;

import com.batchi.io.CustomExceptionWithErrorCode_Batchi.dto.AiEntityRequestDTO;
import com.batchi.io.CustomExceptionWithErrorCode_Batchi.dto.AiEntityResponseDTO;
import com.batchi.io.CustomExceptionWithErrorCode_Batchi.dto.AiTextResponse;
import com.batchi.io.CustomExceptionWithErrorCode_Batchi.model.AiEntity;
import com.batchi.io.CustomExceptionWithErrorCode_Batchi.repository.AiEntityRepository;
import org.springframework.stereotype.Service;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

@Service
public class AiService {

    private AiEntityRepository aiEntityRepository;

    AiService (AiEntityRepository aiEntityRepository) {
        this.aiEntityRepository = aiEntityRepository;
    }

    public List<AiEntityResponseDTO> saveAiMessage(AiEntityRequestDTO aiEntityRequestDTO) {
        AiEntity aiEntityForUser = new AiEntity();
        AiEntity aiEntityForAi = new AiEntity();

        aiEntityForUser.setText(aiEntityRequestDTO.getMessages().get(0).getText());
        aiEntityForUser.setRole("user");
        aiEntityRepository.save(aiEntityForUser);

        aiEntityForAi.setText(aiEntityRequestDTO.getMessages().get(0).getText()+ " from ai");
        aiEntityForAi.setRole("ai");
        aiEntityRepository.save(aiEntityForAi);

        return aiEntityRepository.findAll().stream()
                .map(aiEntity -> {
                    AiEntityResponseDTO aiEntityResponseDTO = new AiEntityResponseDTO();
                    aiEntityResponseDTO.setText(aiEntity.getText());
                    aiEntityResponseDTO.setRole(aiEntity.getRole());
                    return aiEntityResponseDTO;
                }).toList();

    }

    public AiTextResponse getText(AiEntityRequestDTO aiEntityRequestDTO) {
        return new AiTextResponse(aiEntityRequestDTO.getMessages().get(0).getText());
    }





}
