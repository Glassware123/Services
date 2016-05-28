package com.yildizapp.domain;

import javax.persistence.*;

@Entity
@Table(name="Kampus")
public class CampusService{
    @Id
    @Column(name = "KampusID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer campusId;

    @Column(name = "UniversiteID")
    public Integer universityId;

    @Column(name = "KampusAdi")
    public String campusName;

    public Integer getCampusId() {
        return campusId;
    }

    public void setCampusId(Integer campusId) {
        this.campusId = campusId;
    }

    public Integer getUniversityId() {
        return universityId;
    }

    public void setUniversityId(Integer universityId) {
        this.universityId = universityId;
    }

    public String getCampusName() {
        return campusName;
    }

    public void setCampusName(String campusName) {
        this.campusName = campusName;
    }
}
