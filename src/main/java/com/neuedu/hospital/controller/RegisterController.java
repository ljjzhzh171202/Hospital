package com.neuedu.hospital.controller;

import com.neuedu.hospital.pojo.Patient;
import com.neuedu.hospital.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/register")
public class RegisterController {
    @Autowired
    PatientService patientService;

    @PostMapping("/patientRegister")
    @ResponseBody
    public String register(@RequestBody Patient patient){
        String patientName = patient.getPatientName();
        String patientCertid =  patient.getPatientCertid();
        String patientSex = patient.getPatientSex();
        String patientTel = patient.getPatientTel();
        String password = patient.getPassword();
        System.out.println("patientName" +":" + patientName +"," + "patientCertid " + ":" + patientCertid  + "," + " patientSex" +":" +  patientSex + "patientTel " + ":" + patientTel  + "password " + ":" + password);

        patient.setPatientName(patientName);
        patient.setPatientCertid(patientCertid);
        patient.setPatientSex(patientSex);
        patient.setPatientTel(patientTel);
        patient.setPassword(password);
        int result = patientService.insert(patient);
        if(result<=0){
            return "注册失败!";
        }
        return "注册成功!";
    }

    @RequestMapping("/fail")
    public String fail(){
        return "fail";
    }

    @RequestMapping("/checkName")
    @ResponseBody
    public String checkName(@RequestBody Patient patients){
        String patientname = patients.getPatientName();
        Patient patient = patientService.checkName(patientname);
        if(patient != null){
            return "该用户已被注册!";
        }else{
            return "该用户可注册!";
        }
    }
}
