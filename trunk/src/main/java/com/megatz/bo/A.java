package com.megatz.bo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Connection;

@Getter
@Setter
public class A {

    private B b;
    @Autowired
    private Connection connection;




}