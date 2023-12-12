package com.example.Eurekaclient.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EtudiantsController {

    @RequestMapping("/etudiants")
    public String etudiants() {
        return "/monster-html/etudiants";
    }
}
