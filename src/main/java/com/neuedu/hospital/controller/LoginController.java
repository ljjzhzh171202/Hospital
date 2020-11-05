package com.neuedu.hospital.controller;

import com.neuedu.hospital.pojo.Login;
import com.neuedu.hospital.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/login")
public class LoginController {
    @Autowired
    private LoginService loginService;

    @RequestMapping(value = "/userLogin",method = RequestMethod.POST)
    @ResponseBody
    public Login userLogin(@RequestBody Login login){

        String username = login.getUsername();
        String password = login.getPassword();

        System.out.println("用户名："+username+"密码："+ password);
        return loginService.checkLogin(username,password);
    }


    @RequestMapping("/logout")
    @ResponseBody
    public String logout(HttpServletRequest request, HttpServletResponse response,
                         HttpSession session, Model model) {
        if(session != null){
            session.invalidate();
        }
        return "success";
    }
}
