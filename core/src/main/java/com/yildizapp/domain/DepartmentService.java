package com.yildizapp.domain;

import javax.persistence.*;

@Entity
@Table(name="Bolum")
public class DepartmentService {
    @Id
    @Column(name = "BolumID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer departmentId;

    @Column(name = "FakulteID")
    public String facultyId;

    @Column(name = "BolumAdi")
    public String departmentName;

    @Column(name="BolumKodu")
    public String departmentCode;

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getFacultyId() {
        return facultyId;
    }

    public void setFacultyId(String facultyId) {
        this.facultyId = facultyId;
    }

    public String getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
