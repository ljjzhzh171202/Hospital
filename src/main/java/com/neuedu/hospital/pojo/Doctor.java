package com.neuedu.hospital.pojo;

import org.apache.ibatis.annotations.Arg;
import org.apache.ibatis.annotations.ConstructorArgs;
import org.apache.ibatis.type.JdbcType;

public class Doctor {
    private Integer doctorId;

    private String doctorIname;

    private String doctorIcertid;

    private String doctorIsex;

    private Integer doctorIdepartment;

    private String password;

    private String doctorTel;

    private Double doctorPrice;

    private String doctorItext;

    private String doctorImg;

    public Doctor(Integer doctorId, String doctorIname, String doctorIcertid, String doctorIsex, Integer doctorIdepartment, String password, String doctorTel, Double doctorPrice, String doctorItext, String doctorImg) {
        this.doctorId = doctorId;
        this.doctorIname = doctorIname;
        this.doctorIcertid = doctorIcertid;
        this.doctorIsex = doctorIsex;
        this.doctorIdepartment = doctorIdepartment;
        this.password = password;
        this.doctorTel = doctorTel;
        this.doctorPrice = doctorPrice;
        this.doctorItext = doctorItext;
        this.doctorImg = doctorImg;
    }

    public Doctor() {
    }

    public Integer getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }

    public String getDoctorIname() {
        return doctorIname;
    }

    public void setDoctorIname(String doctorIname) {
        this.doctorIname = doctorIname;
    }

    public String getDoctorIcertid() {
        return doctorIcertid;
    }

    public void setDoctorIcertid(String doctorIcertid) {
        this.doctorIcertid = doctorIcertid;
    }

    public String getDoctorIsex() {
        return doctorIsex;
    }

    public void setDoctorIsex(String doctorIsex) {
        this.doctorIsex = doctorIsex;
    }

    public Integer getDoctorIdepartment() {
        return doctorIdepartment;
    }

    public void setDoctorIdepartment(Integer doctorIdepartment) {
        this.doctorIdepartment = doctorIdepartment;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDoctorTel() {
        return doctorTel;
    }

    public void setDoctorTel(String doctorTel) {
        this.doctorTel = doctorTel;
    }

    public Double getDoctorPrice() {
        return doctorPrice;
    }

    public void setDoctorPrice(Double doctorPrice) {
        this.doctorPrice = doctorPrice;
    }

    public String getDoctorItext() {
        return doctorItext;
    }

    public void setDoctorItext(String doctorItext) {
        this.doctorItext = doctorItext;
    }

    public String getDoctorImg() {
        return doctorImg;
    }

    public void setDoctorImg(String doctorImg) {
        this.doctorImg = doctorImg;
    }
}