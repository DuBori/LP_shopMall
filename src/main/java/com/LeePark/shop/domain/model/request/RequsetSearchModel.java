package com.LeePark.shop.domain.model.request;

import com.LeePark.shop.domain.model.entity.Member;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class RequsetSearchModel {

    private String id;

    public Member toEntity(){
        return new Member(id);
    }
}
