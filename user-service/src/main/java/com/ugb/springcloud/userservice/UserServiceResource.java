package com.ugb.springcloud.userservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/user/server")
public class UserServiceResource {

    @GetMapping
    public UserProfile user() {
    	UserProfile userProfile = new UserProfile();
    	userProfile.setUserName("Umesh");
    	userProfile.setEmail("umeshbongale@gmail.com");
    	userProfile.setPhone("9999999999");
        return userProfile;
    }
}