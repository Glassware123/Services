package com.yildizapp.domain;

import javax.persistence.*;

@Entity
@Table(name="Universite")
public class UniversityService {
    @Id
    @Column(name = "UniversiteID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer universityId;

    @Column(name = "UniversiteAdi")
    public String universityName;

    public Integer getUniversityId() {
        return universityId;
    }

    public void setUniversityId(Integer universityId) {
        this.universityId = universityId;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }
}
