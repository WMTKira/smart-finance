package com.wmt.smartfinance.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wmtumanday
 */
@RestController
@RequestMapping(value ="/smart/finance")
public class TestController {

    @RequestMapping("/test")
    public String test() {
        return "Finance API";
    }
}
