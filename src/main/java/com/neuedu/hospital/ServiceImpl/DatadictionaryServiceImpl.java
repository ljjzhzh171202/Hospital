package com.neuedu.hospital.ServiceImpl;

import com.neuedu.hospital.mapper.DatadictionaryMapper;
import com.neuedu.hospital.pojo.Datadictionary;
import com.neuedu.hospital.pojo.DatadictionaryExample;
import com.neuedu.hospital.service.DatadictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DatadictionaryServiceImpl implements DatadictionaryService {
    @Autowired
    private DatadictionaryMapper datadictionaryMapper;
    @Override
    public List<Datadictionary> selectAll() {
        DatadictionaryExample datadictionaryExample=new DatadictionaryExample();
        DatadictionaryExample.Criteria criteria=datadictionaryExample.createCriteria();
        criteria.andDatadictionaryIdIsNotNull();
        List<Datadictionary> list=datadictionaryMapper.selectByExample(datadictionaryExample);
        return list;
    }

    @Override
    public List<Datadictionary> selectBytype(String type) {
        DatadictionaryExample datadictionaryExample=new DatadictionaryExample();
        DatadictionaryExample.Criteria criteria=datadictionaryExample.createCriteria();
        criteria.andTypeIsNotNull();
        List<Datadictionary> list=datadictionaryMapper.selectBytype(type);
        return list;
    }

    @Override
    public Datadictionary selectByname(String name) {
        return datadictionaryMapper.selectByname(name);
    }

    @Override
    public int insert(Datadictionary record) {
        return datadictionaryMapper.insert(record);
    }

    @Override
    public int updateByPrimaryKey(Datadictionary record) {
        return datadictionaryMapper.updateByPrimaryKey(record);
    }


}
