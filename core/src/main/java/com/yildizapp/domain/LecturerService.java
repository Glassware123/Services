package com.yildizapp.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class LecturerService {
    @Id
    @Column(name = "OgretimGorevlisiID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer lecturerId;

    @Column(name = "BolumID")
    public Integer departmentId;

    @Column(name = "Adi")
    public String name;

    @Column(name = "Soyadi")
    public String surname;

    @Column(name = "YarbisLink")
    public String yarbisLink;

    public Integer getLecturerId() {
        return lecturerId;
    }

    public void setLecturerId(Integer lecturerId) {
        this.lecturerId = lecturerId;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getYarbisLink() {
        return yarbisLink;
    }

    public void setYarbisLink(String yarbisLink) {
        this.yarbisLink = yarbisLink;
    }
}
