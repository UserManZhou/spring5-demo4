package com.gec.spring5.entity;

import lombok.*;
import org.springframework.stereotype.Component;

@Setter
@Getter
@ToString
@Component(value = "User")
public class User {
    private String name;
}
