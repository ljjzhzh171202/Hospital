package com.neuedu.hospital.pojo;

import java.util.Date;

public class Appointment {
    private Integer appointmentId;

    private Integer patientId;

    private Integer doctorId;

    private String ilness;

    private Date booktime;

    private Date createtime;

    private Integer status;

    public Appointment(Integer appointmentId, Integer patientId, Integer doctorId, String ilness, Date booktime, Date createtime, Integer status) {
        this.appointmentId = appointmentId;
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.ilness = ilness;
        this.booktime = booktime;
        this.createtime = createtime;
        this.status = status;
    }

    public Appointment() {
        super();
    }

    public Integer getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(Integer appointmentId) {
        this.appointmentId = appointmentId;
    }

    public Integer getPatientId() {
        return patientId;
    }

    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }

    public Integer getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }

    public String getIlness() {
        return ilness;
    }

    public void setIlness(String ilness) {
        this.ilness = ilness == null ? null : ilness.trim();
    }

    public Date getBooktime() {
        return booktime;
    }

    public void setBooktime(Date booktime) {
        this.booktime = booktime;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}