package com.zakary.dao;

import java.util.Date;

public class TreatmentDao {

    private String doctor_cert_code;
    private String patient_cert_code;
    private String treatment_name;
    private Date treatment_time;
    private Double treatment_fee;


    public String getTreatment_name() {
        return treatment_name;
    }

    public void setTreatment_name(String treatment_name) {
        this.treatment_name = treatment_name;
    }

    public Date getTreatment_time() {
        return treatment_time;
    }

    public void setTreatment_time(Date treatment_time) {
        this.treatment_time = treatment_time;
    }

    public Double getTreatment_fee() {
        return treatment_fee;
    }

    public void setTreatment_fee(Double treatment_fee) {
        this.treatment_fee = treatment_fee;
    }

    public String getDoctor_cert_code() {
        return doctor_cert_code;
    }

    public void setDoctor_cert_code(String doctor_cert_code) {
        this.doctor_cert_code = doctor_cert_code;
    }

    public String getPatient_cert_code() {
        return patient_cert_code;
    }

    public void setPatient_cert_code(String patient_cert_code) {
        this.patient_cert_code = patient_cert_code;
    }

    /*public Integer getCert_code() {
        return cert_code;
    }

    public void setCert_code(Integer cert_code) {
        this.cert_code = cert_code;
    }*/

}