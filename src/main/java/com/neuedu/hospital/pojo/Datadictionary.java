package com.neuedu.hospital.pojo;

public class Datadictionary {
    private Integer datadictionaryId;

    private String type;

    private String value;

    private String name;

    public Datadictionary(Integer datadictionaryId, String type, String value, String name) {
        this.datadictionaryId = datadictionaryId;
        this.type = type;
        this.value = value;
        this.name = name;
    }

    public Datadictionary() {
        super();
    }

    public Integer getDatadictionaryId() {
        return datadictionaryId;
    }

    public void setDatadictionaryId(Integer datadictionaryId) {
        this.datadictionaryId = datadictionaryId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}