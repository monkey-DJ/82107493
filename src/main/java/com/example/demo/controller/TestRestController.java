package com.example.demo.controller;

import com.example.demo.service.TestItemService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RequestMapping("/api/v1/*")
@RestController
public class TestRestController {

    private TestItemService testService;

    public TestRestController(TestItemService testService) {
        this.testService = testService;
    }

   
    /**
     * 사번(user id) 조회
     *
     * @return
     * @throws Exception 
     */
    @RequestMapping(value = "/user")
    public ResponseEntity<?> gerUserId() throws Exception {
        return ResponseEntity.ok(testService.gerUserId());
    }

 
}
