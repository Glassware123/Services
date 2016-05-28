package com.yildizapp.domain;

import javax.persistence.*;

@Entity
@Table(name="Fakulte")
public class FacultyService {
    @Id
    @Column(name = "FakulteID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer facultyId;

    @Column(name = "UniversiteID")
    public Integer universityId;

    @Column(name = "FakulteAdi")
    public String departmentName;

    public Integer getFacultyId() {
        return facultyId;
    }

    public void setFacultyId(Integer facultyId) {
        this.facultyId = facultyId;
    }

    public Integer getUniversityId() {
        return universityId;
    }

    public void setUniversityId(Integer universityId) {
        this.universityId = universityId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
