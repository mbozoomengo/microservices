package com.example.Eurekaclient.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NotesController {

    @RequestMapping("/notes")
    public String notes() {
        return "monster-html/notes";
    }
}
