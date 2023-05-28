package com.LeePark.shop.bo.dao;

import com.LeePark.shop.bo.mapper.TestMapper;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
public class TestDao {

    private TestMapper testMapper;
    public boolean isMyMember() {
        return testMapper.isMyMember();
    }
}
