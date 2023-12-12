package com.example.Eurekaclient.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InscriptionController {

    @RequestMapping("/inscription")
    public String inscription() {
        return "/monster-html/inscription";
    }
}
