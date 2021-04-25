package com.gokul.readium.model.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "users_id_seq")
    @SequenceGenerator(name = "users_id_seq",sequenceName = "users_id_seq",initialValue = 4,allocationSize = 1)
    private Long id;
    private String name;
    private String
}
