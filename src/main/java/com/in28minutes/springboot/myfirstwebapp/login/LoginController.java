package com.in28minutes.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
    //login
    @RequestMapping("login")
    public String gotoLoginPage() {
        return "login";
    }
}