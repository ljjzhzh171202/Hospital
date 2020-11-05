package com.neuedu.hospital.service;

import com.neuedu.hospital.pojo.Datadictionary;

import java.util.List;

public interface DatadictionaryService {
    //查询所有
    public List<Datadictionary> selectAll();
    //根据类型查询
    List<Datadictionary> selectBytype(String type);
    //根据名称查询
    Datadictionary selectByname(String name);
    //增加
    int insert(Datadictionary record);
    //修改
    int updateByPrimaryKey(Datadictionary record);
}
