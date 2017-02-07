package com.zpq.cloud.client;

import com.zpq.cloud.model.Branding;
import feign.Param;
import org.springframework.stereotype.Component;

/**
 * Created by zhaopengqing on 2/6/2017.
 */

@Component
public class HystrixClientFallback implements FeignBrandingClient {
    @Override
    public Branding getBrandingByDomain(String domain) {
        return new Branding("default feign", 0l);
    }
}
