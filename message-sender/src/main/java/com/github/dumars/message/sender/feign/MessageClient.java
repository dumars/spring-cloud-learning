package com.github.dumars.message.sender.feign;

import com.github.dumars.commons.constants.MessageReceiverConstants;
import com.github.dumars.commons.model.Message;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(MessageReceiverConstants.SERVICE_NAME)
public interface MessageClient {

    @RequestMapping(value = MessageReceiverConstants.RECEIVE_MESSAGE_URI, method = RequestMethod.POST)
    Message sendMessage(@RequestBody Message message);
}
