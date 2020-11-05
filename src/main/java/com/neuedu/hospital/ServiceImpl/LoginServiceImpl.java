package com.neuedu.hospital.ServiceImpl;

import com.neuedu.hospital.mapper.LoginMapper;
import com.neuedu.hospital.pojo.Department;
import com.neuedu.hospital.pojo.DepartmentExample;
import com.neuedu.hospital.pojo.Login;
import com.neuedu.hospital.pojo.LoginExample;
import com.neuedu.hospital.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private LoginMapper loginMapper;

    @Override
    public Login checkLogin(String username, String password) {
        LoginExample loginExample=new LoginExample();
        LoginExample.Criteria criteria=loginExample.createCriteria();
        criteria.andUsernameEqualTo(username).andPasswordEqualTo(password);
        List<Login> list=loginMapper.selectByExample(loginExample);
        if(list.size()>0){
            return list.get(0);
        }
        return null;
    }

    @Override
    public List<Login> selectByExample(LoginExample example) {
        return loginMapper.selectByExample(example);
    }

    @Override
    public Login selectByName(String name) {
        return loginMapper.selectByName(name);
    }

    @Override
    public int insert(Login record) {
        return loginMapper.insert(record);
    }

    @Override
    public List<Login> selectAll() {
        LoginExample loginExample=new LoginExample();
        LoginExample.Criteria criteria=loginExample.createCriteria();
        criteria.andIdIsNotNull();
        List<Login> list=loginMapper.selectByExample(loginExample);
        return list;
    }

    @Override
    public int updateByPrimaryKey(Login record) {
        return loginMapper.updateByPrimaryKey(record);
    }
}
