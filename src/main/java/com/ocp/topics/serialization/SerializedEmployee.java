package com.ocp.topics.serialization;

import java.io.Serializable;

class SerializedEmployee implements Serializable {

    private String name;
    private String address;
    private transient int ssn;
    private final transient int ssn_id = 10;
    private static int number;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getSsn_id() {
        return ssn_id;
    }
}