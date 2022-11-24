package com.example.springapp1.controller;

import org.springframework.web.bind.annotation.*;

@RequestMapping("/contract")
@RestController
public class ContractController {

    @GetMapping("/retrieve-all")
    @ResponseBody
    public String retrieveAll() {
        return "retrieve all";
    }

    @GetMapping("/retrieve-one")
    @ResponseBody
    public String retrieveOne() {
        return "retrieve one";
    }

    @PostMapping("/create")
    @ResponseBody
    public String create() {
        return "create";
    }



}
