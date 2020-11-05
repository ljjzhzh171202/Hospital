package com.neuedu.hospital.service;

import com.neuedu.hospital.pojo.Doctor;

import java.util.List;

public interface DoctorService {
    //查询所有
    public List<Doctor> selectAll();
    //根据ID查询
    Doctor selectByPrimaryKey(Integer doctorId);
    //根据部门查询
    List<Doctor> selectBydepartment(Integer department);
    //根据姓名查询
    Doctor selectByNmae(String name);
    //增加
    int insert(Doctor record);
    //修改
    int updateByPrimaryKey(Doctor record);
}













