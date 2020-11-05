package com.neuedu.hospital.pojo;

public class Patient {
    private Integer patientId;

    private String patientName;

    private String patientCertid;

    private String patientSex;

    private String password;

    private String patientTel;

    public Patient(Integer patientId, String patientName, String patientCertid, String patientSex, String password, String patientTel) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.patientCertid = patientCertid;
        this.patientSex = patientSex;
        this.password = password;
        this.patientTel = patientTel;
    }

    public Patient() {
        super();
    }

    public Integer getPatientId() {
        return patientId;
    }

    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName == null ? null : patientName.trim();
    }

    public String getPatientCertid() {
        return patientCertid;
    }

    public void setPatientCertid(String patientCertid) {
        this.patientCertid = patientCertid == null ? null : patientCertid.trim();
    }

    public String getPatientSex() {
        return patientSex;
    }

    public void setPatientSex(String patientSex) {
        this.patientSex = patientSex == null ? null : patientSex.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getPatientTel() {
        return patientTel;
    }

    public void setPatientTel(String patientTel) {
        this.patientTel = patientTel == null ? null : patientTel.trim();
    }
}