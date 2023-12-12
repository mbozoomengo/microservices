package com.example.Eurekaclient.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NotificationsController {

    @RequestMapping("/notifications")
    public String notifications() {
        return "monster-html/notifications";
    }
}