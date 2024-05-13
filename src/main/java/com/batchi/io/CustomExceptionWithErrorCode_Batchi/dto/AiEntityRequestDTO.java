package com.batchi.io.CustomExceptionWithErrorCode_Batchi.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class AiEntityRequestDTO {

    private List<AiEntityMessageDTO> messages;

}
