package com.zpq.cloud.controller;

import com.zpq.cloud.model.Branding;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class BrandingConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/branding/domain/{domain}")
    public Branding getBrandingByDomain(@PathVariable String domain){
        return this.restTemplate.getForObject("http://microservice-branding-provider/branding/getBrandings/domain/" + domain, Branding.class);
    }
}
