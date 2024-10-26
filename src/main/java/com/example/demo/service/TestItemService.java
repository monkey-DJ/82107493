package com.example.demo.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
@RequiredArgsConstructor
public class TestItemService {

    /**
     * user id 조회
     *
     * @return
     * @throws Exception
     */
    @Transactional
    public String gerUserId() throws Exception {

    	String userId;
    	userId = "82107493";
    	
        return userId;
    }

}
