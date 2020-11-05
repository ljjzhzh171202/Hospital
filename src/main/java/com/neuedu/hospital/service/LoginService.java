package com.neuedu.hospital.service;

import com.neuedu.hospital.pojo.Department;
import com.neuedu.hospital.pojo.Login;
import com.neuedu.hospital.pojo.LoginExample;

import java.util.List;

public interface LoginService {
    //登录
    public Login checkLogin(String username, String password);
    public List<Login> selectByExample(LoginExample example);
    //根据姓名查询
    Login selectByName(String name);
    //添加
    int insert(Login record);
    //查询所有
    public List<Login> selectAll();
    //修改
    int updateByPrimaryKey(Login record);
}
