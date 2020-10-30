package com.online.shop.auth.api.feign;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;

@EnableFeignClients
@FeignClient("user-auth")
public interface RemoteAuthService {
}
