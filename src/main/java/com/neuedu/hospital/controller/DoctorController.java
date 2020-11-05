package com.neuedu.hospital.controller;


import com.neuedu.hospital.pojo.Doctor;
import com.neuedu.hospital.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/doctor")
public class DoctorController {
    @Autowired
    private DoctorService doctorService;
    //查询所有
    @RequestMapping("/getDoctorAll")
    @ResponseBody
    public List<Doctor> getDoctorAll(){
        List<Doctor> doctorList = doctorService.selectAll();
        return doctorList;
    }
    //根据ID查询
    @PostMapping("/selectById")
    @ResponseBody
    public Doctor selectById(@RequestBody Doctor doctor){
        Integer doctorId = doctor.getDoctorId();
        Doctor doctors=doctorService.selectByPrimaryKey(Integer.valueOf(doctorId));
        return doctors;
    }
    //根据姓名查询
    @PostMapping("/selectByName")
    @ResponseBody
    public Doctor selectByName(@RequestBody Doctor doctor){
        String doctorIname = doctor.getDoctorIname();
        Doctor doctors=doctorService.selectByNmae(String.valueOf(doctorIname));
        return doctors;
    }
    //根据部门查询
    @PostMapping("/selectBydepartment")
    @ResponseBody
    public List<Doctor> selectBydepartment(@RequestBody Doctor doctor){
        Integer doctorIdepartment = doctor.getDoctorIdepartment();
        List<Doctor> doctors= doctorService.selectBydepartment(Integer.valueOf(doctorIdepartment));
        return doctors;
    }
    //添加
    @PostMapping("/adddoctor")
    @ResponseBody
    public String adddoctor(@RequestBody Doctor doctor){
        String doctorIname = doctor.getDoctorIname();
        String doctorIcertid =doctor.getDoctorIcertid();
        String doctorIsex =doctor.getDoctorIsex();
        Integer doctorIdepartment =doctor.getDoctorIdepartment();
        String password =doctor.getPassword();
        String doctorTel =doctor.getDoctorTel();
        Double doctorPrice = doctor.getDoctorPrice();
        String doctorItext =doctor.getDoctorItext();
        String doctorImg =doctor.getDoctorImg();

        doctor.setDoctorIname(doctorIname);
        doctor.setDoctorIcertid(doctorIcertid);
        doctor.setDoctorIsex(doctorIsex);
        doctor.setDoctorIdepartment(doctorIdepartment);
        doctor.setPassword(password);
        doctor.setDoctorTel(doctorTel);
        doctor.setDoctorPrice(doctorPrice);
        doctor.setDoctorItext(doctorItext);
        doctor.setDoctorImg(doctorImg);
        int result = doctorService.insert(doctor);
        if(result<0){
            return "添加失败";
        }
        return "添加成功";
    }

    //修改
    @PostMapping("/updatedoctor")
    @ResponseBody
    public String updatedoctor(@RequestBody Doctor doctor){
        Integer doctorId = doctor.getDoctorId();
        String doctorIname = doctor.getDoctorIname();
        String doctorIcertid =doctor.getDoctorIcertid();
        String doctorIsex =doctor.getDoctorIsex();
        Integer doctorIdepartment =doctor.getDoctorIdepartment();
        String password =doctor.getPassword();
        String doctorTel =doctor.getDoctorTel();
        Double doctorPrice = doctor.getDoctorPrice();
        String doctorItext =doctor.getDoctorItext();
        String doctorImg =doctor.getDoctorImg();

        doctor.setDoctorIname(doctorIname);
        doctor.setDoctorIcertid(doctorIcertid);
        doctor.setDoctorIsex(doctorIsex);
        doctor.setDoctorIdepartment(doctorIdepartment);
        doctor.setPassword(password);
        doctor.setDoctorTel(doctorTel);
        doctor.setDoctorPrice(doctorPrice);
        doctor.setDoctorItext(doctorItext);
        doctor.setDoctorImg(doctorImg);

        int result = doctorService.updateByPrimaryKey(doctor);
        if(result<0){
            return "修改失败";
        }
        return "修改成功";
    }
}
