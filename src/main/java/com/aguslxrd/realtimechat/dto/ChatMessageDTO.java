package com.aguslxrd.realtimechat.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ChatMessageDTO {

    private String message;
    private String username;
}
