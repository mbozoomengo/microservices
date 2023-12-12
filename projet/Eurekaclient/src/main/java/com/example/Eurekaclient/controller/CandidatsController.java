package com.example.Eurekaclient.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class CandidatsController {

    @RequestMapping("/candidats")
    public String candidats() {
        return "/monster-html/candidats";
    }
}
