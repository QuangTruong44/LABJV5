package com.poly.demo01.API;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HomeApi {
    @GetMapping("/getInformation")
    public ResponseEntity<?> doGetInformation(@RequestParam("ten")String name,
                                              @RequestParam("tuoi")String age) {
        Map<String,String> result = new HashMap<String,String>();
        result.put("ten",name);
        result.put("tuoi", age);
        result.put("Lop","Java5");
        return ResponseEntity.ok(result);

    }
    @GetMapping("/getInformationWithPathVariable/{name}")
    public ResponseEntity<?> doGetInformationWithPathVariable(@PathVariable String name){

        return ResponseEntity.ok(name);
    }
}
