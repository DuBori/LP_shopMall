package com.LeePark.shop.domain.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Member {

    private String id;
    private String password;
    private String name;
    private Timestamp createDate;
    private Timestamp modifyDate;
}
