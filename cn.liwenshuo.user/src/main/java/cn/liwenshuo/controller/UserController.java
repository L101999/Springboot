package cn.liwenshuo.controller;

import cn.liwenshuo.pojo.user;
import cn.liwenshuo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("show")
    public String show() {
        return "aaaa";
    }

    @GetMapping("{id}")
    public user queryUserById(@PathVariable("id")Long id){
        return this.userService.queryUserById(id);
    }
}
