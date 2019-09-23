package com.smagin.jmeter.jmeter.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
public class User {
    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "name")
    private String name;

}
