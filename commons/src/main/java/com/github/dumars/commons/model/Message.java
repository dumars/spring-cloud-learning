package com.github.dumars.commons.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Message implements Serializable {

    private String subject;
    private String content;
    private String senderId;
    private Date creationDate;

}
