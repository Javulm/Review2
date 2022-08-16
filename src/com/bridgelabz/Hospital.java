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
    String hospitalDetails(){
        System.out.println(hospitalName);
        System.out.println(hospitalId);

        public String toString(){
            return "Hospital Name=" + hospitalName + ", " + "Hospital Id=" + hospitalId;
        }

    }
}
