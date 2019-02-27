package com.ugb.springcloud.userclient;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/rest/user/client")
public class UserClientResource {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private UserProfile userProfile;

    @HystrixCommand(fallbackMethod = "fallback", groupKey = "User",
            commandKey = "user",
            threadPoolKey = "helloThread"
            )
    @GetMapping
    public UserProfile user() {
        String url = "http://user-service/rest/user/server";
        return restTemplate.getForObject(url, UserProfile.class);
    }

    public UserProfile fallback(Throwable hystrixCommand) {
        return userProfile;
    }

}
