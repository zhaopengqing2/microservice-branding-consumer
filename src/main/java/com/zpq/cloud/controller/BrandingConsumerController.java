package com.zpq.cloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.zpq.cloud.client.FeignBrandingClient;
import com.zpq.cloud.model.Branding;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@RestController
public class BrandingConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    //using Ribbon API directly
    @Autowired
    private FeignBrandingClient feignBrandingClient;

    @GetMapping("/branding/domain/{domain}")
    @HystrixCommand(fallbackMethod = "getBrandingByDomainFallback")
    //@HystrixCommand(fallbackMethod = "getBrandingByDomainFallback", commandProperties = @HystrixProperty(name= "execution.isolation.strategy", value="SEMAPHORE"))
    public Branding getBrandingByDomain(@PathVariable String domain){
        return this.restTemplate.getForObject("http://microservice-branding-provider/branding/getBrandings/domain/" + domain, Branding.class);
    }

    public Branding getBrandingByDomainFallback(String domain){
        Branding branding = new Branding("default", 0l);
        return branding;
    }

    @GetMapping("/test")
    public String test() {
        ServiceInstance serviceInstance = this.loadBalancerClient.choose("microservice-provider-user");
        System.out.println(serviceInstance.getServiceId() + ":" + serviceInstance.getHost() + ":" + serviceInstance.getPort());
        URI uri = URI.create(String.format("http://%s:%s", serviceInstance.getHost(), serviceInstance.getPort()));

        return "sucesss";
    }

    @GetMapping("/feign/branding/domain/{domain}")
    public Branding getFeignBrandingByDomain(@PathVariable String domain) {
        return this.feignBrandingClient.getBrandingByDomain(domain);
    }
}
