package com.neuedu.hospital.ServiceImpl;

import com.neuedu.hospital.mapper.DoctorMapper;
import com.neuedu.hospital.pojo.Doctor;
import com.neuedu.hospital.pojo.DoctorExample;
import com.neuedu.hospital.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorServiceImpl implements DoctorService {
    @Autowired
    private DoctorMapper doctorMapper;
    @Override
    public List<Doctor> selectAll() {
        DoctorExample doctorExample=new DoctorExample();
        DoctorExample.Criteria criteria=doctorExample.createCriteria();
        criteria.andDoctorIcertidIsNotNull();
        List<Doctor> list=doctorMapper.selectByExample(doctorExample);
        return list;
    }

    @Override
    public Doctor selectByPrimaryKey(Integer doctorId) {
        return doctorMapper.selectByPrimaryKey(doctorId);
    }

    @Override
    public List<Doctor> selectBydepartment(Integer department) {
        DoctorExample doctorExample=new DoctorExample();
        DoctorExample.Criteria criteria=doctorExample.createCriteria();
        criteria.andDoctorIdepartmentIsNotNull();
        List<Doctor> list= doctorMapper.selectBydepartment(department);
        return list;
    }

    @Override
    public Doctor selectByNmae(String name) {

        return doctorMapper.selectByNmae(name);
    }

    @Override
    public int insert(Doctor record) {
        return doctorMapper.insert(record);
    }

    @Override
    public int updateByPrimaryKey(Doctor record) {
        return doctorMapper.updateByPrimaryKey(record);
    }
}
