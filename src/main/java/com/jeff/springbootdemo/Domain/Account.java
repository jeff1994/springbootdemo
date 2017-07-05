package com.jeff.springbootdemo.Domain;

public class Account {
    private Integer acId;

    private String acPrid;

    private String scSalary;

    public Integer getAcId() {
        return acId;
    }

    public void setAcId(Integer acId) {
        this.acId = acId;
    }

    public String getAcPrid() {
        return acPrid;
    }

    public void setAcPrid(String acPrid) {
        this.acPrid = acPrid == null ? null : acPrid.trim();
    }

    public String getScSalary() {
        return scSalary;
    }

    public void setScSalary(String scSalary) {
        this.scSalary = scSalary == null ? null : scSalary.trim();
    }
}