package com.springboot.dubbointerface.bean;

import java.io.Serializable;

public class UserAdderss implements Serializable {

    private int id;
    private String name;
    private String address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public UserAdderss(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public UserAdderss() {
    }

    @Override
    public String toString() {
        return "UserAdderss{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
