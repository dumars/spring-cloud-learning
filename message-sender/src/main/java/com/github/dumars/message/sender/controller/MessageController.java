package com.github.dumars.message.sender.controller;

import com.github.dumars.commons.constants.MessageSenderConstants;
import com.github.dumars.commons.model.Message;
import com.github.dumars.message.sender.feign.MessageClient;
import com.github.dumars.message.sender.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RefreshScope
@RestController
public class MessageController {

    @Autowired
    private MessageService messageService;
    @Autowired
    private MessageClient messageClient;

    @PostMapping(MessageSenderConstants.SEND_MESSAGE_URI)
    public Message sendMessage(String content) {
        return messageService.sendMessage(buildMessage(content));
    }

    @GetMapping(MessageSenderConstants.SEND_MESSAGE_URI)
    public Message sendMessageByFeign(String content) {
        return messageClient.sendMessage(buildMessage(content));
    }

    private Message buildMessage(String content) {
        Message message = new Message();
        message.setContent(content);
        message.setCreationDate(new Date());
        message.setSubject("test");
        message.setSenderId("dumars");
        return message;
    }
}
