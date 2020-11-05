package com.neuedu.hospital.service;

import com.neuedu.hospital.pojo.Patient;


public interface PatientService {
   //注册
    int insert(Patient record);
    //检查姓名是否重复
    public Patient checkName(String name);
    //查询所有
}
