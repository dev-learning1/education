package com.mobius.education.mapper;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class TimeMapperTest {
    @Autowired
    private TimeMapper timeMapper;

    @Test
    public void timeTest(){
        log.info("now: " + timeMapper.getTime());
    }
}
