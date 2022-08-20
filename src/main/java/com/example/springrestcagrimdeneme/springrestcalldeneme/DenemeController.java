package com.example.springrestcagrimdeneme.springrestcalldeneme;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class DenemeController {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    // 8081den sunuyoruz, 8080den tüketiyoruz

    @GetMapping("/restcagir")
    List<Calisan> all() {

        ResponseEntity<Calisan[]> response = restTemplate().getForEntity("http://localhost:8081/employees",
                Calisan[].class);
        return Arrays.asList(response.getBody());

//        List list = new ArrayList<String>();
//
//        list.add("em");
//        list.add("dsa");
//        list.add("fdkjsh");
//
//        return list;
    }

}
