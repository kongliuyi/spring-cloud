package net.riking.springcloud.provider.controller;

import net.riking.springcloud.provider.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user/provider")
public class UserProviderController {

    @GetMapping
    public User provider(@RequestParam String username) {
        User user = new User();
        user.setUsername(username);
        user.setPassword("provider-eureka7001");
        user.setDescription("注册服务提供者");
        return  user ;
    }
}
