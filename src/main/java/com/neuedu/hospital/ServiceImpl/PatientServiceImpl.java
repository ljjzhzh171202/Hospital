package com.neuedu.hospital.ServiceImpl;

import com.neuedu.hospital.mapper.PatientMapper;
import com.neuedu.hospital.pojo.Patient;
import com.neuedu.hospital.pojo.PatientExample;
import com.neuedu.hospital.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientServiceImpl  implements PatientService {
    @Autowired
    private PatientMapper patientMapper;
    @Override
    public int insert(Patient record) {
        return patientMapper.insert(record);
    }

    @Override
    public Patient checkName(String username) {
        PatientExample patientExample=new PatientExample();
        PatientExample.Criteria criteria=patientExample.createCriteria();
        criteria.andPatientNameEqualTo(username);
        List<Patient> list=patientMapper.selectByExample(patientExample);
        if(list.size()>0){
            return list.get(0);
        }
        return null;
    }
}
