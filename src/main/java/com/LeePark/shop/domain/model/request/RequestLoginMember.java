package com.LeePark.shop.domain.model.request;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class RequestLoginMember {

    private String id;
    private String password;

}
