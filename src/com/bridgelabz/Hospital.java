package com.bridgelabz;

public class Hospital {
String hospitalName;
String hospitalId;

    public String getHospName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        hospitalName = hospitalName;
    }

    public String getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(String hospitalId) {
        this.hospitalId = hospitalId;
    }
    void hospitalDetails(String hospitalName, String hospitalId){
        this.hospitalId=hospitalId;
        this.hospitalName=hospitalName;
    }
}
