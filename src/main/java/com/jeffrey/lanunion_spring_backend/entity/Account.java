package com.jeffrey.lanunion_spring_backend.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    private String id;
    private String userEmail;
    private String userName;
    private String userPassword;
    private Date registerDatetime;
}
