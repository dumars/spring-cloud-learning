package com.github.dumars.message.receiver.controller;

import com.github.dumars.commons.constants.MessageReceiverConstants;
import com.github.dumars.commons.model.Message;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class MessageController {

    @PostMapping(MessageReceiverConstants.RECEIVE_MESSAGE_URI)
    public Message receivingMessage(@RequestBody Message message) {
        log.info("received message: {}", message);
        message.setSenderId("receiver");
        return message;
    }
}
