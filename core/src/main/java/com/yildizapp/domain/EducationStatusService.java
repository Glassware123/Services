package com.yildizapp.domain;

import javax.persistence.*;

@Entity
@Table(name="OgrenimDurumu")
public class EducationStatusService {
    @Id
    @Column(name = "OgrenimID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer educationId;

    @Column(name = "OgrenimAdi")
    public String educationName;

    public Integer getEducationId() {
        return educationId;
    }

    public void setEducationId(Integer educationId) {
        this.educationId = educationId;
    }

    public String getEducationName() {
        return educationName;
    }

    public void setEducationName(String educationName) {
        this.educationName = educationName;
    }
}
