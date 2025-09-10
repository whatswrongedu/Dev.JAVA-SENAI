package com.example.telas.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Teste {

 
    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/cadastro")
    public String cadastro(){
        return "cadastro";
    }
}
