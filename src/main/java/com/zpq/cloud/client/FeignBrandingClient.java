package com.zpq.cloud.client;

import com.zpq.cloud.model.Branding;
import com.zpq.config.AuthFeignConfiguration;
import com.zpq.config.FeignConfiguration;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "microservice-branding-provider", configuration = FeignConfiguration.class, fallback = HystrixClientFallback.class)
//@FeignClient(name = "name", url = "http://localhost:8761/", configuration = AuthFeignConfiguration.class)
public interface FeignBrandingClient {

//    @RequestMapping(value = "/branding/getBrandings/domain/{domain}", method = RequestMethod.GET)
//    public Branding getBrandingByDomain(@PathVariable("domain") String domain);

    @RequestLine("GET /branding/getBrandings/domain/{domain}")
    public Branding getBrandingByDomain(@Param("domain") String domain);




}
