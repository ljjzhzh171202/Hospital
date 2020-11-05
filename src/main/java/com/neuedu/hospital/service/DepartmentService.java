package com.neuedu.hospital.service;

import com.neuedu.hospital.pojo.Department;

import java.util.List;

public interface DepartmentService {
    //查询所有
    public List<Department> selectAll();
    //增加
    int insert(Department record);
    //删除
    int deleteByPrimaryKey(Integer departmentId);
    //修改
    int updateByPrimaryKey(Department record);
    //根据名称查询
    Department selectByname(String name);
}
