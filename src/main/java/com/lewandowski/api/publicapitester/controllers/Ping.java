package com.lewandowski.api.publicapitester.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")

public class Ping {

    @GetMapping(path = "/ping")
    public String getPing(){
        return "pong !" ;
    }
}
