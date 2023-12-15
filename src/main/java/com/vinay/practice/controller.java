package com.vinay.practice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;





@RestController
@RequestMapping("Controller")
public class controller {
    
    @PostMapping("path")
    public String postMethodName(@RequestBody String entity) {
        //TODO: process POST request
        
        return "entity";
    }
    
    @PutMapping("path/{id}")
    public SomeEnityData putMethodName(@PathVariable String id, @RequestBody SomeEnityData entity) {
        //TODO: process PUT request
        
        return entity;
    }

    @GetMapping("path")
    public SomeData getMethodName(@RequestParam String param) {
        return new SomeData();
    }

    @PutMapping("path/{id}")
    public SomeEnityData putMethodName(@PathVariable String id, @RequestBody SomeEnityData entity) {
        //TODO: process PUT request
        
        return entity;
    }

    

    
    
    

}
