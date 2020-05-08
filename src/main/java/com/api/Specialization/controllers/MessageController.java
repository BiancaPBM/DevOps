package com.api.Specialization.controllers;

import com.api.Specialization.models.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
@MessageMapping("/chat.addUser")
@SendTo("/questions/public")
public class MessageController {

    public Message sendMessage(@Payload Message message){
        return message;
    }
}
