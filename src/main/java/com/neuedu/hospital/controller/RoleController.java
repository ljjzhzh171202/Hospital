package com.neuedu.hospital.controller;

import com.neuedu.hospital.pojo.Department;
import com.neuedu.hospital.pojo.Login;
import com.neuedu.hospital.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/role")
public class RoleController {
    @Autowired
    private LoginService loginService;
    //根据姓名查角色信息
    @PostMapping("/selectByName")
    @ResponseBody
    public Login selectByname(@RequestBody Login login){
        String name = login.getUsername();
        Login logins=loginService.selectByName(String.valueOf(name));
        return logins;
    }
    //添加角色
    @PostMapping("/addrole")
    @ResponseBody
    public String addrole(@RequestBody Login login){
        String username = login.getUsername();
        String role =login.getRole();
        String password = login.getPassword();

        login.setUsername(username);
        login.setRole(role);
        login.setPassword(password);
        int result = loginService.insert(login);
        if(result<0){
            return "添加失败";
        }
        return "添加成功";
    }
    //查询所有
    @RequestMapping("/getroleAll")
    @ResponseBody
    public List<Login> getroleAll(){
        List<Login> loginList = loginService.selectAll();
        return loginList;
    }
    //修改
    @PostMapping(value = "/updaterole")
    @ResponseBody
    public String updaterole(@RequestBody Login login){
        Integer id = login.getId();
        String username = login.getUsername();
        String password = login.getPassword();
        String role = login.getRole();
        login.setUsername(username);
        login.setPassword(password);
        login.setRole(role);
        int result = loginService.updateByPrimaryKey(login);
        if(result<=0){
            return "修改失败!";
        }
        return "修改成功!";
    }
}
