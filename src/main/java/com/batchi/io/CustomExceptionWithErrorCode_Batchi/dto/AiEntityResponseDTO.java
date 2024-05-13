package com.batchi.io.CustomExceptionWithErrorCode_Batchi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AiEntityResponseDTO {

    private String text;
    private String role;

}
