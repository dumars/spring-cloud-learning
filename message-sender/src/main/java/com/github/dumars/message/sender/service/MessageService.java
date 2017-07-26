package com.github.dumars.message.sender.service;

import com.github.dumars.commons.constants.MessageReceiverConstants;
import com.github.dumars.commons.model.Message;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class MessageService {

    @Autowired
    private RestTemplate restTemplate;
    
    @HystrixCommand(fallbackMethod = "errorSendMessage")
    public Message sendMessage(Message message) {
        return restTemplate.postForObject(MessageReceiverConstants.HOST + MessageReceiverConstants.RECEIVE_MESSAGE_URI, message, Message.class);
    }

    public Message errorSendMessage(Message message) {
        message.setSubject("error");
        message.setContent("retry later.");
        message.setSenderId("system");
        return message;
    }
}
